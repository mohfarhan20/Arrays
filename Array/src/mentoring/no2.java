package mentoring;
import java.util.*;
public class no2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n,i,j;
        int [] ArrayPertama;
        int [] ArrayKedua;

        System.out.println(" Masukkan jumlah elemen : ");
        n = userInput.nextInt();

        ArrayPertama = new int[n];
        ArrayKedua = new int [n];


        for (i=0;i<n;i++){

            System.out.println(" Bilangan indek ke - "+i+" adalah ");
            ArrayPertama [i] = userInput.nextInt();
        }
        System.out.println(" Array Pertama adalah : "+ Arrays.toString(ArrayPertama));

        System.out.println(" Array 2 : ");


        for (i=0;i<n;i++){
            ArrayKedua [i] = ArrayPertama [i] * ArrayPertama[i];
            System.out.println(ArrayKedua[i]);
        }



    }
}
