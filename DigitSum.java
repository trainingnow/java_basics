package assignment_basics;

// Question 15



public class DigitSum {
    public static void main(String[] args){
        int n = 267;
        System.out.println(DigitSum.sumDigits(n));

    }
    static int sumDigits(int num){
        int sum = 0;
        while(num != 0){
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }
}
