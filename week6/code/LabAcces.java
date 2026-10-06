import java.util.Scanner;

public class LabAcces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Initialize variables by reading user input
        System.out.print("Is active student? (true/false): ");
        boolean isActiveStudent = sc.nextBoolean();
        
        System.out.print("Is sanctioned? (true/false): ");
        boolean isSanctioned = sc.nextBoolean();
        
        System.out.print("Has lecturer permit? (true/false): ");
        boolean hasLecturerPermit = sc.nextBoolean();
        
        System.out.print("Is lab assistant? (true/false): ");
        boolean isLabAssistant = sc.nextBoolean();
        
        // The evaluation logic 
        if (isActiveStudent && !isSanctioned) {
            if (hasLecturerPermit || isLabAssistant) {
                System.out.println("Laboratory access granted");
            } else {
                System.out.println("Access denied: lecturer permission or lab assistant status required");
            }
        } else {
            System.out.println("Access denied: student status does not meet the requirement");
        } 
        
        sc.close(); 
    }
}
