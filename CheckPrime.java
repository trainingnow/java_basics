package assignment_basics;

// Question 12



public class CheckPrime {
    public static void main(String[] args){
        int num = 2399;
        int half = num/2; // Half is used because the highest factor could only be of form
        boolean check = true;  // 2 * n
        for (int i = 2; i< half; i++){
            if (num%i == 0){
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}
