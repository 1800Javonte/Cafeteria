/* Ade Thompson
CSCI 1301 - Computer Science I
CS1 Spring 2021
Name: Javonte Carr
Date: 3/19/2021
*/



import java.util.Scanner;

public class Cafeteria
{
 public static void main(String[] args)
 {
 /*Initialize an array for the days of week
   and declare arrays for the entree and prices.
   Declare a variable for the highest priced entree
   and a variable for the entree search.*/
 
 
 int ans2 = 0;
 String Esearch;
 double highest;
 int ans = 0;
 String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
 String[] entree = new String[5];
 double[] prices = new double[5];
 Scanner keyboard = new Scanner(System.in);
 
 //promt the user to enter an entree
 for(int i = 0; i < entree.length; i++)
 {
   System.out.println("What entree is served " + days[i]);
   entree[i] = keyboard.nextLine();
 }
 
 //promt the user to a price for the entree
 for(int j = 0; j < prices.length; j++)
 {
   System.out.println("What is the price for " + entree[j]);
   prices[j] = keyboard.nextDouble(); 
 }
 highest = prices[0];
 for(int f = 0; f < prices.length; f++)
 {
  if(highest < prices[f]) 
  {
   highest = prices[f];
   ans = f;
  }
 }
 //promt the user to enter an entree to search for
 System.out.println("Enter an entree to search for: ");
 keyboard.nextLine();
 Esearch= keyboard.nextLine();
 for(int l =0; l < entree.length; l++)
 {
   if(Esearch.equals(entree[l]))
   ans2 = l;
 }
 //Display the day that the entree the usersearched for is served
 System.out.println(Esearch + " is served on " +  days[ans2] + ".");
 
 //Display the highest priced entree
 System.out.print("The highest price entree is " + entree[ans] + ".");
 }
}