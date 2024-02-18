# A-Simple-Hibernate-Project-Using-Persistence


# Project Report

# Project Overview:

Purpose: Creates a basic car management application using Java and JPA (Java Persistence API).
Functionality:
Stores and retrieves car information (brand, color, cost).
CRUD operations: Create, Read, Update, Delete individual car records.

# Code Structure:
Car.java: Entity class representing car objects.
Fields: brand, color, cost, number (ID, auto-generated).
Getters, setters, constructor, and toString() method.
CarController.java: Manages interactions with the database.
Methods: saveCar, update, findById, deleteById.
Creates EntityManagerFactory, EntityManager, and EntityTransaction objects.
CarView.java: Provides a text-based user interface.
Menu-driven system for CRUD operations.
Uses Scanner for user input.
Key Features:

Uses JPA to interact with a database (though the specific database is not specified in the code).
Basic CRUD functionality for car records.
Text-based user interface for user interactions.
