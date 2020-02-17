package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {

        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Wonder Woman");
        superHeros.add("Cyborg");
        superHeros.add("Aquaman");
        superHeros.add("Flash");

        System.out.println(superHeros);

        for (int i = 0; i <= superHeros.size()-1 ; i++) {
            if (!superHeros.get(i).contains("man")){
                superHeros.remove(superHeros.get(i));
                i--; // this is we will use, when ones hero is removed, this index will be filled by the next item
                // so we need to decrease the index by 1 so stay at same index
            }
        }
        System.out.println(superHeros);


        System.out.println();
        List<String> superHeroCopy = new ArrayList<>(superHeros);
        System.out.println(superHeroCopy);

        System.out.println();
        // this was create a unmodifiable list!!! you can not remove or change or add.
        List<String> topics = Arrays.asList("Java", "Selenium", "Database", "API");
        System.out.println("topics = " + topics);

        // it is just regular arraylist, we can do anythig with it!!!
        List<String> topicsCopy = new ArrayList<>(topics);
        System.out.println(topicsCopy);

    }
}
