import java.util.Scanner;
class IfStatement
{
 public static void main(String[] args)
 { 
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter your age:");
  int age=scanner.nextInt();
  if(age>=18)
  {
   System.out.println("you can vote");
   }
   else
   {
    System.out.println("you can not vote");
   }
  }
}