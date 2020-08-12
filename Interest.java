package assignment_basics;
// Question 6



public class Interest {

    public static void main(String[] args) {
        if (args.length <= 0 || args.length > 2) {
            System.out.println("Check the input arguments");
        } else {
            int age = Integer.parseInt(args[1]);
            if (args[0].toLowerCase().equals("female")) {

                if (age >= 1 && age <= 58) {
                    System.out.println("Interest is 8.2%");
                } else if (age > 58 && age <= 120) {
                    System.out.println("Interest is 7.6%");
                } else {
                    System.out.println("Check the age");
                }

            } else if (args[0].toLowerCase().equals("male")) {

                if (age >= 1 && age <= 60) {
                    System.out.println("Interest is 9.2%");
                } else if (age > 60 && age <= 120) {
                    System.out.println("Interest is 8.3%");
                } else {
                    System.out.println("Check the age");
                }

            } else {
                System.out.println("Check the gender");
            }
        }
    }
}
