import java.util.Scanner;

public class MinMaxArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int s = sc.nextInt(); // Array size

        int number[] = new int[s];

        System.out.println("Enter " + s + " numbers:");
        for (int i = 0; i < s; i++) {
            number[i] = sc.nextInt();
        }

        // Correct initialization
        int max = Integer.MIN_VALUE; // Start with smallest possible int
        int min = Integer.MAX_VALUE; // Start with largest possible int

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i]; // Update max if a larger value is found
            }
            if (number[i] < min) {
                min = number[i]; // Update min if a smaller value is found
            }
        }

        System.out.println("Smallest number is " + min);
        System.out.println("Largest number is " + max);
        
        sc.close(); // Close Scanner
    }
}
