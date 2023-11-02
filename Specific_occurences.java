package JAVAHW1;
public class Specific_occurences {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println(count);
    }
}
