package String;

public class _6_Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
//            System.out.println(ch);
            series = series + ch; // series += ch
        }

        System.out.println(series);
    }
}
