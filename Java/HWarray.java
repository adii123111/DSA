import java.util.Scanner;

public class HWarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        String name[] = new String[x];

        for(int i=0; i<x; i++){
           name[i]=sc.next();
        }

        for(int i =0; i<name.length;i++){
            System.out.println("name " + (i+1) +" is : " + name[i]);        }
        
    }
}
