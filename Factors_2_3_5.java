package assignment_basics;

// Question 19



public class Factors_2_3_5 {
    public static void main(String[] args){
        int number = 0, i = 1;
        while (number < 5){
            if ((i%2 == 0) && (i%3 == 0) && (i%5 == 0)){
                System.out.println(i);
                i++;
                number++;
            } else {
                i++;
            }
        }
    }
}
