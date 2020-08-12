package assignment_basics;

// Question 14



public class CheckPrime_2 {
    public static void main(String[] args){
        int num = 0;
        if (args.length == 1){
            try {
                num = Integer.parseInt(args[0]);
            }catch (NumberFormatException e) {
                System.err.println("Please enter an integer");
                System.exit(2);
            }
        } else {
            System.out.println("Check input arguments");
            System.exit(3);
        }
        if (num ==0 || num == 1){
            System.out.println(num+" is neither prime nor composite");
        } else if (num<0){
            System.out.println(num+" is negative");
        }else {
            if (CheckPrime_2.isPrime(num)){
                System.out.println(num+" is a prime number");
            } else {
                System.out.println(num+" is not a prime number");
            }
        }
    }
    public static boolean isPrime(int i){
        for (int j=2; j<i/2; j++){
            if (i%j == 0){
                return false;
            }
        }
        return true;
    }
}
