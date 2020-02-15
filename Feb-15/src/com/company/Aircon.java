package com.company;

public class Aircon {

	
	 double hp;
	int thermostat;
	String brand;

	public Aircon(double hp, int thermostat, String brand) {
		this.hp = hp;
		this.thermostat = thermostat;
		this.brand = brand;
		 
	}

	 void Swing(String direction) {
		System.out.println("This Aircon is swinging to the " + direction);
		
	}

	void changeTemp(int temp) {
		System.out.println("The temperature of this aircon is " + temp );
	}

	public double getHp() {
		return this. hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public int getThermostat() {
		return this.thermostat;
	}

	public void setThermostat(int thermostat) {
		this.thermostat = thermostat;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}



	}

