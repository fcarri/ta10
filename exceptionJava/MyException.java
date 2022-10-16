package exceptionJava;

public class MyException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private int codigoEx;
	
	public MyException() {
		super();
	}
	
	public MyException(int codigoError) {
		super();
		this.codigoEx = codigoError;
	}
	
	@Override
	public String getMessage() {
		
		String message = "";
		
		switch (codigoEx){
		case 1:
			message = "Exception 1";
			break;
		case 2:
			message = "Exception 2";
			break;		
		}
		
		return message;
	}
}
