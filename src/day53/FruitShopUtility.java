package day53;

public class FruitShopUtility {

    public static void main(String[] args) {


        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        displayFruit(f2);

        digestBetter(f1);
        digestBetter(new Orange("sweet", "light orange", 9));

       Fruit x = getMyFavoriteFruit();
       x.getDigested();
        System.out.println("My favorite fruit is "+x);

        System.out.println("==============");
        System.out.println("getFavoriteByType(2) = " + getFavoriteByType(2));
        System.out.println("getFavoriteByType(4) = " + getFavoriteByType(4));

    }


    // create a static method called getFavoriteByType
    // it has one int parameter
    // return favorite apple object if typy is 1, orange object if type 2

    public static Fruit getFavoriteByType ( int type ){
        if (type == 1){
            return new Apple("crispy but tasteless", "hot red", "Gala");
        }else if (type == 2){
            return new Orange("sour", "orange", 12);
        }
        return  null;
    }



    public static  void digestBetter(Fruit fruitName){

        for (int i = 1; i <= 4 ; i++) {
           fruitName.getDigested();
        }
        System.out.println(fruitName);
    }


    // shoud accept no parameter and return your Favorite fruit
    public static Fruit getMyFavoriteFruit(){
//        Fruit f = new Orange("sweetless", "green", 15);
//          return f;
        return new Orange("sweetless", "green", 15);  // it is also work
    }


    // displayFruit
    public static void displayFruit(Fruit anyFruit) {

        System.out.println("Displaying fruit \n" + anyFruit.toString());

    }


    // sellFruit


    // buyFruit



}
