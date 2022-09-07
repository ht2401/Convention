import java.util.Scanner;

public class ancientMath {
    public static void main(String[] args) {
        int totalFoot, totalChildren;
        Scanner sc = new Scanner(System.in);
        System.out.println("totalChildren : ");
        totalChildren = sc.nextInt();
        while (totalChildren < 0) {
            System.out.println("Invalid input");
            System.out.println(" totalChildren : ");
            totalChildren = sc.nextInt();
        }
        System.out.println("totalFoot : ");
        totalFoot = sc.nextInt();
        while (totalFoot < 0 && totalFoot % 2 != 0) {
            System.out.println("Invalid input");
            System.out.println("totalFoot : ");
            totalFoot = sc.nextInt();
        }
        int a = 2 * totalChildren, b = totalFoot;
        if (a > b)
            System.out.println("Invalid input");
        else if (a == b) {
            System.out.println("number of chicken  " + a);
            System.out.println("number of dogs : " + b / 2);
        } else {
            if ((b - a) % 2 != 0)
                System.out.println("Invalid input");
            else {
                System.out.println("number of dogs : " + (b - a) / 2);
                System.out.println("number of chicken : " + (totalChildren - (b - a) / 2));
            }
        }
    }
}
