package String;

import java.util.Scanner;

public class _11_Mario {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            String str=s.next();
            String s1 = str.substring(0,n/2);
            String s2 = str.substring(n/2, n);
            if (s1.equals(s2)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }


    }
}
