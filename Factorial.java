package JAVAHW1;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int factorial =sc.nextInt();
        int result=1;
        for(int i=1;i<=factorial;i++){  
            result=result*i;
        }
        System.out.println(result);
        sc.close();
    }

}
