package Recursion;

public class recursion {
    // a function that calls itself is called recursion . and it is similar to iteration/loops .
    static int printstackheightlogn(int g1, int p1) {
        if (p1 == 0) {
            return 1;
        }
        if (p1% 2 == 0) {
            return printstackheightlogn(g1,p1/2) * printstackheightlogn(g1,p1/2);
        }
        else {
            return g1 * printstackheightlogn(g1,p1/2) * printstackheightlogn(g1, p1/2);
        }
    }
    static int printstackheight(int x, int p) {
        if (p == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpownm1 = printstackheight(x, p-1);
        int xpowxpown = x * xpownm1;
        return xpowxpown;
    }
    static void printfibseries(int a, int b, int s) {
        if (s==0){
            return;
        }
        int c= a+b;
        System.out.println(c);
        printfibseries(b,c,s-1);
    }
    static int calculatefactorial(int f) {
        if (f ==1 || f ==0){
            return 1;
        }
        int fact_nm1 = calculatefactorial(f-1);
        int fact_n = f* fact_nm1;
        return fact_n;
    }
    static void printsum(int i, int s, int sum) {
        if (i==s) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printsum(i+1, s, sum);
    }
    static  void printnumb(int n) {
        if (n==6) {
            return;
        }
        System.out.println(n);
        printnumb(n+1);
    }

    static int factorial_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int product =1;
            for (int i=1;i<=n;i++){
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x1 =5;
        System.out.println("The value of factorial x is : "+ factorial_iterative(x1));
        // print numbers from 1 to 5
        int n=1;
        printnumb(n);
        // print sum of first n natural number.
        printsum(1,10,0);
        // calculate factorial
        int f=10;
        int ans = calculatefactorial(f);
        System.out.println(ans);
        // print fibonacci series
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int s=20;
        printfibseries(a,b,s-2);
        // print x^n(stack height = n)
        int x=2;
        int p=5;
        int an = printstackheight(x,p);
        System.out.println(an);
        // print x^n(stack height = logn)
        int g1 =2;
        int p1=5;
        int output = printstackheight(g1,p1);
        System.out.println(output);
    }
}
