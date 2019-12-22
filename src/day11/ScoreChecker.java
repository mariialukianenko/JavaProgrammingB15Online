package day11;

public class ScoreChecker {
    public static void main(String[] args) {
        int score = 99;
        String result ="";

        if (score < 0 || score > 100)
            result = "Invalid score!";
        else if (score == 100)
            result = "Perfect score";
        else if (score >=70 && score<=100)
            result = "You have passed";
        else if (score<20)
            result = "Come to my office";
        else if ( score >= 30 && score <= 40)
            result = "Attend additional classes";

        System.out.println(result);
    }
}
