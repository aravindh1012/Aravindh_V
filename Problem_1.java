import java.util.Scanner;

public class Problem_1{
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = scan.nextDouble();
        System.out.print("Enter value of b: ");
        double b = scan.nextDouble();
        scan.nextLine(); 
        System.out.print("enter operation (add, subtract, multiply, divide): ");
        String operation = scan.nextLine();
        scan.close();
        Calculator calculator = new Calculator(a, b, operation);
        String result = calculator.calculate();
        System.out.println(result);
    }

}


class Calculator {
    private double a;
    private double b;
    private String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public String calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return "result: " + (a + b);
            case "subtract":
                return "result: " + (a - b);
            case "multiply":
                return "result: " + (a * b);
            case "divide":
                if (b != 0) {
                    return "result: " + (a / b);
                } else {
                    return "error: division by zero is not allowed.";
                }
            default:
                return "error: select any operation.";
        }
    }
}