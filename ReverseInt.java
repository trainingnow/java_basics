package assignment_basics;

// Question 17



public class ReverseInt {
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
        int new_num = 0;
        while (num != 0){
            new_num = (new_num * 10) + (num %10);
            num = num/10;
        }
        System.out.println(new_num);
    }
}
