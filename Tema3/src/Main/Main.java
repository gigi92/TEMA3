package Main;

import Clase.AutomaticCar;
import Clase.ManualCar;

public class Main {

	public static void main(String[] args) {
		ManualCar cazan=new ManualCar();
		cazan.accelerate();
		cazan.gearDown();
		cazan.gearDown();
		cazan.accelerate();
		AutomaticCar benveu=new AutomaticCar();
		benveu.accelerate();
	}

}
