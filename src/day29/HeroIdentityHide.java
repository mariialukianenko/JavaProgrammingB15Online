package day29;

public class HeroIdentityHide {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";
        // hide this hero identity
        
        String[] heroSplitted = hero1.split("-");
        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];
        
        int nameCharCount = fullName.length();
        String stars = "";
        for (int i = 0; i < nameCharCount ; i++) {
            stars = stars + "*";
        }
        System.out.println("stars = " + stars);

        String heroX = heroCode + "-"+stars;
        System.out.println(heroX);

    }
}
