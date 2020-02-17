package day39;

public class StudentCreation {

    public static void main(String[] args) {

        // how to create an object out of template

        Student s1 = new Student();
        s1.name = "Dgggh";
        s1.age = 18;
        s1.gender = 'F';

        System.out.println(s1.name);

        Student s2 = new Student();
        s2.name = "Juma";
        s2.age = 31;
        s2.gender = 'M';

        System.out.println(s2.age);

        int oldAge = s2.age;

        s2.age = 28;
        System.out.println(s2.age);
        System.out.println(s2.name +" | "+ s2.age + " | "+ s2.gender);
        System.out.println(oldAge);

        // s1, s2 reference variable
        // oldage  - primitive

    }
}
