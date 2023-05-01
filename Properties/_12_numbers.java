package Properties;

public class _12_numbers {
    double sum(double a, int b) {
        return a + b;
    }

    double sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        _12_numbers obj = new _12_numbers();

        obj.sum(2, 3);
        obj.sum(2.5, 3);
        obj.sum(1, 3, 7);

//        obj.sum(4, 5, 6, 8);
    }
}
