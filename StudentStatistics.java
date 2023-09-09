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
        
       

        int[] marks = new int[30]; // 30 students Assuming
        
        // Initialize variables for highest and lowest marks
        int highestMark = marks[0];
        int lowestMark = marks[0];

        for (int i = 0; i < 30; i++) {
            
            int mark;
        
            do {
                
                System.out.print("Enter the student " + (i+1) + " mark: ");
                
                mark = scanner.nextInt();

                if (mark < 0 || mark > 30) {
                    System.out.println("Invalid marks! Please enter the marks between 0 and 30");
                } 
                
            } while (mark < 0 || mark > 30);
            
             marks[i] = mark;
        }
        
           //highest and lowest marks calculation
           for (int i = 0; i < 30; i++) {
             if (marks[i] > highestMark) {
                highestMark = marks[i];
                 }
             if (marks[i] < lowestMark) {
                 lowestMark = marks[i];
                }
            }

         // Display the entered assignment name and student marks
         System.out.println("Student Marks entered Successfully!");
         System.out.println("Assignment Name: " + assignmentName);
         System.out.println("Students' Entered Marks are given Below:");
        
        for (int i = 0; i < 30; i++) {
            
            System.out.println("Student "+ (i+1) + " Mark: " + marks[i]);
        }
        
        //display the highest and lowest marks
        System.out.println("Students'Highest Mark is: " + highestMark);
        System.out.println("Students' Lowest Mark is: " + lowestMark);
    }
    
}
