import java.util.*;
public class ACMEPays {
    public static void main(String[] args) throws Exception 
    {
        int retire = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter shift - 1 , 2 , or 3");
        int shift = input.nextInt();

      System.out.println("Enter the amount of hours worked");
      int x1 = input.nextInt();
      
      System.out.println("Would you like to participate in the retirement plan (1 for yes, 2 for no)");
      int x2 = input.nextInt();


        double rate = payRate(shift);
        double gross = grossPay(rate, hours);
        
        System.out.println("Hours worked is " + hours);
        System.out.println("Hourly pay rate is " + rate);
        hoursBreakdown(rate, hours);
        retirementPay(shift, retire, gross);
    }

    public static double payRate(int shift)
    {
        //fill in the details 
          
    return rate;
    }

    public static void hoursBreakdown(double rate, double hours)
    {
        //fill in details
    }

    public static double grossPay(double rate, double hours)
    {
        //fill in details 
      
        return pay;
    }

    public static void retirementPay(int shift ,int choice, double gross)
    {
        //fill in details

        System.out.println("Retirment Deduction is " + retire);
        System.out.println("Net Pay is ...................." + netPay);
    }
}