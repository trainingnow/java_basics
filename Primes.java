package assignment_basics;

// Question 13



public class Primes {
    public static void main(String[] args){
        int low = 10, high = 99;
        for (int i = low; i<= high; i++){
            if (Primes.isPrime(i)){
                System.out.print(i+"\t");
            }
        }

    }
    public static boolean isPrime(int i){
        for (int j = 2; j< i/2; j++){
            if (i%j == 0){
                return false;

            }
        }
        return true;
    }
}
