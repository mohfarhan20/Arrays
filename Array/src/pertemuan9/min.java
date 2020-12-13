package pertemuan9;

import java.util.*;

public class min {
    public static void main(String[] args) {
        int minimum, jumlah, i, array[];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        jumlah = scan.nextInt();
        array = new int[jumlah];

        System.out.println("Masukkan "+jumlah+" angka");
        for(i = 0; i < jumlah; i++) {
            System.out.print("Elemen ke-"+ (i+1) +": " );
            array[i] = scan.nextInt();
        }
        // BARIS DIATAS BERFUNSI UNTUK :
        // melakukan perulangan sebanyak nilai variable jumlah untuk menginputkan nilai kedalam index variable array.

        minimum = array[0];
        // inisialisasi variable maksimum dengan nilai variable array pada inde ke 0.
        for(i = 0; i < jumlah; i++) {
            if (array[i] <   minimum){
                minimum = array[i];

            }
        }
        // mengulang sebanyak nilai variabel untuk membandingkan atau menentukan nilai maksimum
        System.out.println("Nilai minimum adalah "+   minimum);

    }
}
