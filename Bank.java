import java.util.Scanner;
class Bank
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Menu:1.Check Balance 2.Deposit money 3.Withdraw money 4.Exit");
  int menu=scanner.nextInt();
  double balance=10000d;
  switch(menu)
  {
   case 1:
         System.out.println("Current balance="+balance);
         break;
   case 2:
         System.out.println("Money you want to deposit=");
         double deposit=scanner.nextDouble();
         System.out.println("Money Deposited="+deposit);
         balance=balance+deposit;
         System.out.println("balance="+balance); 
         break;
   case 3:
         System.out.println("Money you want to withdraw=");
         double withdraw=scanner.nextDouble();
         System.out.println("Money withdraw="+withdraw);
         balance=balance-withdraw;
         System.out.println("balance="+balance); 
         break;
  default:
         System.out.println("Exit!!!!!");
         break;
  }
 }
}