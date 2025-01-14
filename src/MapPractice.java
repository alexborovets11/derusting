import java.util.*;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> pointsScored = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    pointsScored.put("Alex", 28);
    pointsScored.put("Samuel", 30);
    pointsScored.put("Jimmy", 42);
    // Get the value associated with a given key in the Map
    System.out.println("Score for Alex: " + pointsScored.get("Alex"));
    // Find the size (number of key/value pairs) of the Map
    System.out.println("Number of entries in the map: " + pointsScored.size());
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    pointsScored.put("Alex", 31);
    System.out.println("Updated score for Alex: " + pointsScored.get("Alex"));
    // Check whether the Map contains a given key
    System.out.println("Does the map contain the key 'Jimmy'? " + pointsScored.containsKey("Jimmy"));
    // Check whether the Map contains a given value
    System.out.println("Does the map contain the value 42? " + pointsScored.containsValue(42));
    // Iterate over the keys of the Map, printing each key
    System.out.println("Keys in the map:");
    for (String key : pointsScored.keySet()) {
      System.out.println(key);
    }
    // Iterate over the values of the map, printing each value
    System.out.println("Values in the map:");
    for (Integer value : pointsScored.values()) {
      System.out.println(value);
    }
    // Iterate over the entries in the map, printing each key and value
    System.out.println("Entries in the map:");
    for (Map.Entry<String, Integer> entry : pointsScored.entrySet()) {
      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
