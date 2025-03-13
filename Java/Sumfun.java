import java.util.Scanner;

public class Sumfun {
    
    public static int Calculate(int a, int b){
        int sum = a+b;
        return sum;
    }
    
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = Calculate(a, b);
        System.out.println("the sum of two number will be " + sum );



    }

    
}
