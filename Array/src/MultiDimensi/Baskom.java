package MultiDimensi;
import java.util.*;
public class Baskom {
    public static void main(String[] args) {
        int i,j;
        System.out.println("=====  Array 2 dimensi cara manual ==== ");
        int [][] ArrayAnka1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.deepToString(ArrayAnka1));

        System.out.println("=====  Array 2 dimensi cara deklarasi ==== ");
        int [][] ArrayAnka2 = new int [4][3];
        System.out.println(Arrays.deepToString(ArrayAnka2));

        System.out.println("=====  Array 2 dimensi cara looping ==== ");

        for (i=0;i<ArrayAnka2.length;i++){
            for (j=0;j<ArrayAnka2[i].length;j++){
                System.out.print(ArrayAnka2[i][j]+",");

            }
        }



    }
}
