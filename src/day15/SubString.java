package day15;

public class SubString {
    public static void main(String[] args) {
        // getting the part of the string

        String movie = "Lord Of The Ring";
        String wordOf = movie.substring(5,7);
        System.out.println("wordof = "+wordOf);
        // i want to get the word (of) from this movie

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = "+wordThe);

        // Get from the second word till last word
       // int startingPoint = movie.indexOf(" ")+1;
       // int endingPoint = movie.length();

        //assume we already know the location of starting point of second word

       String  secondWordTillLast = movie.substring(5,16);
        System.out.println(secondWordTillLast);

        String wordLordOf = movie.substring(0,7);
        System.out.println(wordLordOf);

        //start somewhere and get the rest of the string
        String secontToLast = movie.substring(5);
        System.out.println(secontToLast);

        //reverse of the <ring> = Ring Of The Lord
        System.out.println(movie.substring(12,16)+movie.substring(4,12)+movie.substring(0,4));


       // System.out.println("second word till last: "+movie.substring(startingPoint,endingPoint));

        // turn to ---> Ring Of The Java Lord
        System.out.println(movie.substring(12,16)+movie.substring(4,12)+ "Java "+movie.substring(0,4));



    }
}
