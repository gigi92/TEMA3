package Clase;

import Interfete.Vehicle;

public abstract class Car implements Vehicle
{
	
	int speed;
	public abstract void startEngine();
	public abstract void stopEngine();
	@Override
	public void brake() {
		// TODO Auto-generated method stub
		speed--;
		System.out.println("Am franat");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		speed++;
		System.out.println("Am accelerat");
	}
	public Car(){
		speed=0;
	}
	public void gearUp(){
	}
	public void gearDown(){
	}
}
