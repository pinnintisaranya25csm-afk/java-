package practise;
import java.util.ArrayList;
import java.util.Collections;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        System.out.println("ArrayList: " + list);

        // Insert at index
        list.add(1, 15);
        System.out.println("After insert: " + list);

        // Get element
        System.out.println("Element at index 2: " + list.get(2));

        // Replace element
        list.set(0, 5);
        System.out.println("After set: " + list);

        // Check element
        System.out.println("Contains 20: " + list.contains(20));

        // Size and empty check
        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());

        // Find indexes
        System.out.println("First index of 20: " + list.indexOf(20));
        System.out.println("Last index of 20: " + list.lastIndexOf(20));

        // Remove element by index
        list.remove(0);
        System.out.println("After remove index 0: " + list);

        // Remove element by value
        list.remove(Integer.valueOf(30));
        System.out.println("After remove value 30: " + list);

        // Sort
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // Clear all elements
        list.clear();
        System.out.println("After clear: " + list);
    }
}

