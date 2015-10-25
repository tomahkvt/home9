package org.oa.zooshop.repository;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.sun.org.apache.regexp.internal.recompile;

public class StorageRepositories {
	private SessionFactory sessionFactory;
	private AnimalRepository animalRepository;
	private AnimalTypeRepository animalTypeRepository;
	
	private static class Holder {
		private static StorageRepositories INSTANCE = new StorageRepositories();
	}

	public static StorageRepositories getInstance() {
		return Holder.INSTANCE;
	}

	private StorageRepositories() {

		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {

			System.err.println("Initial SessionFactory creation failed." + ex);

			throw new ExceptionInInitializerError(ex);
		}
		this.animalRepository = new AnimalRepository(sessionFactory);
		this.animalTypeRepository = new AnimalTypeRepository(sessionFactory);
	}

	public AnimalRepository getAnimalRepository(){
		return animalRepository;
	}
	
	public AnimalTypeRepository getAnimalTypeRepository(){
		return animalTypeRepository;
	}
	
	public void destroy() {
		sessionFactory.close();
	}
}
