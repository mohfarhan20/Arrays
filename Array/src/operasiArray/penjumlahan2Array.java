package operasiArray;
import java.util.*;
public class penjumlahan2Array {
    public static void main(String[] args) {
        int i;
        int [] array1 = {4,9,6,1,10,7,8};
        int [] array2 = {4,15,16,7,28,3,2};
        int [] hasil = new int [array1.length];


        System.out.println(" !==== PENJUMLAHAN 2 BUAH ARRAY ====! ");
        System.out.println();
        System.out.println("Array Angka 1 : "+ Arrays.toString(array1));
        System.out.println("Array Angka 2 : "+ Arrays.toString(array2));

        for (i=0;i<array1.length;i++){
            hasil [i]= array1 [i] + array2 [i];
        }
        System.out.println("Array Hasil   : "+ Arrays.toString(hasil));

        System.out.println(" !==== MENGGABUNGKAN 2 BUAH ARRAY ====! ");
        System.out.println();
        int [] hasil2 = new int [array1.length + array2.length];

        for ( i = 0; i < array1.length; i++){
            hasil2[i] = array1[i];
        }

        for ( i = 0; i < array2.length; i++){
            hasil2[i + array1.length] = array2[i];
        }

        System.out.println("Array Angka 1 : "+ Arrays.toString(array1));
        System.out.println("Array Angka 2 : "+ Arrays.toString(array2));
        System.out.println("Array Hasil   : "+ Arrays.toString(hasil2));

        System.out.println(" !==== MENGURUTKAN ARRAY DARI YANG TERKECIL  ====! ");
        System.out.println();
        System.out.println("Array Angka 1 : "+ Arrays.toString(array1));
        System.out.println("Array Angka 2 : "+ Arrays.toString(array2));
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println("Array Angka 1 menjadi : "+ Arrays.toString(array1));
        System.out.println("Array Angka 2 menjadi : "+ Arrays.toString(array2));

        System.out.println(" !==== MENUKAR POSISI DEPAN - BELAKANG  ====! ");
        int [] arrayBuffer= Arrays.copyOf(array1,array1.length);

        System.out.println("Array Angka 1 : "+ Arrays.toString(array1));

        for ( i=0; i<array1.length;i++){
            array1 [i] = arrayBuffer [(arrayBuffer.length-1)-i];
        }

        System.out.println("Array Angka 1 menjadi : "+ Arrays.toString(array1));

        System.out.println("Array Angka 2 : "+ Arrays.toString(array2));

        int [] arrayBuffer2= Arrays.copyOf(array2,array2.length);


        for ( i=0; i<array2.length;i++){
            array2 [i] = arrayBuffer2 [(arrayBuffer2.length-1)-i];
        }
        System.out.println("Array Angka 2 menjadi : "+ Arrays.toString(array2));

        }
    }

