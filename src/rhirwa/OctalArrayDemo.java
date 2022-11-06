package rhirwa;

public class OctalArrayDemo {

	public static void main(String[] args) {
		OctalArray octal = new OctalArray(args[0]);
		
		System.out.println("This octal number: "+octal.toString()+" represents: "+octal.convertToDecimal()+ " in decimal");
		
		octal.setOctalArrayAtIndex(3, 3);
		
		System.out.println("Now the octal number is: "+octal.toString()+" represents: "+octal.convertToDecimal()+ " in decimal");
		
		System.out.println("The third digit from last: "+octal.getOctalArrayAtIndex(args[0].length() - 3));
	}

}
