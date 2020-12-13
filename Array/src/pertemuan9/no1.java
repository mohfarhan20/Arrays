package pertemuan9;

import java.util.Arrays;

public class no1 {
    public static void main(String[] args) {


        float a = 2.005f;
        int b;
        b = (int) a;
        System.out.println(b);

        int A[] = {1, 2, 3};
        System.out.println(A[0]);
        System.out.println(Arrays.toString(A));

        int B[] = new int[4];
        System.out.println("-----------------");
        String[] nama = {"Linda", "Santi", "Susan", "Mila", "Ayu"};
        for (int o = 0; o < nama.length; o++) {
            System.out.println("Indeks ke - " + o + " : " + nama[o]);

            System.out.println("-----------------");

        }
        int W[] = new int[4];
        W[0] = 154;
        System.out.println(W[0]);
        System.out.println(" -.---..---.-.-.-..-.-..-");
        String name[] = {" andi", " budi ", " joko"};

        for (int indek = 0; indek < 3; indek++) {
            System.out.println(name[indek]);
        }
    }
}
