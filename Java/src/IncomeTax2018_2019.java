import java.util.*; //because i need user input in this program 

public class  IncomeTax2018_2019 
{
  public static void main(String[] args)
  {
    Scanner inputStatus= new Scanner(System.in);
    Scanner inputIncome= new Scanner(System.in); // giving the user the option to input.
    System.out.println(
                       "0. Enter 0 for single filers \n" +
                       "1. Enter 1 for married filing jointly \n" +
                       "2. Enter 2 for married filing separately \n" +
                       "3. Enter 3 for head of household \n" )   ;   
    
    System.out.print("Enter the filing status (0-3): ");
    int choice = inputStatus.nextInt(); //getting and allocating the filling status
    
    double tax=0;
    double a=0;
    double b=0;
    double c=0;
    double d=0;
    double e=0; // giving initial value 
    System.out.print("Enter the taxable income: ");
    int income = inputIncome.nextInt(); //getting and allocating the income
    
    
    if (choice== 0)
    {
      a=8350;
      b=33950;
      c=82250;
      d=171550;
      e=372950; // determining Marginal Tax Rate for Single
    }
    else if (choice== 1)
    {
      a=16700;
      b=67900;
      c=137050;
      d=208850;
      e=372950; // determining Marginal Tax Rate for Married Filing Jointly
    }
    else if (choice== 2)
    {
      a=8350;
      b=33950;
      c=68525;
      d=104425;
      e=186475; // determining Marginal Tax Rate for Married Filing Separately
    }
    else if (choice== 3)
    {
      a=11950;
      b=45500;
      c=117450;
      d=190200;
      e=372950; // determining Marginal Tax Rate for Head of Household
    }
    else{System.out.println("Not valid option , Filing status (0-3) only. TRY AGAIN!!!");} // giving this output if the user choose to input any other number 
    
    if (income>e){tax= 10.0/100.0*a + 15.0/100.0*(b-a) + 25.0/100.0*(c-b) + 28.0/100.0*(d-c) + 33.0/100.0*(e-d) + 35.0/100.0*(income-e);}
    else if (income>d){tax= 10.0/100.0*a + 15.0/100.0*(b-a) + 25.0/100.0*(c-b) + 28.0/100.0*(d-c) + 33.0/100.0*(income-d);}
    else if (income>c){tax= 10.0/100.0*a + 15.0/100.0*(b-a) + 25.0/100.0*(c-b) + 28.0/100.0*(income-c);}
    else if (income>b){tax= 10.0/100.0*a + 15.0/100.0*(b-a) + 25.0/100.0*(income-b);}
    else if (income>a){tax= 10.0/100.0*a + 15.0/100.0*(income-a);}
    else if (income>=0){tax= 10.0/100.0*income;}
    else {System.out.println("Not valid Earning. TRY AGAIN!!!");} // if nagative number
    
    System.out.println("Tax is " + tax) ;  // final output
  }
}
