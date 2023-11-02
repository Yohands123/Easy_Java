package JAVAHW1;
public class palindrome_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1 };
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
