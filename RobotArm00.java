public class RobotArm00 {
    public static void main(String[] args) {
        
        // Langkah 1: Mengambil bola di nampan A dan meletakkannya di nampan C
        // Awalnya: A = Star ball, B = Moon ball, C = Empty
        System.out.println("After Step 1: Tray A = Empty, Tray B = Moon ball, Tray C = Star ball");
        
        // Langkah 2: Mengambil bola di nampan B dan meletakkannya di nampan A
        System.out.println("After Step 2: Tray A = Moon ball, Tray B = Empty, Tray C = Star ball");
        
        // Langkah 3: Mengambil bola di nampan C dan meletakkannya di nampan B
        System.out.println("After Step 3: Tray A = Moon ball, Tray B = Star ball, Tray C = Empty");
        
        // Mencetak kesimpulan berdasarkan kondisi terakhir di Langkah 3
        System.out.println("Conclusion: The correct statement is \"(a) The two balls have swapped places and (e) tray C is empty\"");
    }
}