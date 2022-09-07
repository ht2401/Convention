import java.util.Scanner;

public class classifyStudy {
    public static void main(String[] args) {
        float mediumScore;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the score: ");
        mediumScore = sc.nextFloat();
        while (mediumScore < 0 || mediumScore > 10) {
            System.out.println("Invalid score");
            System.out.println("Please re-enter your score: ");
            mediumScore = sc.nextInt();
        }
        if (mediumScore >= 8) {
            System.out.println("Good standing!");
        } else if (mediumScore >= 6.5 & mediumScore < 8) {
            System.out.println("academic pretty");
        } else if (mediumScore >= 5 & mediumScore < 6.5) {
            System.out.println("learning capacity is average!");
        } else
            System.out.println("weak learning capacity!");
    }
}
