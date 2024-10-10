public class Question_Five {
    
    // Generic method to print an array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating an array of Integers
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray); // Output: 1 2 3 4 5 

        // Creating an array of Strings
        String[] strArray = {"Hello", "World"};
        printArray(strArray); // Output: Hello World 
    }
}