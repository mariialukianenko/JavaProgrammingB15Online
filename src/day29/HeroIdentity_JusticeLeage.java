package day29;

public class HeroIdentity_JusticeLeage {
    public static void main(String[] args) {

     String [] allHeroes = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

       for (String eachHero : allHeroes ){
           System.out.println(eachHero);

           String hero1 = eachHero;
           String[] heroSplitted = hero1.split("-");
           String stars = "";

           for (int i = 0; i <= heroSplitted[1].length()-1 ; i++) {
               stars = stars + "*";
           }
           System.out.println(hero1.replace(heroSplitted[1], stars));

       }

    }
}
