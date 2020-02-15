package com.company;

public class TestCar {

	public static void main(String[] args) {
Car encap = new Car(349,"Lamborghini",220);
System.out.println("Object : encap");
System.out.println("This car can travel " + encap.getKm() + "km in an hour");
System.out.println("This has a speed of " + encap.getVelocity() + "mph");

System.out.println("The car's brand name is " + encap.getBrand());
	

	}

}
