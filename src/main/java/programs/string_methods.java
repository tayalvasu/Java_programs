package programs;
import java.util.Scanner;
public class string_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // asking the string from the user
        System.out.println("Enter the string ");
        String name = sc.nextLine();
        System.out.print("The string is : ");
        System.out.println(name);
        // second way to declare a string
        // String name ="vasu";

        // string methods
        System.out.println("String Methods");
        // calculating the length of the string
        int value = name.length();
        System.out.println(value);
        // converting the string to lower
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        // converting the string to upper
        String uString = name.toUpperCase();
        System.out.println(uString);
        // trimming the string removes the spaces from the string
        String nonTrimmString = "                  VASU              ";
        System.out.println(nonTrimmString);

        String trimmedString =nonTrimmString.trim();
        System.out.println(trimmedString);
        // returns a substring from starts to the end
        System.out.println(name.substring(1));
        System.out.println(name.substring(0,4));
        //returns a new string after replacing a character to the other
        System.out.println(name.replace('v', 'u'));
        // returns true if name starts with string v in this case
        System.out.println(name.startsWith("v"));
        // returns true if name ends with string s in this case
        System.out.println(name.endsWith("s"));
        // with the help of char at we can  separately print all the characters of the string
        // 1st way
        System.out.println(name.charAt(0));
        // 2nd way
        for (int i=0; i<name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        // returns the index of the given string
        System.out.println(name.indexOf("l"));
        // returns the index of the given string starting from the index
        System.out.println(name.indexOf("a",1));
        // returns the last index of the given string
        System.out.println(name.lastIndexOf("a",1));
        // returns the last index of the given string before index
        System.out.println(name.equals("vasutayal"));
        // returns true if the given string is equal to vasu  false otherwise (case-sensitive)
        System.out.println(name.equalsIgnoreCase("VASU"));
        // returns true if two string are equal ignoring the case of characters
        System.out.println("I am escape sequence\tdouble quote");
        // Escape sequence characters

        // string concatenation
        String firstname = "vasu";
        String lastname = "tayal";
        String fullname =  firstname+" " + lastname;
        System.out.println(fullname);

        // compare two strings (case-sensitive)
        System.out.println("Enter 1st string");
        String name1 = sc.nextLine() ;
        System.out.println("Enter 2nd string");
        String name2 = sc.nextLine();
        if (name1.compareTo(name2)== 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
