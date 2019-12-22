package day14;

public class StringRewiev {
    public static void main(String[] args) {
        String str = "I like pumpkin";
        System.out.println( str.equals("pumpkin") );

        System.out.println(str.contains("like"));
        boolean gotPumpkin = str.contains("like");
        System.out.println("gotPumpkin = " + gotPumpkin);

        System.out.println(str.startsWith("I like"));
        
        boolean strartedWith = str.startsWith("I");
        System.out.println("strartedWith = " + strartedWith);

        // password validator

        String password = "AbH2723gjg_";
        boolean minMax = (password.length()>=8 && password.length()<=16);
        boolean mustContains_or$ = password.contains("_") || password.contains("$");
        boolean mustNotContainSpace = !password.contains(" ");
        boolean mustStartsWith =  password.startsWith("Ab");

        if ( minMax && mustContains_or$ && mustNotContainSpace && mustStartsWith ){
            System.out.println("Valid password");
        }else {
            System.out.println("Invalid password");
        }


    }
}
