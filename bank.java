import java.util.Scanner;

public class bank {
public static void main (String[] args){
 Scanner sc = new Scanner (System.in);
 int init_sav_amount, savee_period;
 double final_sav_init_sav_amount,interest,interest_percent= 0.02;

 System.out.print("input your saving period");
 init_sav_amount = sc.nextInt();
 System.out.print("input your saving amount");
 savee_period = sc.nextInt();

 interest = savee_period * interest_percent * init_sav_amount;
 
 final_sav_init_sav_amount = interest + init_sav_amount;
 System.out.println("interest" +  interest);
 System.out.println("final saving amount" + final_sav_init_sav_amount);
 

}    
}
