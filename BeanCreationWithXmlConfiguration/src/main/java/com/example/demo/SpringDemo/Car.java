package com.example.demo.SpringDemo;

public class Car {
	
	Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getEngineData() {
		return engine.name;
	}

	
}
