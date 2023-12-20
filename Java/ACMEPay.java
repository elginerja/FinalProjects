// On my honor, this is my code and it was not provided to me.-Jack Elginer
import java.util.Scanner;

public class ACMEPay {
    public static void main(String[] args) throws Exception {
        int retire = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter shift - 1 , 2 , or 3");
        int shift = input.nextInt();

        // Ask for hours worked
        System.out.println("Please enter hours worked: ");
        double hours = input.nextDouble();

        if (shift == 2 || shift == 3)
        {
            System.out.println("Would you like to participate in a retirement plan? (1 for yes or 2 for no)");
           int choice = input.nextInt();
        }

        double rate = payRate(shift);
        double gross = grossPay(rate, hours);

        System.out.println("Hours worked is " + hours);
        System.out.println("Hourly pay rate is " + rate);
        hoursBreakdown(rate, hours);
        retirementPay(shift, retire, gross);
    }

    public static double payRate(int shift) {
        // Assume different rates for each shift
        double rate;
        switch (shift) {
            case 1:
                rate = 17.0;
                break;
            case 2:
                rate = 18.50;
                break;
            case 3:
                rate = 22.0;
                break;
            default:
                rate = 0.0; // Default rate if an invalid shift is entered
        }
        return rate;
    }

    public static void hoursBreakdown(double rate, double hours) {
        // Assume simple breakdown for illustration purposes
        System.out.println("Regular Hours: " + hours);
        System.out.println("Overtime Hours: " + (hours > 40 ? hours - 40 : 0));
    }

    public static double grossPay(double rate, double hours) {
        // Assume simple calculation without overtime for illustration purposes
        double pay = rate * hours;
        return pay;
    }

    public static void retirementPay(int shifts, int choice, double gross) {
        // Assume retirement deduction is a fixed percentage of gross pay
       
       if (choice == 1)
       {
        double retire_deduct = 0.05 * gross;
        double netPay = gross - retire_deduct;
         System.out.println("Retirement Deduction is " + retire_deduct);
        System.out.println("Net Pay is ...................." + netPay);
       }
    
    }
}
