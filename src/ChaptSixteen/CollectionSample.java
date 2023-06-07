package ChaptSixteen;

import java.util.*;

public class CollectionSample {
    public static void main(String[] args) {
        //ways to create list in java
        //the as.list cannot be manipulated.
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,5);

        List<Integer> num = new ArrayList<>();
        List<String>name = new ArrayList<>();
//        List<String> names = List.of("James", "Austine");

        //elements can be added into the array using the add method
        name.add("Olayinka");
        name.add("Allwell");
        name.add("Spencer");
        name.add("Sgreen");
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(2,100);
        num.remove((Integer) 10);
        name.remove("Sgreen");
        System.out.println(name);
//        System.out.println(num);
        Queue<Integer> collection = new LinkedList<>();
        collection.add(12);
        collection.add(13);
        collection.add(14);
        num.addAll(collection);
        System.out.println(num);
        List<String> names = new LinkedList<>();
        names.add("Folahan");
        boolean b = names.contains("Folahan");

    }

}
