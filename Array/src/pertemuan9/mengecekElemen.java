package pertemuan9;
import java.util.*;
public class mengecekElemen {
    public static void main(String[] args) {
        int n, i, Array1[], Array2[];

        String pernyataan ="SAMA";

        Scanner userInput = new Scanner(System.in);

        System.out.println(" Masukkan jumlah elemen larik  : ");
        n = userInput.nextInt();

        Array1 = new int[n];
        Array2 = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            Array1[i] = userInput.nextInt();

        }
        System.out.println(" Elemen larik pertama adalah : ");
        System.out.println(Arrays.toString(Array1));



        for (i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            Array2[i] = userInput.nextInt();
        }
        System.out.println(" Elemen larik keuda adalah : ");
        System.out.println(Arrays.toString(Array2));

        for (i = 0; i < n; i++) {
            if (Array2[i]!=Array1[i]) {
                pernyataan = "BEDA";
        }

        }

        System.out.println("\nHasil Perbandingan : Array pertama dan kedua "+ pernyataan);
    }
}
