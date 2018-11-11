package com.rodpeng.springbootjdbc.demo;

public class Car {
	private int id;
	private String make;
	private String model;
	private int year;

	public Car(int id, String make, String model, int year) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public int getId() {
		return id;
	}
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + "]";
	}
}
