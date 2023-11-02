package JAVAHW1;
import java.lang.Math;
public class armstrong {
    public static void main(String[] args) {
        int n =153;
        int copy=n;
        int special=n;
        double sum=0;
        int count=0;
        while(copy!=0){
            copy=copy/10;
            count++;
        }
        while(n!=0){
            int rem=n%10;
            sum=sum+Math.pow(rem,count);
            n=n/10;



        }
        if(special==sum){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}

