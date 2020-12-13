package pertemuan9;
import java.util.Scanner;
public class contohVarArray {
    public static void main(String[] args) {
        int a,b,c,d,e;
        float f = (float)0.0;
        Scanner s = new Scanner(System.in);

        System.out.println("inputkan nilai ke-1");
        a = s.nextInt();
        System.out.println("inputkan nilai ke-2");
        b = s.nextInt();
        System.out.println("inputkan nilai ke-3");
        c = s.nextInt();
        System.out.println("inputkan nilai ke-4");
        d = s.nextInt();
        System.out.println("inputkan nilai ke-5");
        e = s.nextInt();

        f = (float)(a+b+c+d+e) / 5;

        System.out.println("ke-1 yg diinputkan adalah "+a);
        System.out.println("ke-2 yg diinputkan adalah "+b);
        System.out.println("ke-3 yg diinputkan adalah "+c);
        System.out.println("ke-4 yg diinputkan adalah "+d);
        System.out.println("ke-5 yg diinputkan adalah "+e);
        System.out.println("rata-rata dari 5 buah bilangan adalah "+f);

    }
}
