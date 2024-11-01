import java.util.Scanner;

public class IT24104166Lab3Q2{
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter the monthly salary: ");
   double monthlysalary=input.nextDouble();
   
  System.out.print("Enter the number of OT hours: "); 
  double otHours=input.nextDouble();
  
  System.out.print("Enter the OT hourly rate: ");
  double oTHourlyRate = input.nextDouble();

  //calculations
  double otAmount = otHours*oTHourlyRate;
  double totalSalary=monthlysalary+otAmount;
  
  //Display output
  System.out.println("");
  System.out.println("Total salary including OT is: "+ totalSalary);
  }
}