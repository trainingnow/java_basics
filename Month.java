package assignment_basics;

// Question 9



public class Month {
    public static void main(String[] args){
        int num = 0;
        if (args.length > 0){
            try {
                num = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Please enter the month in numbers");
                System.exit(2);
            }
            Month.intToMonth(num);
        } else if (args.length == 0){
            System.out.println("Please enter the month in numbers");
        }




    }
    public static void intToMonth(int num){
        String month;
        switch(num){
            case 1: month = "January";
                break;
            case 2:  month = "February";
                break;
            case 3:  month = "March";
                break;
            case 4:  month = "April";
                break;
            case 5:  month = "May";
                break;
            case 6:  month = "June";
                break;
            case 7:  month = "July";
                break;
            case 8:  month = "August";
                break;
            case 9:  month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
            default: month = "Invalid month";
                break;
        }
        System.out.println(month);
    }
}
