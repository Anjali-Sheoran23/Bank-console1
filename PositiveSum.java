import java.util.Scanner;
class PositiveSum
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter num1:");
  int num1=scanner.nextInt();
  System.out.println("Enter num2:");
  int num2=scanner.nextInt();
  if(num1>0 && num2>0)
  {
   int sum=num1+num2;
   System.out.println("sum="+sum);
  }
 }
}