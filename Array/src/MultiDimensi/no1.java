package MultiDimensi;
import java.util.*;
public class no1 {
    // m kali n dibuat
    // m dan n dari keyboard
    // m dan n diisi
    // sout hasil
    // susun seperti bapak
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int i,j,baris,kolom;
        System.out.println(" Masukkan Jumlah Baris : ");
        baris = userInput.nextInt();
        System.out.println(" Masukkan Jumlah Kolom : ");
        kolom = userInput.nextInt();
        int [][] Array2D = new int[baris][kolom];


        for (i=0;i<baris;i++){
            for (j=0;j<kolom;j++){
                System.out.println(" Baris indek ke - "+i+" kolom indek ke - "+j);
                Array2D [i][j] = userInput.nextInt();
            }

        }



        for ( i = 0; i < baris; i++) {
            System.out.print("|");
        for ( j = 0; j < kolom; j++) {
            System.out.print(Array2D[i][j] + ",");
        }
            System.out.print("|\n");
    }
    }
}
