package day27;

public class MultiDimensionPrac {
    public static void main(String[] args) {

        System.out.println("==============");

        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testers  = {"Zhibekchach", "Mohhamed Sohrabi", "Nursultan"};
        String[] businessAnalysitTeam = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {developersTeam, testers, businessAnalysitTeam};

        int maxLength = scrumTeam[0][0].length();
       // String longestString= "";

        for (   String[]   each1DArray :   scrumTeam   ) {
            for (String eachElement : each1DArray) {
                if (maxLength < eachElement.length()) {
                    maxLength = eachElement.length();
                  //  longestString=eachElement;
                }
            }
        }

        System.out.println(maxLength);
        //  System.out.println(longestString);

        for (   String[]   each1DArray :   scrumTeam   ) {
            for (String eachElement : each1DArray) {

                if (maxLength == eachElement.length()) {
                    System.out.println(eachElement);
                }
            }
        }


    }
}
