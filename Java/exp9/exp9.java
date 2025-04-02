import java.util.*;

public class CollectionDemo {
    
    // Task 1: CRUD Operations on List
    public static void listCRUD() {
        List<String> list = new ArrayList<>();
        list.add("Apple");  // Create
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List after adding elements: " + list);
        
        list.set(1, "Blueberry");  // Update
        System.out.println("List after update: " + list);
        
        list.remove("Apple");
          // Delete
        System.out.println("List after deletion: " + list);
        
        System.out.println("Read element at index 1: " + list.get(1)); // Read
    }
    
    // Task 2: Demonstrate Set Interface Usage
    public static void setDemo() {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate, won't be added
        System.out.println("Set elements: " + set);
    }
    
    // Task 3: Using ArrayList and Iterator
    public static void arrayListWithIterator() {
        List<String> arrayList = new ArrayList<>(Arrays.asList("Dog", "Cat", "Elephant"));
        Iterator<String> iterator = arrayList.iterator();
        System.out.print("ArrayList elements (Iterator): ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    // Task 4: Using ArrayList and For-each loop
    public static void arrayListWithForEach() {
        List<String> arrayList = new ArrayList<>(Arrays.asList("Dog", "Cat", "Elephant"));
        System.out.print("ArrayList elements (For-each): ");
        for (String element : arrayList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    // Task 5: Using LinkedList and Iterator
    public static void linkedListWithIterator() {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(5, 10, 15, 20));
        Iterator<Integer> iterator = linkedList.iterator();
        System.out.print("LinkedList elements (Iterator): ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    // Task 6: Using LinkedList and For-each loop
    public static void linkedListWithForEach() {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(5, 10, 15, 20));
        System.out.print("LinkedList elements (For-each): ");
        for (int num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("Task 1: CRUD Operations on List");
        listCRUD();
        System.out.println();
        
        System.out.println("Task 2: Demonstrate Set Interface Usage");
        setDemo();
        System.out.println();
        
        System.out.println("Task 3: Using ArrayList and Iterator");
        arrayListWithIterator();
        System.out.println();
        
        System.out.println("Task 4: Using ArrayList and For-each loop");
        arrayListWithForEach();
        System.out.println();
        
        System.out.println("Task 5: Using LinkedList and Iterator");
        linkedListWithIterator();
        System.out.println();
        
        System.out.println("Task 6: Using LinkedList and For-each loop");
        linkedListWithForEach();
    }
}
