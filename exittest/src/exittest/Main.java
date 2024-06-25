package exittest;

public class Main { 
    public static void main(String[] args) {
       if (args.length != 3) {
           System.out.println("Usage: java Calculator <num1> <operator> <num2>");
            System.exit(1);
       }
          Calculator calculator=new Calculator();

        try {
            double num1 = Double.parseDouble(args[0]);
            char operator = args[1].charAt(0);
            double num2 = Double.parseDouble(args[2]);


            double result = calculator.calculate(num1, operator, num2);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }
}








