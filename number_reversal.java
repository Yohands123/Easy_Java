package JAVAHW1;
import java.util.Scanner;
import java.lang.Math;
public class number_reversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int copy = n;
        double special=0;
        int count=0;
        

        while(copy>0){
            copy=copy/10;
            count++;

        }
        while(n>0){
            special=(n%10)*(Math.pow( 10,count-1))+special;
            n=n/10;
            count--;
        }
        System.out.println(special);
        sc.close();

    }

}
