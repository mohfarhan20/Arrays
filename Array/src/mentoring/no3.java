package mentoring;
import java.util.*;
public class no3 {
    public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
            int n,i,j;
            int [] ArrayPertama;
            int [] ArrayKedua;
            int pilihan;
            int [] hasil;

            System.out.println(" Masukkan Panjang Array : ");
            n = userInput.nextInt();

            ArrayPertama = new int[n];
            ArrayKedua = new int [n];
            hasil = new int [n];

        for (i=0;i<n;i++){

            System.out.println(" Bilangan indek ke - "+i+" Array Pertama adalah ");
            ArrayPertama [i] = userInput.nextInt();
        }
        System.out.println(" Array Pertama : " + Arrays.toString(ArrayPertama));

        for (i=0;i<n;i++){

            System.out.println(" Bilangan indek ke - "+i+" Array Kedua adalah ");
            ArrayKedua [i] = userInput.nextInt();
        }
        System.out.println(" Array Kedua : " + Arrays.toString(ArrayKedua));


        System.out.println(" Masukkan pilihan operasi : \n pil(1) atau pil (2) ");
        pilihan = userInput.nextInt();

        if (pilihan==1){
            for (i=0;i<n;i++) {
                hasil[i] = ArrayPertama[i] + ArrayKedua[i];

            }
            System.out.println(" Hasil "+ Arrays.toString(hasil));
        }
        else if (pilihan==2){
            for (i=0;i<n;i++) {
                hasil[i] = ArrayPertama[i] - ArrayKedua[i];



            }
            System.out.println(" Hasil "+ Arrays.toString(hasil));
        }
        else {
            System.out.println("PILIHAN ANDA SALAH");
        }

    }
}
