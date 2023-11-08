package guess_number;
import java.util.Scanner;
import java.util.Random;
class Game{
    public int number;
    public  int inputnumber;
    public int noofguesses=0;
    public int getNoofguesses() {
        return noofguesses;
    }
    public void setNoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeuserinput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }
    boolean iscorrectnumber() {
        noofguesses++;
        if (inputnumber==number) {
            System.out.format("yes you guessed it right, it was %d\nyou guessed it in %d attempts",number,noofguesses);
            return  true;
        }
        else if (inputnumber<number) {
            System.out.println("Too low...");
        } else if (inputnumber > number) {
            System.out.println("Too high....");
        }
        return  false;
    }
}
public class guess_number {
    public static void main(String[] args) {
         /*
        create a class game which allows a user to play " guess the number"
        game once. game should have the following methods:
        1. constructor to generate the random number
        2. takeuserinput() to take a user input of number
        3. iscorrectnumber() to detect whether the number entered by the user is true
        4.  getter and setter for noofguesses
        use properties such as noofguesses(int), etc. to get this task done!
         */
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeuserinput();
            b=g.iscorrectnumber();
        }
    }
}
