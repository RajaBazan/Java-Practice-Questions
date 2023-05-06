package Task;
import java.util.Scanner;
public class Calulator_Task_by_ifelse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first number:");
        double integer1 = sc.nextDouble();
        System.out.println("Enter your second number :");
        double integer2 = sc.nextDouble();
        System.out.println("Enter operator (+,-,*,/): ");
        char operator =sc.next().charAt(0);
        double result;
        if (operator == '+'){
            result = integer1 + integer2;
        } else if (operator == '-') {
            result = integer1 - integer2;

        } else if (operator == '*') {
            result = integer1 * integer2;
        } else if (operator == '/') {
            result = integer1/integer2;
        }
        else {
            System.out.println("Invalid operator");
            return;
        }
        System.out.println(integer1 + " " + operator + " " + integer2 + " = " + result);
    }
}
