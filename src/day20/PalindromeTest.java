package day20;

public class PalindromeTest {
    public static void main(String[] args) {

        //if you reverse the string it does not change it means the string is called Palindrome

        // level, kayak, elle, madam, aziza
        String name = "Nurses run";
        System.out.println("name = " + name);
        String reverseName = "";

        for (int x = name.length()-1; x >=0 ; x--) {
            reverseName = reverseName + name.charAt(x);
        }
        System.out.println("reverseName = " + reverseName);

        if (name.equalsIgnoreCase(reverseName)){
            System.out.println("Palindrome");
        }else
            System.out.println("failed");
    }
}
            // homework make it ignore spaces!!!!!!!!!!!