package org.oa.zooshop.repository;

public class Create {

	public static void main(String[] args) {
		StorageRepositories repository = StorageRepositories.getInstance();
		repository.getInstance().destroy();
	}

}
