package day29;

public class HeroIdentityHide2 {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";
        // hide this hero identity, replace fullname with star
        
        String[] heroSplitted = hero1.split("-");

        
        String stars = "";
        for (int i = 0; i <= heroSplitted[1].length()-1 ; i++) {
            stars = stars + "*";
        }
        System.out.println("stars = " + stars);

        System.out.println("heroX = " + hero1.replace(heroSplitted[1], stars));
        

    }
}
