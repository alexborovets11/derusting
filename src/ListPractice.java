import java.util.*;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> items = new ArrayList<>();
    // Add 3 elements to the list (OK to do one-by-one)
    items.add("Number 1");
    items.add("Number 2");
    items.add("Number 3");
    // Print the element at index 1
    System.out.println("Element at index 1: " + items.get(1));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    items.set(1, "Practice");
    System.out.println("Updated element at index 1: " + items.get(1));
    // Insert a new element at index 0 (the length of the list will change)
    items.add(0, "Start");
    System.out.println("Index 0: " + items);
    // Check whether the list contains a certain string
    boolean containsCode = items.contains("Code");
    System.out.println("Does this lest contain 'Code'? " + containsCode);
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    System.out.println("Using a traditional for-loop:");
    for (int i = 0; i < items.size(); i++) {
      System.out.println("Index " + i + ": " + items.get(i));
    }
    // Sort the list using the Collections library
    Collections.sort(items);
    System.out.println("Sorted list: " + items);
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    System.out.println("Using a for-each loop:");
    for (String item : items) {
      System.out.println(item);
    }
    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}