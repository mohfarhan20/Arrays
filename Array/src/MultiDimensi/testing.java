package MultiDimensi;

import java.util.Scanner;

public class testing {
    public static void InputArray2x2(int[][] Array2d) {
        Array2d = new int[2][2];
        Scanner s = new Scanner(System.in);
        int i, j;
        for (i = 0; i < Array2d.length; i++) {
            for (j = 0; j < Array2d[i].length; j++) {
                System.out.println("Masukkan nilai baris ke:" + (i + 1) + " kolom ke :" + (j + 1));
                Array2d[i][j] = s.nextInt();
            }
        }
    }

    public static void PrintAray2x2(int[][] Array2d) {
        Array2d = new int[2][2];
        int i, j, D;
        for (i = 0; i < Array2d.length; i++) {
            System.out.print("|");
            for (j = 0; j < Array2d[i].length; j++) {
                System.out.print(Array2d[i][j] + " ");
            }
            System.out.print("|\n");
        }
    }

    public static void main(String[] args) {
        int [][] Array2d;
        Array2d = new int[2][2];

        InputArray2x2(Array2d);
        PrintAray2x2(Array2d);

    }
}
