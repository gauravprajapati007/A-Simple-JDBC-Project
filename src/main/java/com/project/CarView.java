package com.project;

import java.util.Scanner;

public class CarView {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CarController car = new CarController();
		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter 1. to Save\n 2. to Update\n 3. to Find\n 4.to Delete \n 5. to FetchAll\n 6. to Exit");

			int option = sc.nextInt();

			switch (option) {
			case 1: {
				System.out.println("Enter the Car Name : ");
				String name = sc.next();
				System.out.println("Enter the Car Color : ");
				String color = sc.next();
				System.out.println("Enter the Car Cost : ");
				double cost = sc.nextDouble();
				Car c = new Car(name, color, cost);
				car.saveCar(c);
				break;
			}
			case 2: {
				System.out.println("Enter the Car Id to be Updated : ");
				int id = sc.nextInt();
				System.out.println("Enter the Car Cost to be Updated : ");
				double cost = sc.nextDouble();
				car.update(cost, id);
				break;
				
			}
			case 3: {
				System.out.println("Enter the id of the Car to be Fetched : ");
				Car fetched=car.findById(sc.nextInt());
				System.out.println(fetched);
				break;
			}
			case 4:{
				System.out.println("Enter the id of the Car to be Fetched : ");
				car.deleteById(sc.nextInt());
				System.out.println("Deleted the record Successfully!!!");
				break;
			}
			case 6: {
				System.out.println("/nThank you!!!!!!!!!!!!!!!!!!!!!!!!!");
				flag=false;
				break;
			}
			default:
				break;
			}

		}
	}
}
