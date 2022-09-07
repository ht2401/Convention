import java.util.Scanner;
public class checkNegativeNumber {
    public static void main(String[] args){
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter integer : ");
        number= sc.nextInt();
        while (number == 0) {
            System.out.println("invalid number");
            System.out.println(" please re-enter the number : ");
            number= sc.nextInt();
        }
        if (number > 0) {
            System.out.println("is a positive integer");
        }
        else
            System.out.println("is a negative integer");
    }
}