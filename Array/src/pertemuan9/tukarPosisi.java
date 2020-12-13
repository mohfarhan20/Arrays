package pertemuan9;

public class tukarPosisi {
    public static void main(String[] args) {
        //array awal yang ingin diubah urutannya
        char [] a={'B','O','T','A','K'};
        //array untuk menampung hasil urutan
        char[] r=new char[a.length];
        //perulangan untuk mengubah urutan
        for(int i=0;i<a.length;i++){
            //membuat variabel bantu untuk menampung
            int temp;
            //temp menampung nilai terakhir dari array a
            temp=a[a.length-i-1];
            //mengassign nilai temp ke array b dengan index i
            r[i]= (char) temp;
        }
        //print array a
        System.out.println("array awal");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        //print array b
        System.out.println("\narray akhir");
        for(int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }
    }
}
