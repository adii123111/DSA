import java.util.Scanner;

public class Arrayfind {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int size = sc.nextInt();

        int number[] = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search in the array:");
        int x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("The number " + x + " is found at index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("The number " + x + " is not found in the array.");
        }

        sc.close(); // Close the scanner
    }
}
