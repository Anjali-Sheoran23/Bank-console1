import java.util.Scanner;
class Palindrome
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter the number:");
  int num=scanner.nextInt();
  int reverse=0;
  while(num!=0)
  {
   int digit=num%10;
   reverse=reverse*10+digit;
   num=num/10;
  }
  if(reverse==num)
  {
   System.out.println("number is palindrome");
  }
  else
  {
  System.out.println("number is not palindrome");
  }
 }
}

 