package String;

public class _7_SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        //mutable
        //it is not creating same-same object but it's changeing same objects which was created

        System.out.println(builder.toString());
        System.out.println(builder.reverse());
    }
}
