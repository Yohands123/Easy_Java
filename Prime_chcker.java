package JAVAHW1;
import java.util.Scanner;
public class Prime_chcker {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        if (n==2){
            System.out.println("prime");
        }else{
            while (i<n){
                if (n%i==0){
                    System.out.println("not prime"+" as it was divisible by "+i);
                    break;
                }
                i++;
            }
            System.out.println("prime");


        }
        sc.close();
        }

    
}
