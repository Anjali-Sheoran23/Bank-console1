import java.util.Scanner;
class ElectricityBill
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Number of units consumed=");
  int units=scanner.nextInt();
  int unitscategory=units/100;
  switch(unitscategory)
     {
        case 0:
        case 1:
            System.out.println("Rate=Rs.3");
            break;
        case 2:
        case 3:
            System.out.println("Rate=Rs.5");
            break;
        default:
            System.out.println("Rate=Rs.7");
     }
 }      
}