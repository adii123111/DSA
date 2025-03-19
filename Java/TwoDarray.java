import java.util.Scanner;

public class TwoDarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row no ");
        int row = sc.nextInt();
        System.out.println("enter the col no ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        System.out.println("the " + row + "row and " + col + "coloum matrix will be..");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output here
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("to find x put x here ");

        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("fond x on " + "(" + i + "," + j + ")");
                }
            }
        }

    }
}
