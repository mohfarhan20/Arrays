package MultiDimensi;
import java.util.*;
public class determinan {

    public static void InputArray3x3(int [][] Array3x3){

        Scanner s = new Scanner(System.in);
        int i,j;
        for (i=0;i<Array3x3.length;i++){
            for (j=0;j<Array3x3[i].length;j++){
                System.out.println(" Masukkan Nilai baris ke :"+(i+1)+" kolom "+(j+1));
                Array3x3 [i][j] = s.nextInt();
            }
        }
    }
    public static void PrintArray3x3(int [][] Array3x3,int D){

        int i,j,dUtama,dSamping;
        for (i=0;i<Array3x3.length;i++){
            System.out.print("|");
            for (j=0;j<Array3x3[i].length;j++){
                System.out.print(Array3x3 [i][j]+" ");
            }
            System.out.print("|\n");
        }
        dUtama = Array3x3[0][0]*Array3x3[1][1]*Array3x3[2][2]+Array3x3[1][0]
                *Array3x3[2][1]*Array3x3[0][2]+Array3x3[2][0]+Array3x3[0][1]+Array3x3[1][2];
        dSamping = Array3x3[0][2]*Array3x3[1][1]*Array3x3[2][0]+Array3x3[1][2]*Array3x3[2][1]*Array3x3[0][0]+
                Array3x3[2][2]*Array3x3[0][1]*Array3x3[1][0];
        D = dUtama-dSamping;
        System.out.println("Determinan adalah "+ D);
    }



    public static void InputArray2x2(int [][] Array2d){

        Scanner s = new Scanner(System.in);
        int i,j;
        for(i=0;i<Array2d.length;i++){
            for(j=0;j<Array2d[i].length;j++){
                System.out.println("Masukkan nilai baris ke:"+(i+1)+" kolom ke :"+(j+1));
                Array2d [i][j] = s.nextInt();
            }
        }
    }
    public static void PrintAray2x2(int [][] Array2d){

        int i,j,D;
        for (i=0;i<Array2d.length;i++){
            System.out.print("|");
            for (j=0;j<Array2d[i].length;j++){
                System.out.print(Array2d [i][j]+" ");
            }
            System.out.print("|\n");
        }

        D = Array2d[0][0]*Array2d[1][1]-Array2d[0][1]*Array2d[1][0];
        System.out.println("Determinan adalah "+ D);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pilihan;
        int[][] Array2d; int D;
        int [][]Array3x3;
        D=0;
        Array2d = new int[2][2];
        Array3x3 = new int[3][3];
        System.out.println(" Selamat Datang di Program menghitung determinan : ");

        System.out.println(" 1. Determinan Matriks 2x2 ");
        System.out.println(" 2. Determinan Matriks 3x3 ");
        System.out.println(" Masukkan Pilihan Anda : 1 atau 2 ");
        pilihan = s.nextInt();
        if (pilihan==1){
            InputArray2x2(Array2d);
            PrintAray2x2(Array2d);
        }
       else if (pilihan==2){
            InputArray3x3(Array3x3);
            PrintArray3x3(Array3x3,D);
        }
       else {
            System.out.println("OPSI TAK DITEMUKAN");
        }



    }
}
