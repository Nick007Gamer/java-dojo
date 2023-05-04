package calculadora;

public class Calculadora implements java.io.Serializable {

	public Calculadora() {
		
	}
	
	public double performOperation(double op1, String operation, double op2) {
		if(operation.equals("+")) {
			return op1+op2;
		}else if(operation.equals("-") ) {
			return op1-op2;
		}
		return 0;
		
		
	}
	
	public int getResult() {
		return 1;
	}
	
	
	
}
