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

        int[] marks = new int[5]; // 30 students Assuming

        for (int i = 0; i < marks.length; i++) {
            int mark;
            
            do {
                System.out.print("Enter the student mark: ");
                mark = scanner.nextInt();

                if (mark < 0 || mark > 30) {
                    System.out.println("Invalid marks! Marks should be between 0 and 30.");
                } 
                
            } while (mark >= 0 && mark <= 30);
            marks[i] = mark;
        }
        
        scanner.close();

        // Display the entered marks
        
        
        for (int i = 0; i < marks.length; i++) {
            
            System.out.println(marks[i]);
        }
    }
    
}
