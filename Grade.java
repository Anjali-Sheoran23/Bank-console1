import java.util.Scanner;
class Grade
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter marks:");
  int marks=scanner.nextInt();
  if(marks>=34 && marks<=50)
  {
  System.out.println("Grade D");
  }
  else if(marks>=51 && marks<=70)
  {
  System.out.println("Grade C");
  }
  else if(marks>=71 && marks<=80)
  {
  System.out.println("Grade B");
  }
  else if(marks>=81 && marks<=90)
  {
  System.out.println("Grade A");
  }
  else if(marks>=91 && marks<=100)
  {
  System.out.println("Grade A+");
  }
  else
  {
   System.out.println("Fail");
  }
 }
}