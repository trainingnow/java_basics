package assignment_basics;

// Question 3


public class InputArgs {

    public static void main(String[] var0) {
        if (var0.length == 0) {
            System.out.println("No values");
        } else {
            for(int var1 = 0; var1 < var0.length - 1; ++var1) {
                System.out.print(var0[var1] + ",");
            }

            System.out.print(var0[var0.length - 1]);
        }

    }
}
