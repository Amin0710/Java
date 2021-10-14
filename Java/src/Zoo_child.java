import java.util.*; //because i need user input in this program 

public class  Zoo_child 
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in); // giving the user the option to input.
    System.out.print("Enter a group? (Yes=1/No=0): ");
    int choice = input.nextInt(); //asking if they need to add a group
    
    int unaccompanied  = 0;
    int adultsSeniors = 0;
    int charge = 0;
    int totalCharge=0; // pre set value and define them as a int
    
    while (choice== 1) // loop start
    {    
      System.out.print("Enter the number of children (age 6–15): ");
      int child = input.nextInt(); 
      System.out.print("Enter the number of adults (age 16–59): ");
      int adults = input.nextInt(); 
      System.out.print("Enter the number of seniors (age 60+): ");
      int seniors = input.nextInt(); // user input for all 3 paid catagory 
      adultsSeniors=adults+seniors; // counting total adults and seniors
      if (child>adultsSeniors){unaccompanied =child-adultsSeniors;}else{unaccompanied=0;} // counting unaccompanied and accompanied people.
      charge = (seniors*8+adults*10+child*2+unaccompanied*3); // calculating charge
      totalCharge=totalCharge+charge; // calculating totalCharge
      System.out.print("Total entry charge is $"+charge);
      System.out.println("\n"); // leaving a gap
      System.out.print("Enter a group? (Yes=1/No=0): "); // asking if they need to add another group
      choice = input.nextInt();
    }
      System.out.print("Total takings: $"+totalCharge);// printing total 
  }
}