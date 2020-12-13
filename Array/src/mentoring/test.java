package mentoring;
import java.util.*;
public class test {
    public static void main(String[] args) {
        int i,j,n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai N : ");
        n = sc.nextInt();

        for (i=0;i<n;i++){
            for (j=0;j<=i;j++){
                if (i%2==0){
                    System.out.print("*");
                }
                else {
                    System.out.print("#");
                }
            }System.out.println();
        }

    }

}
