package assignment_basics;
// Question 4, Question 5, Question 7




public class OrderChars {
    public static char c1 = 'e';
    public static char c2 = 'k';
    public static char check = '1';
    public static void main(String[] args){
        if (c1 < c2){
            System.out.println(c1+","+c2);
        } else {
            System.out.println(c2+","+c1);
        }
        OrderChars.checkChar(check);
        OrderChars.invertChar(c1);
    }
    public static void checkChar(char c){
        if  ((c>='a' && c<='z') || (c>='A' && c<= 'Z')){
            System.out.println("Alphabet");


        } else if (c>='0' && c<= '9'){
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
    public static void invertChar(char ch1){
        char ch2 = (Character.isLowerCase(ch1)) ? Character.toUpperCase(ch1) : Character.toLowerCase(ch1);
        System.out.println(ch1+" --> "+ ch2);
    }
}
