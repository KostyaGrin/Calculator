import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Operators operators = new Operators();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first value: ");
        operators.setA(scanner.nextDouble());
        System.out.println("Please enter the second value: ");
        operators.setB(scanner.nextDouble());
        System.out.println("Choice the operator: +, -, *, /: ");
        String operator;
        scanner.nextLine();
        operator = scanner.nextLine();
        switch (operator){
            case "+":
                operators.add();
                break;
            case "-":
                operators.subtract();
                break;
            case "*":
                operators.multiply();
                break;
            case "/":
                operators.divide();
                break;
        }


    }
}
