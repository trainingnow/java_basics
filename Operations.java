package assignment_basics;
// Question 20



import java.util.*;

public class Operations {

    public static boolean continue_operations(Scanner in){
        System.out.println("Do you want to continue? y/n");
        char c = in.next().charAt(0);
        c = Character.toLowerCase(c);
        return c == 'y';

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose from 1. Add\t2. Subtract");
            choice= input.nextInt();
            switch(choice){
                case 1: System.out.println("Enter two numbers");
                    int num1 = input.nextInt(), num2 = input.nextInt();
                    System.out.println("Result is "+ (num1+num2));
                    break;
                case 2: System.out.println("Enter two numbers");
                    int num3 = input.nextInt(), num4 = input.nextInt();
                    System.out.println("Result is "+ (num3-num4));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }
        } while (continue_operations(input));
    }
}
