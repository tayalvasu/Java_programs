package Recursion;

import java.util.Scanner;

public class SOD {
    static int sod(int n){
        if(n>=0 && n<=9) return n;
        return sod(n/10) + n%10;
//        int smallAns = sod(n/10);
//
//        return smallAns + n%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = sc.nextInt();
        System.out.println(sod(12345));
    }
}
