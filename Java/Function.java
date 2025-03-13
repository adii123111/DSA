import java.util.Scanner;
import java.util.*;

public class Function {
    public static void Printmyname(String name) {
        System.out.println(name);
        return;
    }

    public static void Lastname(String Lname) {
        System.out.println(Lname);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = sc.next();

        Scanner scw = new Scanner(System.in);
        System.out.println("Enter your Last name");

        String Lname = scw.next();

        System.out.println("your fulll name is......... ");
        Printmyname(name);
        Lastname(Lname);

    }
}
