package pertemuan9;
import java.util.*;
public class latian1 {
    public static void main(String[] args) {
        int i, n;
        int[] a;
        System.out.print(" Masukkan nilai N : ");
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        a = new int[n];


        for(i=0; i<n; i++) {
            System.out.println("inputkan nilai ke-"+(i+1));
            a[i] = s.nextInt();

        }



    }
}
