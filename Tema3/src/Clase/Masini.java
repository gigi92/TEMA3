package Clase;

import Interfete.vehicule;

public abstract class Masini implements vehicule
{
	
	int speed;
	public abstract void start_engine();
	public abstract void stop_engine();
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
	public Masini(){
		speed=0;
	}
	public void gear_up(){
	}
	public void gear_down(){
	}
}
