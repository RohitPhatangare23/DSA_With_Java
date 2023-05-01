package String;

public class _10_ReverseString {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("abcba");
       StringBuilder rev=str.reverse();
       if (str.equals(rev)){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not Palindrome");
       }


    }
}
