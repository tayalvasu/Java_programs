package programs;

public class methods {
    // creating a method or function in which we defined logic to perform the particular task again and again and we can call that method by their name in our program
    static int logic(int x, int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z= (x+y)*5;
        }
        x=566;
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        // in this method invocation we don't  need to use static keyword in the  function that we have created for the logic
        //Method invocation using Object creation
        // methods obj =new methods();
        //c= obj.logic(a,b);
        c= logic(a,b);
        System.out.println(a+ " "+b);
        int a1=2;
        int b1=1;
        int c1;
        c1= logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
