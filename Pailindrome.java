package JAVAHW1;
public class Pailindrome {
    public static void main(String[] args) {
        String s="abba";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("Pailindrome");
        }
        else{
            System.out.println("Not Pailindrome");
        }
    }
    
}
