package day27;

public class Practise3_ShortestWord {
    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testers  = {"Zhibekchach", "Mohhamed Sohrabi", "Nursultan"};
        String[] businessAnalysitTeam = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {developersTeam, testers, businessAnalysitTeam};

        int minLength = scrumTeam[0][0].length();
        String shortestString = "";

        for ( String[]  each1DArrays : scrumTeam){
            for (String  eachElement  :  each1DArrays){
                if (minLength > eachElement.length()){
                    minLength = eachElement.length();
                    shortestString = eachElement;
                }
            }
        }
        System.out.println(minLength);
        System.out.println(shortestString);


    }
}
