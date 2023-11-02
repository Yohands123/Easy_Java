package JAVAHW1;
public class greatest_common_divisor {
    public static void main(String[] args) {
        int a = 35;
        int div=1;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                div=i;
            }
        System.out.println(div);
        }
    }
}
