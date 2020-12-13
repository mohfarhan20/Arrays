
import java.util.Arrays;

public class bapak {
    public static void main(String[] args) {
        char[] a = { 'B', 'O', 'T', 'A', 'K' };
        int l = a.length;
        int temp;
        for (int i = 0; i < l / 2; i++) {
            temp = a[i];
            a[i] = a[l - 1 - i];
            a[l - 1 - i] = (char) temp;

        }
        System.out.println(Arrays.toString(a));

    }
}
