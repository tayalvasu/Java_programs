package programs;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        int num = 100;

        // while loop to print natural numbers from 100 to 200
        while (num <= 200) {
            System.out.println(num );
            num++;
        }



        Scanner sc = new Scanner(System.in);
        int a;

        // ask user for input
        System.out.println("Enter the value of a:");
        a = sc.nextInt();

        int i = 1;

        // do-while loop to print first n natural numbers
        do {
            System.out.println(i);
            i++;
        } while (i <= a);

        System.out.println("ending of do while loop");





        // ask user for input
        System.out.println("Enter the value of o:");
        int o= sc.nextInt();



        // for loop to print first n odd number
        for (i=0;i<=o;i++) {
            System.out.println(2*i+1);
        }
    }
}
