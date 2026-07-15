import java.util.Scanner;
class BankDetails
{
 private int Id;
 private String name;
 private double currentbalance;
 public void setdetail()
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter your Id:");
  Id=scanner.nextInt();
  scanner.nextLine();
  System.out.println("Enter your name:");
  name=scanner.next();
  System.out.println("Enter your Current Balance:");
  currentbalance=scanner.nextDouble();
  }
  public void Display()
  {
  System.out.println("Your Id is: "+Id);
  System.out.println("Your name is:"+name);
  System.out.println("your current balance is:"+currentbalance);
  }
  public static void main(String[] args)
  {
    BankDetails bank=new BankDetails();
    bank.setdetail();
    bank.Display();
  }
}

  
 
