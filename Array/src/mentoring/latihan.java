package mentoring;
import java.util.*;
public class latihan {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        char [] a;
        char [] b;
        a = new char[5];
        b = new char[5];

        System.out.println(" Masukkan 5 buah char : ");
        for (int i=0;i<a.length;i++){
            System.out.println(" Masukkan char "   + a[i]);
            a [i] = userInput.next().charAt(0);

        }
        System.out.println(" Hasilnya : "+ Arrays.toString(a));

        System.out.println(" Dipindahkan ke B :  ");

        for (int i=0;i<b.length;i++){

            b [i] = a [i];

            System.out.print(b[i]);

        }


    }
}
