
public class OctalArray {
	private int[] variables;
	
	public OctalArray(String inputs) {
		if(inputs.contains("9")) {
			throw new IllegalArgumentException("Input Integer can only contain digits from 0-7");
		}
		else if(inputs.contains("8")) {
			throw new IllegalArgumentException("Input Integer can only contain digits from 0-7");
		}
		else {
			this.variables = new int[inputs.length()];
		for(int i = (inputs.length()-1); i>=0; i--) {
			variables[(variables.length -i)-1] = Integer.parseInt(String.valueOf(inputs.charAt(i)));
		}
		}
	}
	
	public String toString() {
		String strVariables = "";
		for(int i =(variables.length-1); i>=0; i--) {
			strVariables += variables[i] + "";
		}
		return strVariables;
	}
	public int[] getVariables() {
		return variables;
	}

	public void setVariables(int[] variables) {
		this.variables = variables;
	}
	public int sizeVariables() {
	    return variables.length;
	}
	public int convertToDecimal() {
		int sum = 0;
		for(int i=0; i<variables.length; i++) {
			sum += variables[i]*Math.pow(8, i);
		}
		return sum;
	}
	public void setOctalArrayAtIndex(int index, int value) {
		if(index>=variables.length) {
			throw new IllegalArgumentException("Variables should be less than 8");
		}
		else {
			this.variables[index] = value;
		}
	}
	public int getOctalArrayAtIndex(int index) {
		if(index>=variables.length) {
			throw new IllegalArgumentException("Variables should be less than 8");
		}
		else {
			return variables[3];
		}
	
	}
}
