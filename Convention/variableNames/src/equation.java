import java.util.Scanner;

import static java.lang.Math.pow;

public class equation {
    public static void main(String[] args) {
        float a, b, c, x1, x2, delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficient a : ");
        a = scanner.nextFloat();
        System.out.print("Enter the coefficient b: ");
        b = scanner.nextFloat();
        System.out.print("Enter the coefficient c: ");
        c = scanner.nextFloat();
        System.out.println("The quadratic equation you just entered has the form: " + a + "x^2 + " + b + "x + " + c + " = 0");
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has no solution!");
            } else {
                System.out.println("Equation has 1 solution: " + "x = " + (-c / b));
            }
        } else {
            delta = (float) (pow(b, 2) - 4 * a * c);
            if (delta < 0) {
                System.out.println("The equation has no solution!");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Equation has 1 solution: " + x1);
            } else {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Equation has 2 solution : x1 = " + x1 + " và x2 = " + x2);
            }
        }
    }
}
