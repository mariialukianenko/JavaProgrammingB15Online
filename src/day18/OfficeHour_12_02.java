package day18;

public class OfficeHour_12_02 {
    public static void main(String[] args) {

        String item = "Echo dot (3rd Gen) speaker with Alexa";
        //get whatever is inside parenthesis

        System.out.println(item.substring(item.indexOf("(")+1, item.indexOf(")")));

        //-------------------------------
        System.out.println();

        String letters = "J%a^V**$1a(";
        // remove, just leave letters
        System.out.println(letters);

        letters = letters.replace("%", "")
                .replace("^", "")
                .replace("$", "")
                .replace("1", "")
                .replace("(", "")
                .replace("*", "")
                .toUpperCase();
        System.out.println(letters);




    }
}
