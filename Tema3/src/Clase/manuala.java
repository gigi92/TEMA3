package Clase;
import Clase.Masini;
import clase_exceptii.MyException;

public class manuala extends Masini {
	private int gear;
	
	public int getGear() {
		return gear;
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	}
	public manuala(){
		setGear(0);
	}
	public void gear_up(){
		try{
			if(gear>6){
			throw new MyException("Ati ajuns deja in treapta maxima de viteza");
			}
			else
			{
			setGear(getGear()+1);
			System.out.println("Ati urcat pana in treapta "+gear);
			}
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
}
	
	public void gear_down(){
		try{
		if(gear<0){
			throw new MyException("Nu se poate schimba in treapta -2");
		}
		else
		{
			setGear(getGear()-1);
			System.out.println("Ati coborat pana in treapta "+gear);
		}
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
		
		
	}
	public void start_engine(){
		
	}
	public void stop_engine(){
		
	}
}
