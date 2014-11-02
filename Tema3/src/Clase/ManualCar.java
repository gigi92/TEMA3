package Clase;
import Clase.Car;
import ClaseExceptii.MyException;
//clasa pentru masina cu cutie manuala
public class ManualCar extends Car {
	private int gear;
	
	public int getGear() {
		return gear;
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	}
	public ManualCar(){
		setGear(0);
	}
	public void gearUp(){
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
	
	public void gearDown(){
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
	public void startEngine(){
		if(gear!=0)
		{
			System.out.println("Scoateti masina din viteza");
		}
		
	}
	public void stopEngine(){
		System.out.println("Engine Stopped");
	}
}
