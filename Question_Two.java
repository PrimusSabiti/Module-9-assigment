import java.util.ArrayList;

public class Question_Two {
    public static void main(String[] args) {
        ArrayList<String> motorcycles = new ArrayList<>();
        motorcycles.add("Harley-Davidson");
        motorcycles.add("Yamaha");
        motorcycles.add("Kawasaki");

        // Display elements
        for (String motorcycle : motorcycles) {
            System.out.println(motorcycle);
        }
    }
}