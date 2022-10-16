package project10;

import javax.swing.JOptionPane;

public class MainPasswordApp {
	public static void main(String[] args) {
		
		Password pass = new Password();
		
		//array de passwords
		String nPass = JOptionPane.showInputDialog("Número de passwords: ");
		Integer noPass = Integer.parseInt(nPass);
		String[] arrayNoPasswords = new String[noPass];		

		//longitud del password
		String lon = JOptionPane.showInputDialog("Longitud password: ");
		Integer lngPass = Integer.parseInt(lon);  	
		
		//array false or true
		boolean[] arrayB = new boolean[lngPass];
		
		try {
			
			for (int n = 0; n < noPass; n++) {
				arrayNoPasswords[n] = new String();  	
				String password = pass.generaPassword(lngPass);	
				arrayNoPasswords[n] = password;
				arrayB[n] = pass.esFuerte(password);	
			}			
			
			for (int n = 0; n < noPass; n++) {
				JOptionPane.showMessageDialog(null, " "+arrayNoPasswords[n]+"  "+arrayB[n]);	
				System.out.println(arrayNoPasswords[n]+"  "+arrayB[n]);
			}
			
		}catch(Exception e) {
						
			JOptionPane.showMessageDialog(null, "Exception: "+e.getMessage());	
		}
		
		
			
					
		
	}
}
