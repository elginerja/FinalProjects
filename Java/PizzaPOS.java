

import java.util.Scanner;
import java.text.NumberFormat;

public class PizzaPOS
{
public static void main (String [] args)
{

//Create a Scanner object to read input
Scanner scan = new Scanner (System.in);

String firstName; //user's first name
boolean discount = false; //flag, true if user is eligible for discount
int inches; //size of the pizza
char crustType; //code for type of crust
String crust = "Hand-tossed"; //name of crust
double cost = 12.99; //cost of the pizza
final double TAX_RATE = .08; //sales tax rate
double tax; //amount of tax
char choice; //user's choice
String input; //user input
String toppings = "Cheese "; //list of toppings
int numberOfToppings = 0; //number of toppings

//prompt user and get first name
System.out.println("Welcome to Jack and Diane's Pizza");
System.out.print("Enter your first name: ");
firstName = scan.nextLine();

//determine if user is eligible for discount by
//having the same first name as one of the owners

if (firstName.equalsIgnoreCase("Diane") || firstName.equalsIgnoreCase("Jack"))
{

discount = true;
}

//prompt user and get pizza size choice
System.out.println("Pizza Size (inches) Cost");
System.out.println(" 10 $10.99");
System.out.println(" 12 $12.99");
System.out.println(" 14 $14.99");
System.out.println(" 16 $16.99");
System.out.println("What size pizza would you like?");
System.out.print("10, 12, 14, or 16 (enter the number only): ");
inches = scan.nextInt();

if (inches == 10){
cost = 10.99;
}
else if (inches == 12){
cost = 12.99;
}
else if (inches == 14){
cost = 14.99;
}
else if (inches == 16){
cost = 16.99;
}
else{
System.out.println("Sorry, that size input is not offered at Jack and Diane's");
System.out.println("Default size of 12 inches will be selected for you.");
inches = 12;
cost = 12.99;
}

System.out.println("What type of crust do you want? ");
System.out.print("(H)Hand-tossed, (T) Thin-crust, or " +
"(D) Deep-dish (enter H, T, or D): ");
input = scan.next();
crustType = input.charAt(0);

if (crustType == 'H'){
crust = "Hand-tossed";
}
else if (crustType == 'T'){
crust = "Thin-crust";
}
else if (crustType == 'D'){
crust = "Deep-dish";
}
else{
 
}
System.out.println("All pizzas come with cheese.");
System.out.println("Additional toppings are $1.25 each,"
+" choose from");
System.out.println("Pepperoni, Sausage, Onion, Mushroom");
System.out.print("Do you want Pepperoni? (Y/N): ");
input = scan.next();
choice = input.charAt(0);
 
if (choice == 'Y' || choice == 'y')
{
numberOfToppings += 1;
toppings = toppings + "Pepperoni added ";
}
 
System.out.print("Do you want Sausage? (Y/N): ");
input = scan.next();
choice = input.charAt(0);
 
if (choice == 'Y' || choice == 'y'){
numberOfToppings ++;
toppings += "Sausage added ";
}
 
System.out.print("Do you want Onion? (Y/N): ");
input = scan.next();
choice = input.charAt(0);
 
if (choice == 'Y' || choice == 'y'){
numberOfToppings ++;
toppings += "Onion added ";
}
System.out.print("Do you want Mushroom? (Y/N): ");
input = scan.next();
choice = input.charAt(0);
 
if (choice == 'y' || choice == 'Y'){
numberOfToppings ++;
toppings += "Mushroom added ";
}

//add additional toppings cost to cost of pizza
cost = cost + (1.25*numberOfToppings);

//display order confirmation
System.out.println();
System.out.println("Your order is as follows: ");
System.out.println(inches + " inch pizza");
System.out.println(crust + " crust");
System.out.println(toppings);


if (discount)
{
System.out.println("You are eligable for a $2.00 discount.");
cost -= 2;
}

System.out.println("The cost of your order is: $" + String.format("%.2f", cost));

//calculate and display tax and total cost
tax = cost * TAX_RATE;
int tax_2 = (int)(tax*100);
tax = (double)tax_2/100;
System.out.println("The tax is: $" + tax);
System.out.println("The total due is: $" + String.format("%.2f", (tax + cost)));

System.out.println("Your order will be ready for pickup in 30 minutes.");
}
}