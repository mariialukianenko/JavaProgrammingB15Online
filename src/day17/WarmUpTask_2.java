package day17;

public class WarmUpTask_2 {
    public static void main(String[] args) {

        String name = "maRiia";
        String nameFix = (name.charAt(0)+"").toUpperCase();
               nameFix = nameFix + name.substring(1).toLowerCase();

        System.out.println("nameFix = " + nameFix);
        
        


    }
}
