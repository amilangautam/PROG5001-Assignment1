import java.util.*;
/**
 * Program to compute statistics of 'students' marks in an assignment.
 * @author (Milan Gautam)
 * @version (6/09/2023)
 */
public class StudentStatistics
{
    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // let the user to enter the assignment name
        System.out.print("Please Enter the Assignment Name: ");

        // Read input from the user and store in a variable
        String assignmentName = scanner.nextLine();

        // Close the Scanner to free up resources
        scanner.close();

        // Show the assignment name
        System.out.println("You entered: " + assignmentName);
    }
    
}
