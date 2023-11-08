package calculator;
import java.util.Scanner;

public class percentage_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your accounts marks : ");
        int accounts = scan.nextInt();
        System.out.println("Enter your Economics marks : ");
        int Economics = scan.nextInt();
        System.out.println("Enter your business studies marks : ");
        int business_studies = scan.nextInt();
        System.out.println("Enter your Mathematics marks : ");
        int mathematics = scan.nextInt();
        System.out.println("Enter your Computer Science marks : ");
        int computer = scan.nextInt();

        float percentage = ((accounts + Economics + business_studies + mathematics + computer)/500.0f)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);
    }
}
