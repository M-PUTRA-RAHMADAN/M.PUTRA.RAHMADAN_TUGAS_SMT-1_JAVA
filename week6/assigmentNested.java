import java.util.Scanner;

public class assigmentNested {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day: ");
        String day = input.nextLine();
        
        System.out.print("Enter book type (dictionary / novel / other): ");
        String type = input.nextLine();
        
        System.out.print("Enter quantity: ");
        int qty = input.nextInt();
        
        System.out.print("Enter price per book: ");
        double price = input.nextDouble();

        double totalPrice = qty * price;
        double discount = 0; 

        // discount only applies on Wednesday
        if (day.equalsIgnoreCase("Wednesday")) {
            if (type.equalsIgnoreCase("dictionary")) {
                if (qty > 2) {
                    discount = 12;
                } else {
                    discount = 10;
                }
            } else {
                if (type.equalsIgnoreCase("novel")) {
                    if (qty > 3) {
                        discount = 5;
                    } else {
                        discount = 0;
                    }
                } else { 
                    // for other books
                    if (qty > 3) {
                        discount = 9;
                    } else {
                        discount = 8;
                    }
                }
            }
        } else {
            discount = 0; 
        }

        // calculate final payment
        double discountAmount = totalPrice * (discount / 100);
        double totalPay = totalPrice - discountAmount;

        System.out.println("-----------------------------");
        System.out.println("Total price    : " + totalPrice);
        System.out.println("Discount (" + discount + "%): " + discountAmount);
        System.out.println("Total to pay   : " + totalPay);
    }
}
