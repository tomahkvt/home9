package org.oa.zooshop.repository;

import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.oa.zooshop.model.Animal;
import org.oa.zooshop.model.AnimalType;

import java.util.List;

public class AnimalTypeRepository {

	private final SessionFactory sessionFactory;

	public AnimalTypeRepository(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void create(AnimalType item) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(item);
		session.getTransaction().commit();
	}

	public void update(AnimalType item) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.update(item);
		session.getTransaction().commit();
	}

	public void delete(AnimalType item) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.delete(item);
		session.getTransaction().commit();
	}

	public List<AnimalType> findAll() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query query = session.createQuery("FROM AnimalType");
		List<AnimalType> result = query.list();

		session.getTransaction().commit();
		return result;
	}
}
