package day26;

import java.util.Arrays;

public class TryingMyself {
    public static void main(String[] args) {

        int count = 0;

        String student = "Mariia, Illia, Valentina, Alexandr, Olya, Georgiy, Irina";

        String newStudent = student.replace(", ", "");
        System.out.println(newStudent);

        char [] array = newStudent.toCharArray();
        System.out.println(Arrays.toString(array));

        for (char eachLetter : array){
            System.out.print(eachLetter + "-->");
            if (eachLetter=='a'){
                count++;
            }
        }
        System.out.println();
        System.out.println(count);


    }
}
