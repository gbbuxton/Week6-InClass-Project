import java.util.Scanner;
import java.util.Stack;

/**
 * Project 05 - SortedStack
 * 
 * This Java program reads integers from the user, stores them in a stack,
 * sorts the stack from smallest to largest using a temporary stack,
 * and displays the sorted values.
 * 
 * Demonstrates:
 * - Stack usage for LIFO (last-in, first-out) storage
 * - Sorting with another stack (code reuse and modular design)
 * - Standard Java input/output handling
 * 
 * Author: Gabrielle Buxton
 */
public class SortedStack {

    /**
     * The main method handles user input, pushes integers onto a stack,
     * and prints the sorted output after sorting is complete.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter integers to add to the stack. Type a non-integer to stop:");

        // Collect integer inputs from the user
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            stack.push(number);  // Add number to the stack
        }

        // Sort the stack using the reusable sortStack method
        Stack<Integer> sorted = sortStack(stack);

        // Print the sorted result
        System.out.println("Sorted Stack (ascending order):");
        while (!sorted.isEmpty()) {
            System.out.println(sorted.pop());  // Output each element
        }
    }

    /**
     * Sorts a given stack of integers in ascending order using a temporary stack.
     * 
     * This demonstrates:
     * - Use of standard Java Stack methods (pop, push, peek, isEmpty)
     * - Code reuse through separation of concerns (modular method)
     * 
     * @param input The unsorted input stack
     * @return A new stack sorted in ascending order
     */
    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<>();

        // Sort input stack into tempStack
        while (!input.isEmpty()) {
            int temp = input.pop();

            // Move elements from tempStack back to input if they're larger
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                input.push(tempStack.pop());
            }

            tempStack.push(temp);  // Push current element into correct position
        }

        return tempStack;  // Return the sorted stack
    }
}
