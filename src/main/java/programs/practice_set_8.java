package programs;
class employee1 {
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
}
class cellphone {
    public void ringing(){
        System.out.println("ringing......");
    }
    public void vibrating(){
        System.out.println("vibrating......");
    }
}
class square {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter() {
        return 4*side;
    }
}
class tommy {
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("running from the enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
}
public class practice_set_8 {
    public static void main(String[] args) {
        // problem 1
        employee1 vasu = new employee1();
        vasu.setname("vasu tayal");
        System.out.println(vasu.getName());
        vasu.salary =5000;
        System.out.println(vasu.getSalary());

        // problem 2 create a class cellphone with methods to print "ringing" , "vibrating" etc.
        cellphone oppo = new cellphone();
        oppo.vibrating();
        oppo.ringing();

        // problem 3 create a class square with a method to initialize its side,calculating area , perimeter etc.
        square sq =new square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        // problem 4
        tommy player1 = new tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
