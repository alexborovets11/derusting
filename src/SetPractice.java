import java.util.*;
public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> mySet = new HashSet<>();
    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    mySet.add("Cookies");
    mySet.add("Cupcakes");
    mySet.add("Brownies");
    // Check whether the Set contains a given String
    String searchElement = "Cupcakes";
    if (mySet.contains(searchElement)) {
      System.out.println(searchElement + " is in the set.");
    } else {
      System.out.println(searchElement + " is not in the set.");
    }
    // Remove an element from the Set
    mySet.remove("Brownies");
    System.out.println("After removing 'Brownies': " + mySet);
    // Get the size of the Set
    int setSize = mySet.size();
    System.out.println("Size of the set: " + setSize);
    // Iterate over the elements of the Set, printing each one on a separate line
    System.out.println("Elements in the set:");
    for (String element : mySet) {
      System.out.println(element);
    }
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
