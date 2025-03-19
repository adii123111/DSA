
import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {

        String firstname = "tosdfds fsdny";
        String lastname = "stark";
        if ((firstname.compareTo(lastname)) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

        String thename = firstname.substring(0);
        System.out.println(thename);

    }

}
