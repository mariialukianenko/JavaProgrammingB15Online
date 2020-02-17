package day43;

import day42.Movie;

public class MovieActions {


    public static void main(String[] args) {

        Movie m1 = new Movie("Joker", 2.5, "Drama");
        Movie m2 = new Movie("Cinderella", 1.5, "Family");

        printMovieInformation(m1);
        printMovieInformation(m2);

        printShorterMovieName(m1, m2);

       // Integer i1 = Integer.valueOf(12);

       Movie result = getJokerMovieObject();             // movie = data type, j = reference variable name.
       System.out.println("Name is "+result.getName());

    }

    // create the static method that return name Joker movie object with 2.5 hour and type Drama
    public static Movie getJokerMovieObject(){

        Movie j = new Movie("Joker", 2.5, "Drama");
        return j;

    }



    /**
     * A void method that accept any movie object
     * and print out it's information in below format
     * The movie <name> is <length> hour long and it genre is <type>
     * @param movieObj the movie object to get information from
     */
    public static void printMovieInformation(Movie movieObj) {

        System.out.println("The movie "+movieObj.getName()
                +" is "+movieObj.getLength()
                +" hour long and it genre is "+movieObj.getType());
    }

    /**
     * A void method that accept 2 movie objects
     * and print the name of movie with shorter movie length
     * for example Frozen is 1.5 hours , Joker is 2.2 hours
     * so print The shorter movie is : Frozen
     * @param movieObj1 first movie object
     * @param movieObj2 second movie object
     */
    public static void printShorterMovieName(Movie movieObj1, Movie movieObj2) {

        if (movieObj1.getLength() < movieObj2.getLength()){
            System.out.println(movieObj1.getName());
        }else{
            System.out.println(movieObj2.getName());
        }

    }
}
