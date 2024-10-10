import java.util.ArrayList;

public class Question_One {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> carList = new ArrayList<>();

        // Add elements (car names)
        carList.add("Toyota");
        carList.add("Honda");
        carList.add("Ford");

        // Access elements
        System.out.println("First car: " + carList.get(0)); // Output: Toyota

        // Remove an element
        carList.remove("Honda");

        // Display elements
        System.out.println("Car list elements: " + carList);
    }
}