// unwaned content
public class Calculator {
	
	   public int add(int a, int b) {
		   System.out.println("Adding numbers...");
		   return a+b;
	   }
	   public int subtract(int a, int b) {
		   return a-b;
	   }
	   public int multiply(int a, int b) {
		   return a*b;
	   }
	   public int divide(int a, int b) {
		   return a/b;
	   }
	   public int modulus(int a, int b) {
		   return a%b;
	   }
	   public int power(int a, int b) {
		   return a^b;
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println("Sum: " + calc.add(5, 3));
		System.out.println("Diff: " + calc.subtract(5, 3));
		System.out.println("Multiply: " + calc.multiply(5, 3));
		System.out.println("Divide: " + calc.divide(4, 2));
		System.out.println("Modulus: " + calc.modulus(5, 2));
        System.out.println("Power: " + calc.power(5, 2));		
		System.out.println("add to create merge conflict");
	}

}
