import java.util.HashSet;

public class Question_Three {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add elements (planet names)
        set.add("Earth");
        set.add("Mars");
        set.add("Jupiter"); // No duplicate

        // Attempt to add a duplicate element
        set.add("Earth"); // Duplicate element

        // Display elements
        System.out.println("HashSet: " + set);
    }
}