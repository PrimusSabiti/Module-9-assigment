import java.util.HashMap;

public class Question_Four {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs (ocean names)
        map.put("Pacific Ocean", 1);
        map.put("Atlantic Ocean", 2);
        map.put("Indian Ocean", 3);

        // Accessing values
        System.out.println("Value for 'Atlantic Ocean': " + map.get("Atlantic Ocean")); // Output: 2

        // Displaying all key-value pairs
        System.out.println("HashMap elements: " + map);
    }
}