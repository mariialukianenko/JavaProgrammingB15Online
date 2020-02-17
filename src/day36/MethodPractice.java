package day36;

import javax.swing.text.StyledEditorKit;

public class MethodPractice {
    public static void main(String[] args) {

      //  Boolean b = true;  // auto boxed it to boolean Object
        System.out.println(checkIfStringHasNumber("yf5B7dF"));
    }

    // wtite a static methid to accept a String and return Boolean ( Yes uppercase).
    // it should return true if the String contains at least one number.

    /** --> slash and double star
     *
     * @param str
     * @return
     */
    public static Boolean checkIfStringHasNumber (String str){

        for (int i = 0; i < str.length() ; i++) {
            char eachChar = str.charAt(i);
            if (Character.isDigit(eachChar)){
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);  // because we need a object, we can not write just false in this case
    }
}
