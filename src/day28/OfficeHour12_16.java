package day28;

import java.util.Arrays;

public class OfficeHour12_16 {
    public static void main(String[] args) {

        String [][] students = {  {"1", "Jhon", "35", "USA"} , {"2", "Kevin", "40", "Brazil"}, {"3","Scott", "20", "Canada"} };
        System.out.println("How man arrays inside student 2d array? "+students.length);
        System.out.println("How many value in second row(inner array)? "+students[1].length);

        for (String [] arr: students){
            for (String value : arr){
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Task. Find oldest student and print his name.
          // get only age value
        String oldestPersonName = students[0][1];  // let's infer that 1st person is oldest
        int ageOFOldestPerson = Integer.parseInt(students[0][2]);
        for (String [] row : students){
            System.out.println(row[2]); // represents age
            // we need to convert inti integer
            int age = Integer.parseInt(row[2]);

            if (age > ageOFOldestPerson){
                ageOFOldestPerson = Integer.parseInt(row[2]);
                oldestPersonName = row[1];
            }
            }

        System.out.println("OLdest person: "+ oldestPersonName);



        }
    }

