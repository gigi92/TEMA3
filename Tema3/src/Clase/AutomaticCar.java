package Clase;
import Clase.Car;
//clasa pentru masini cu cutie automata
public class AutomaticCar extends Car {
	/*pentru ca felul in care pornesti si opresti o masina automata de un manuala
	a dus la o diferentiere a metodelor*/
	public void startEngine(){
		System.out.println("Engine started");
	}
	public void stopEngine(){
		System.out.println("Engine stopped");
	}
}
