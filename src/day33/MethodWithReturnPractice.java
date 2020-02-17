package day33;

public class MethodWithReturnPractice {

    public static void main(String[] args) {

        System.out.println(getDaysOfTheWeekFromNumber(2));
        System.out.println(getDaysOfTheWeekFromNumber(8));
        System.out.println(getDaysOfTheWeekFromNumber(5));

        System.out.println();

        int[] numbers = {1, 4, 6, 7, 2};
        for (int i = 0; i <= numbers.length-1 ; i++) {
            System.out.println(getDaysOfTheWeekFromNumber(numbers[i]));
        }
    }

    public static String getDaysOfTheWeekFromNumber(int dayCode){

        String day = "";
        switch (dayCode){
            case 1:                       // case1:
                day = "Monday";           // return "Monday";    -->  this is work also, but do not use brake!!!
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Fun day";
                break;
        }

        return day;
    }


}

     // another way to do it
//case 1:
//        return "Monday";
//        case 2:
//        return "Tuesday";
//        case 3:
//        return "Wednesday";
//        case 4:
//        return "Thursday";
//        case 5:
//        return "Friday";
//        case 6:
//        return "Saturday";
//        case 7:
//        return "Sunday";
//default:
//        return "FUNDAY!";
//
