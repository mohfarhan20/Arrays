package pertemuan9;
import java.util.*;
public class kopi {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n,i,j;
        int [] ArrayPertama;
        int [] ArrayKedua;

        System.out.println(" Masukkan jumlah elemen : ");
        n = userInput.nextInt();
        ArrayPertama = new int[n];

        for (i=0;i<n;i++){

            System.out.println(" Bilangan indek ke - "+i+" adalah ");
            ArrayPertama [i] = userInput.nextInt();
        }
        System.out.println(" Array Pertama adalah : "+ Arrays.toString(ArrayPertama));

        System.out.println(" Dikopi ke Array kedua menjadi : ");
        System.out.println(" Array kedua : ");

        ArrayKedua  = new int[n];

        for (i=0;i<n;i++){
            ArrayKedua[i] = ArrayPertama[i];
        }
        System.out.println(Arrays.toString(ArrayKedua));

        System.out.println(" lOKASI MEMORI ARRAY 1 : "+ ArrayPertama);
        System.out.print(" lOKASI MEMORI ARRAY 2 : "+ ArrayKedua);


    }
}
