import java.util.Scanner;

public class Multifun {

    public static int Multifuntion(int a, int b ){
        int ans = a*b;
        return ans;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = Multifuntion(a, b);
        System.out.println("the product of two no will be " + ans);
    }
}
