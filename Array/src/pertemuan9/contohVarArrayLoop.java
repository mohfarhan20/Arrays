package pertemuan9;
import java.util.Scanner;
public class contohVarArrayLoop {
    public static void main(String[] args) {
        int i, n=5;
        int[] a = new int[5];
        float f = (float)0.0;
        Scanner s = new Scanner(System.in);

        for(i=0; i<n; i++) {
            System.out.println("inputkan nilai ke-"+(i+1));
            a[i] = s.nextInt();
            f = f + (float)a[i];
        }

        f = f / n;

        for(i=0; i<n; i++) {
            System.out.println("ke-"+(i+1)+" yg diinputkan adalah "+a[i]);
        }
        System.out.println("rata-rata dari "+n+" buah bilangan adalah "+f);

    }
}
