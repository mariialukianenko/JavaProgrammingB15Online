package day39;

public class CreateclassTemplet1 {
    public static void main(String[] args) {

        CreateClassTemplet car = new CreateClassTemplet();

        car.year = 2018;
        car.make = "Korea";
        car.color = "Black";
        car.model = "Hunday";

        car.goWorward();
        car.printAge();
        car.colorChange("Dark Blue");

        System.out.println(car.model + ", "+car.year +", "+ car.make+ ", "+car.color);

        System.out.println("-----------------------");

        CreateClassTemplet car2 = new CreateClassTemplet();

        car2.year = 2020;
        car2.make = "Germany";
        car2.color = "Black";
        car2.model = "Porshe";
        car2.goWorward();
        car2.printAge();
        System.out.println(car2.model + ", "+car2.year +", "+ car2.make+ ", "+car2.color);

        car2.color = car.color;



    }
}
