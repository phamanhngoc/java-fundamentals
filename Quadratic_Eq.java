import java.util.Arrays;
import java.util.Scanner;

public class Quadratic_Eq {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Solve the Quadratic Equation: ax^2 + bx + c = 0");

        System.out.print("Enter Coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter Coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter Coefficient c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b,2) - (4*a*c);

        if (delta<0)
            System.out.println("No Real Roots");
        else if (delta==0) {
            double x = -b / (2 * a);
            System.out.println("One Real Root: " + x);
        }
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Two Real Roots");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }


    }
}
