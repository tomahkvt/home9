package org.oa.zooshop.main;

import org.oa.zooshop.model.Animal;
import org.oa.zooshop.model.AnimalType;
import org.oa.zooshop.repository.StorageRepositories;

public class Create {

	public static void main(String[] args) {
		StorageRepositories repository = StorageRepositories.getInstance();
		
		AnimalType animalType = new AnimalType("Кот");
		repository.getAnimalTypeRepository().create(animalType);
		System.out.println(animalType.getId());
		Animal animal = new Animal(animalType, "самка");
		repository.getAnimalRepository().create(animal);
		repository.getInstance().destroy();
	}

}
