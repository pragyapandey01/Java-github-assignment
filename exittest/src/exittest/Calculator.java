package exittest;

	public class Calculator {


	    // Method to perform calculation based on the operator
	    public static double calculate(double num1, char operator, double num2) {
	        double result = 0;


	        try {
	            switch (operator) {
	                case '+':
	                    result = num1 + num2;
	                    break;
	                case '-':
	                    result = num1 - num2;
	                    break;
	                case '*':
	                    result = num1 * num2;
	                    break;
	                case '/':
	                    if (num2 == 0) {
	                        throw new ArithmeticException("Division by zero");
	                    }
	                    result = num1 / num2;
	                    break;
	                default:
	                    throw new IllegalArgumentException("Invalid operator: " + operator);
	            }
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	            return 0;
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	            return Double.NaN;
	        }


	        return result;
	    }



}
