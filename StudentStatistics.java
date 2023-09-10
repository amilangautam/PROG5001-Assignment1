import java.util.*;
/**
 * Program to compute statistics of 'students' marks in an assignment.
 * @author (Milan Gautam)
 * @version (6/09/2023)
 */
public class StudentStatistics
{
    public static void main(String[] args) {
        
         //F1:allows the user to input the assignment name
        
         // Scanner object to read input from the user
         Scanner scanner = new Scanner(System.in);
         // let the user to enter the assignment name
         System.out.print("Please Enter the Assignment Name: ");
         // Read input from the user and store in a variable
         String assignmentName = scanner.nextLine();
        
       
         //F2 & F3:allows the user to input students' marks for the assignment and display error
        
         // 30 students Assuming
         int[] marks = new int[30]; 
         for (int i = 0; i < 30; i++) {
         int mark;
         do {
                System.out.print("Enter the student " + (i+1) + " mark: ");
                mark = scanner.nextInt();
                if (mark < 0 || mark > 30) {
                    //F3: reports any invalid input by showing an error message
                    System.out.println("Invalid marks! Please enter the marks between 0 and 30");
                } 
            }   while (mark < 0 || mark > 30);
                marks[i] = mark;
         }
        
           //F5: highest and lowest marks calculation
           // Initialize variables for highest and lowest marks
           int highestMark = marks[0];
           int lowestMark = marks[0];
           for (int i = 0; i < 30; i++) {
             if (marks[i] > highestMark) {
                highestMark = marks[i];
                 }
             if (marks[i] < lowestMark) {
                 lowestMark = marks[i];
                }
            }
            
           //F6: Calculates the mean and standard deviation of the marks
           double total = 0;
            for (double mark : marks) {
                
            total += mark;
            
           }
           
           double mean = total / marks.length;
           double sumOfSquaredDifferences = 0.0;
           for (double mark : marks) {
                
            double difference = mark - mean;
            sumOfSquaredDifferences += difference * difference;
            
           }
           
           double variance = sumOfSquaredDifferences / marks.length;
           double standardDeviation = Math.sqrt(variance);
          
            //F4: prints the assignment name following the 'students' marks
            System.out.println("********* Assignment Stastistics ******");
            System.out.println("Assignment Name: " + assignmentName);
            System.out.println("Students' Entered Marks are given Below:");
        
            for (int i = 0; i < 30; i++) {
            
            System.out.println("Student "+ (i+1) + " Mark: " + marks[i]);
            
            }
        
            //display the highest and lowest marks
            System.out.println("Students' Highest Mark : " + highestMark);
            System.out.println("Students' Lowest Mark : " + lowestMark);
            
            //display the mean and standard Deviation 
            System.out.printf("Student Mean Marks : %.2f\n", mean);
            System.out.printf("Standard Deviation: %.2f\n", standardDeviation);
    }
    
}
