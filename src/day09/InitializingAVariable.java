package day09;

public class InitializingAVariable {
    public static void main(String[] args) {

        String languageOption = "";
        int number = 6;

        if (number == 1 )
            languageOption = "Hello";
        else if (number == 2 )
            languageOption = "Salam";
        else if (number == 3 )
            languageOption = "Hola";
        else if (number == 4 )
            languageOption = "Privet";
        else
            languageOption = "Unknown";

        System.out.println("You choose "+ languageOption);



    }
}
