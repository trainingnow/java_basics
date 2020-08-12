package assignment_basics;

// Question 18



public class Palindrome {
    static int reverse(int i){
        if (i<0){
            return 0;
        } else{
            int num = 0;
            while (i!= 0){
                num = (num*10)+(i%10);
                i = i/10;
            }
            return num;
        }

    }
    public static void main(String[] args){
        int num = 0;
        if (args.length == 1){
            try {
                num = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Please enter valid number");
                System.exit(2);
            }
        } else if (args.length == 0){
            System.out.println("Please enter an integer number");
            System.exit(3);
        } else {
            System.out.println("Please enter one number");
            System.exit(4);
        }
        if (reverse(num) == num){
            System.out.println(num+" is a palindrome");
        } else {
            System.out.println(num+" is not a palindrome");
        }
    }
}
