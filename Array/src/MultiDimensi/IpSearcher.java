package MultiDimensi;
import java.util.*;
public class IpSearcher {
    public static void main(String[] args) {
        int []JumlahMk = new int [7];

        int []NilaiAngka = new int [7];
        NilaiAngka [0]=89;
        NilaiAngka [1]=94;
        NilaiAngka [2]=96;
        NilaiAngka [3]=97;
        NilaiAngka [4]=97;
        NilaiAngka [5]=88;
        NilaiAngka [6]=90;

        char []NilaiHuruf = new char[7];
        NilaiHuruf[0]='A';
        NilaiHuruf[1]='A';
        NilaiHuruf[2]='A';
        NilaiHuruf[3]='A';
        NilaiHuruf[4]='A';
        NilaiHuruf[5]='A';
        NilaiHuruf[6]='A';

        int []sks = new int[7];
        sks [0]=3;
        sks [1]=3;
        sks [2]=3;
        sks [3]=3;
        sks [4]=3;
        sks [5]=2;
        sks [6]=2;
        int Totalnilai;
        Totalnilai=0;
        for (int i=0;i<NilaiAngka.length;i++){
            Totalnilai = Totalnilai+NilaiAngka[i];
        }
        System.out.println("Total Nilai adalah :"+Totalnilai);

        float Ip;
        Ip = (Totalnilai/7);
        System.out.println("Rata - rata nilai "+Ip);
        float Ipjadi = Ip/25;
        System.out.println("Ip semester:" + Ipjadi);





    }
}
