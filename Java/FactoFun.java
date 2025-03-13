import java.util.Scanner;

public class FactoFun {
    public static void Factorial(int n) {
        if (n < 0) {
            System.out.println("Inavalid input");
            return;
        }
        int a = 1;
        for (int i = n; i >= 1; i--) {
            a = a * i;
        }
        System.out.println("the factorial is " + a);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Factorial(n);
    }
}
