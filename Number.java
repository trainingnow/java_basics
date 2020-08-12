package assignment_basics;

// Has Question 1, Question 2



public class Number {
    public static int n = 10;

    public Number() {
    }

    public static void main(String[] var0) {
        value(n);
        System.out.println(oddEven(n));
    }

    public static void value(int var0) {
        if (var0 > 0) {
            System.out.println("Positive");
        } else if (var0 == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }

    }

    public static boolean oddEven(int var0) {
        return var0 % 2 == 0;
    }
}
