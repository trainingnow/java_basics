package assignment_basics;

// Question 16


public class FloydTriangle {
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
        for (int i= 1; i<= num; i++){
            System.out.println("* ".repeat(i));
        }
    }
}
