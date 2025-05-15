import java.util.Scanner;

public class Eligible {
    // Data members
    private int classesHeld;
    private int classesAttended;
    
    /**
     * Method to input attendance data from user
     */
    public void input() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter total number of classes held: ");
        classesHeld = scanner.nextInt();
        
        System.out.print("Enter number of classes attended: ");
        classesAttended = scanner.nextInt();
        
        // Input validation
        if (classesAttended > classesHeld) {
            System.out.println("Error: Attended classes cannot be more than held classes!");
            System.exit(1);
        }
    }
    
    /**
     * Method to compute attendance percentage and determine eligibility
     */
    public void compute() {
        if (classesHeld == 0) {
            System.out.println("No classes held - cannot compute percentage");
            return;
        }
        
        double attendancePercentage = (double) classesAttended / classesHeld * 100;
        
        System.out.printf("Attendance Percentage: %.2f%%\n", attendancePercentage);
        
        if (attendancePercentage >= 80) {
            System.out.println("Student permitted to appear in the exam");
        } else {
            System.out.println("Student not allowed to appear in the exam");
        }
    }
    
    public static void main(String[] args) {
        // Create instance of Eligible class
        Eligible student = new Eligible();
        
        // Invoke both methods
        student.input();
        student.compute();
    }
}