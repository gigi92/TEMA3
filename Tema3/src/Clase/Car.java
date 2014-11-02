package Clase;

import Interfete.Vehicle;
//Clasa abstracta pentru Car
public abstract class Car implements Vehicle
{
	
	int speed;
	public abstract void startEngine();
	public abstract void stopEngine();
	@Override
	//metoda generala pentru a frana o masina
	public void brake() {
		// TODO Auto-generated method stub
		speed--;
		System.out.println("Am franat");
	}

	@Override
	//metoda generala pentru a accelera o masina
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
