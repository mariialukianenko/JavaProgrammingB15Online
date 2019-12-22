package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {

           //          01234567890123456789012345
        String name = "I love java I love java java java";

        // get the second java
        //assume you already know there is 4 java in this sentence
        // find out where is thw first java showed up
        // in order to find second one, search from right after you location you found first java
        // indexof always start from beginning
        // indexof has 2 version 1 expect 1 external data, another expect 2 external data
        System.out.println(name.indexOf("java"));
        System.out.println(name.indexOf("java", 7));
        System.out.println(name.indexOf("java", 8));
        System.out.println(name.indexOf("java", 20));
        System.out.println(name.indexOf("java", 25));

        // how do I start from  the location that get past first Java
        int firstJavaLocation = name.indexOf("java");
        System.out.println(firstJavaLocation);
        // or you can start here +4   (+4 for the word java)
        int startingPointToSearchSecondJava = firstJavaLocation+1;
        int secondJavaLocation = name.indexOf("java", startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);

        //how to find the second word
        int firstSpaceLocation = name.indexOf(" ");
        int secondSpaceLocation = name.indexOf(" ", firstSpaceLocation+1);
        System.out.println("Second word is "+name.substring( firstSpaceLocation+1, secondSpaceLocation ));



    }
}
