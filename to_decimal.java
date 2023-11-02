package JAVAHW1;
public class to_decimal {
    public static void main(String[] args) {
        int binary = 101;
        int decimal = 0;
        int p = 0;
        while (binary != 0) {
            int temp = binary % 10;
            decimal += temp * Math.pow(2, p);
            binary /= 10;
            p++;
        }
        System.out.println(decimal);
    }
}
