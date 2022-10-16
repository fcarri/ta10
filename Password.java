package project10;

public class Password {
	private int longitud;
	private String password;
	boolean esFort;
	
	public Password() {
		this.longitud = 8;
		this.password = "";
	}
		
	public Password(int longitud) {		
		this.longitud = longitud;		
	}
	
	public String generaPassword(int longitud) {				                 				
		
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        
         
         StringBuilder sb = new StringBuilder(longitud);         
         
         for (int n = 0; n < longitud; n++) {
        	         
        	   //nombre aleatori a mode d'index
        	   int index = (int)(alfabet.length() * Math.random());        	   
        	 
        	   // afegir caracter al final de sb
        	   sb.append(alfabet.charAt(index));        	   
        	   sb.toString();
        	   
        }   
         //StringBuilder a String
         String password = sb.toString();
         return password;
	}

	public boolean esFuerte(String password) {						
		
		char ch;
		int maj = 0;
		int min = 0;
		int num = 0;				
				
		for (int n = 0; n < password.length(); n++) {
			ch = password.charAt(n);    
			if (Character.isUpperCase(ch)){
				maj = maj + 1;						
			}else if (Character.isLowerCase(ch)) {
				min = min + 1;							
			}else {
				num++;				
			}
		}
		
		if (maj > 2 && min > 1 && num > 5) {
			esFort = true;
		}else {
			esFort = false;
		}				
		
		return esFort;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}
	
	
	
}
