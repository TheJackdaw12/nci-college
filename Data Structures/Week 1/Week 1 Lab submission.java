import java.util.*;

public class ArrayListLab {
    
    // Method to print ArrayList
    public static void print(List<String> arr) {
        for (String current : arr) {
            System.out.println(current);
        }
    }

    public static void main(String[] args) {
        // 1. Creating an ArrayList of Strings
        List<String> list = new ArrayList<>();
        
        // 2. Adding elements to the list
        list.add("Hello");
        list.add("World");
        list.add("bye");
        
        System.out.println("Initial List:");
        print(list);

        // 3. Adding a new string to the list
        list.add("Java");
        System.out.println("After adding 'Java':");
        print(list);
        
        // 4. Trying to add an Integer (uncommenting below will cause a compilation error)
        // list.add(10); // Error: incompatible types
        
        // 5. Removing the item at index 0
        list.remove(0);
        System.out.println("After removing index 0:");
        print(list);
        
        // 6. Inserting an item at index 1
        list.add(1, "Inserted");
        System.out.println("After inserting at index 1:");
        print(list);
        
        // 7. Removing the first occurrence of "bye"
        list.remove("bye");
        System.out.println("After removing 'bye':");
        print(list);
        
        // 8. Using set() to modify an element
        list.set(1, "Modified");
        System.out.println("After modifying index 1:");
        print(list);
        
        // 9. Checking if a specific string exists in the list
        System.out.println("Contains 'World'? " + list.contains("World"));
        
        // 10. Creating another ArrayList and adding elements
        List<String> newList = new ArrayList<>();
        newList.add("One");
        newList.add("Two");
        newList.add("Three");
        newList.add("Four");
        
        // 11. Adding all elements from newList to list
        list.addAll(newList);
        System.out.println("After adding all from newList:");
        print(list);
        
        // 12. Clearing an ArrayList
        newList.clear();
        System.out.println("After clearing newList:");
        print(newList);
        
        // 13. Creating a Person class and using it in an ArrayList
        List<Person> people = new ArrayList<>();
        people.add(new Person("James", 25));
        people.add(new Person("Jake", 30));
        
        System.out.println("\nList of Persons:");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}

// Class to represent a Person
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
