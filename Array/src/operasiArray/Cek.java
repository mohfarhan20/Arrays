package operasiArray;
import java.util.*;
public class Cek {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []array ={1,2,3,4,5,6,7};
        int data = s.nextInt();
        int gas=0;
        for (int i=0;i<array.length;i++){
            if (array[i]==data){
                System.out.println("Data ada dan ketemu pada data ke : "+(i+1));
                break;
            }
            else{
                gas ++;
            }
        }
            if(gas==7){
                System.out.println("not found");
            }
        }
    }

