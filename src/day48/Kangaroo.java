package day48;

public class Kangaroo implements Bouncible, BoxerWithBellyPounch {

    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    @Override
    public void bounce() {
        System.out.println("This " + name + " can jump " + jumpDistance
                + " meters forward and it would be nice to have " + gravity + " gravity");
    }

    public void eat(){
        System.out.println("Kangaroo can eat food");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }


    @Override
    public void box() {
        System.out.println("Kangaroo boxing.");
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println("Kangaroo have child in the pocket");
    }
}
