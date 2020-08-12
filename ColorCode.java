package assignment_basics;
// Question 8


public class ColorCode {


    public static void main(String[] args){
        String code = "u";
        String color;
        switch(code){
            case "B": color = "Blue";
                break;

            case "R": color = "Red";
                break;

            case "G": color = "Green";
                break;
            case "O": color = "Orange";
                break;
            case "Y": color = "Yellow";
                break;
            case "W": color = "White";
                break;
            default: color = "Invalid Code";
                break;
        }
        System.out.println(color);


    }



}
