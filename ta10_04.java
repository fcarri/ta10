package project10;

import javax.swing.JOptionPane;

public class ta10_04 {
	
	public void execute(){
				
		try {						

			int op1 = 0;
			int op2 = 0;
			String signe = JOptionPane.showInputDialog("Introdueix operació +,-,*,/,^,r2,r3: ");			
			
			if (signe.equals("r2")) {												
				op2 = 2;
				String nl1 = JOptionPane.showInputDialog("Radicando: ");	
				op1 =Integer.parseInt(nl1);
			}else if (signe.equals("r3")){
				op2 = 3;
				String nl1 = JOptionPane.showInputDialog("Radicando: ");
				op1 =Integer.parseInt(nl1);
			}else {
				String nl1 = JOptionPane.showInputDialog("Introdueix primer operand: ");
				op1 =Integer.parseInt(nl1);
				String nl2 = JOptionPane.showInputDialog("Introdueix segon operand: ");		
				op2 =Integer.parseInt(nl2);
			}									
			
			switch(signe) {
			case "+":				
				double suma = op1 + op2;
				JOptionPane.showMessageDialog(null, op1+" + "+op2+" = "+suma);
				break;
			case "-":				
				double resta = op1 - op2;
				JOptionPane.showMessageDialog(null, op1+" - "+op2+" = "+resta);
				break;
			case "*":				
				double mult = op1 * op2;
				JOptionPane.showMessageDialog(null, op1+" * "+op2+" = "+mult);
				break;
			case "/":				
				double div = op1 / op2;
				JOptionPane.showMessageDialog(null, op1+" / "+op2+" = "+div);
				break;
			case "^":				
				double pot = Math.pow(op1, op2);
				JOptionPane.showMessageDialog(null, op1+" ^ "+op2+" = "+pot);
				break;
			case "r2":				
				double r2 = Math.sqrt(op1);
				JOptionPane.showMessageDialog(null, "Raiz cuadrada de "+op1+"= "+r2);
				break;
			case "r3":				
				double r3 = Math.pow(op1, (double)1/3);
				JOptionPane.showMessageDialog(null, "Raiz cubica de "+op1+"= "+r3);
				break;			
			default:
				
		}
			
		}catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "Exception: "+e.getMessage());			
			
		}
				
		
	}
}
