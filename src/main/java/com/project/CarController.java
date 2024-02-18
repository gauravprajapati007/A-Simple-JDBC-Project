package com.project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarController {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Project");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public void saveCar(Car car) {
		transaction.begin();
		manager.persist(car);
		transaction.commit();
	}
	
	public void update(double cost,int id) {
		Car car=manager.find(Car.class, id);
		car.setCost(cost);
		transaction.begin();
		manager.merge(car);
		transaction.commit();
	}
	public Car findById(int id) {
		Car car=manager.find(Car.class, id);
		return car;
	}
	public void deleteById(int id) {
		Car car=manager.find(Car.class, id);
		transaction.begin();
		manager.remove(car);
		transaction.commit();
	}
}
