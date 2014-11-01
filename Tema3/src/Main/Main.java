package Main;

import clase_exceptii.MyException;
import Clase.automata;
import Clase.manuala;

public class Main {

	/**
	 * @param args
	 * @throws MyException 
	 */
	public static void main(String[] args) {
		manuala cazan=new manuala();
		cazan.accelerate();
		cazan.gear_down();
		cazan.gear_down();
		cazan.accelerate();
		automata benveu=new automata();
		benveu.accelerate();
	}

}
