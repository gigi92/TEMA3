package e214b.puica.main;


import e214b.puica.clase.AutomaticCar;
import e214b.puica.clase.ManualCar;

public class Main {

	public static void main(String[] args) {
		ManualCar cazan=new ManualCar();
		cazan.accelerate();
		cazan.gearDown();
		cazan.gearUp();
		
		cazan.accelerate();
		AutomaticCar benveu=new AutomaticCar();
		benveu.accelerate();
	}

}
