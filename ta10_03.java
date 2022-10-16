package project10;

import java.util.Random;
import java.util.Scanner;

public class ta10_03 {
	public static void main(String[] args) {
		
		 Random rand = new Random();     
		 System.out.println("Generando numero aleatorio...");
	     int rand1 = rand.nextInt(999);
	     System.out.println("El numero generado es: "+rand1);
	     Scanner sc = new Scanner(System.in);
	     
	     try {
	    	 
	    	 if(rand1 % 2 == 0) {
	    		 System.out.println("Es par");
	    	 }else if (rand1 % 2 != 0) {
	    		 System.out.println("Es impar");
	    	 }
	    	 
	     }catch(Exception e){
	    	 System.out.println("Excepcion: "+e.getMessage());
	     }
	     
	     sc.close();
	}
}
