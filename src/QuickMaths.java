
public class QuickMaths {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 8;
		
		String symbol = "%";
		
		if (symbol == "+") {
			System.out.println("the addition of "+num1 +" and "+num2 +" is "+(num1+num2));
		} 
		else if (symbol == "-") {
			System.out.println("the subtraction of "+num1 +" and "+num2 +" is "+(num1-num2));
		}
		else if (symbol == "*") {
			System.out.println("the multiplication of "+num1 +" and "+num2 +" is "+(num1*num2));
		}
		else if (symbol == "/" && num1 > num2 && num2 != 0) {
			System.out.println("the division of "+num1 +" and "+num2 +" is "+((float)num1/num2));
		}
		else if (symbol == "/" && num1 < num2) {
			System.out.println("WARNING: First number is less than second number");
		}
		else if (symbol == "/" && num2 == 0) {
			System.out.println("You divided by zero and the universe implodes, we hope you're happy");
		}
		else if (symbol == "%") {
			System.out.println("the modulus of "+num1 +" and "+num2 +" is "+(num1%num2));
		} 
		else System.out.println("Error");
		
		
		
	}

}
