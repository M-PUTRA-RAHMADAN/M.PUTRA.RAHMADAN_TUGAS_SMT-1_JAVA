import java.util.Scanner;


public class Task2AssistantSelectionAttendanceNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== INPUT =====
        System.out.print("Is the student active? (yes/no): ");
        boolean active = sc.nextLine().trim().equalsIgnoreCase("yes");

        System.out.print("Is the student under academic sanction? (yes/no): ");
        boolean sanction = sc.nextLine().trim().equalsIgnoreCase("yes");

        System.out.print("Basic Programming grade: ");
        double grade = sc.nextDouble();
        sc.nextLine(); // clear the buffer

        System.out.print("Has programming competency certificate? (yes/no): ");
        boolean certificate = sc.nextLine().trim().equalsIgnoreCase("yes");


       
        if (active && !sanction) {

          
            if (grade >= 80 || certificate) {

              
                System.out.println("Stage 1 & 2 passed. Student is called for an interview.");
                System.out.print("Enter interview score: ");
                double interview = sc.nextDouble();

                if (interview >= 75) {
                    System.out.println("RESULT: ACCEPTED as lab assistant.");
                } else {
                    System.out.println("RESULT: NOT ACCEPTED. Reason: interview score is below 75.");
                }

            } else {
                System.out.println("RESULT: NOT ACCEPTED. Reason: Basic Programming grade is below 80 "
                        + "and the student has no programming competency certificate.");
            }

        } else {
            if (!active && sanction) {
                System.out.println("RESULT: NOT ACCEPTED. Reason: student is not active and is under academic sanction.");
            } else if (!active) {
                System.out.println("RESULT: NOT ACCEPTED. Reason: student is not active.");
            } else {
                System.out.println("RESULT: NOT ACCEPTED. Reason: student is under academic sanction.");
            }
        }

        sc.close();
    }
}
