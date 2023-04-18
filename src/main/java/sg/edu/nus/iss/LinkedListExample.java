package sg.edu.nus.iss;

import java.util.LinkedList;

public class LinkedListExample {
    public void LinkedListExample01() {
        LinkedList<String> linkedList = new LinkedList<>();

        // added items will go behind the last
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Cow");
        linkedList.add("Monkey");
        linkedList.add("Goat");
        linkedList.add("Fish");

        for (String animal: linkedList) {
            System.out.println(animal);
        }

        // remove via string object needs to have the whole string included
        linkedList.remove("dog");
        System.out.println(linkedList);

        // different ways to add into a linkedlist
        linkedList.addFirst("Dragon");
        linkedList.addLast("Mouse");
        System.out.println(linkedList);
    }
}
