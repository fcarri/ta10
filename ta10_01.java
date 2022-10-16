package project10;

import java.util.Random;
import java.util.Scanner; 
import java.util.InputMismatchException;  

public class ta10_01 {
	public static void main(String[] args) {
				
        Random rand = new Random(); 
          
        int rand1 = rand.nextInt(500);        
        //System.out.println(rand1);
        
        Scanner sc = new Scanner(System.in);
		
		try {
													
			int numero = 0;
			int n = 0;
			
			while (numero != rand1) {
				
				System.out.println("Numero: ");
				numero = sc.nextInt();				
				n++;
				
				if (numero > rand1) {
					System.out.println("El numero tiene que ser mas pequeño");
				}else if (numero < rand1) {
					System.out.println("El numero tiene que ser mas grande");
				}else if (numero == rand1) {
					System.out.println("Has necesitado "+n+" intentos para acertar");
				}
			}
		
			
		}catch(InputMismatchException e){
			System.out.println("No se ha reconocido la entrada");
		}
        
		sc.close();
	}
}
