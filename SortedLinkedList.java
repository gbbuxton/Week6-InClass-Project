import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 * SortedLinkedList is a simple Java program that:
 * - Reads integers from standard input
 * - Stores them in a LinkedList
 * - Sorts the list in ascending order
 * - Prints the sorted list
 * 
 * The program uses the Java Collections Framework and can be run from the command line.
 * 
 * To compile: javac SortedLinkedList.java
 * To run:     java SortedLinkedList
 * To document: javadoc SortedLinkedList.java
 * 
 * Type "done" to finish input.
 * 
 * Example:
 * > java SortedLinkedList
 * Enter numbers (type 'done' to finish):
 * 3
 * 10
 * 1
 * done
 * Sorted List:
 * 1 3 10
 * 
 * @author Your Name
 */
public class SortedLinkedList {

    /**
     * The main method handles user input, sorting, and output.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (type 'done' to finish):");

        // Read integers until "done" is entered
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'done'.");
                }
            }
        }

        // Sort the LinkedList
        Collections.sort(numbers);

        // Output the sorted list
        System.out.println("Sorted List:");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
