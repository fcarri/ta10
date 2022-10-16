package project10;

import exceptionJava.MyException;

public class ta10_02 {
	public static void main(String[] args) {
		
		try {
						
			System.out.println("Mensaje mostrado por pantalla");
					
			throw new MyException();
			
		}catch (MyException ex) {
			
			
		}				
	
	}
	
	
}
