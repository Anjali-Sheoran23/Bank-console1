import java.util.Scanner;
class StudentSubjectMarks
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter marks:");
  System.out.println(" Marks in Hindi:");
  int Hindi=scanner.nextInt();
  System.out.println("Marks in English:");
  int English=scanner.nextInt();
  System.out.println("Marks in Maths:");
  int Maths=scanner.nextInt();
  System.out.println("Enter your choice: 1.View Marks 2.View Average 3.View Highest 4.Exit");
  int choice=scanner.nextInt();
  switch(choice)
  {
  case 1:
      System.out.println("Hindi="+Hindi);
      System.out.println("English="+English);
      System.out.println("Maths="+Maths);
      break;
 case 2:
      System.out.println("Average="+(Hindi+English+Maths)/3);
      break;
 case 3:
      if(Hindi>English && Hindi>Maths)
      {
      System.out.println("Highest marks= Hindi");
      }
      else if(English>Hindi && English>Maths)
      {
      System.out.println("Highest marks=English");
      }
      else
      {
      System.out.println("Highest marks=Maths");
      }
      break;
 case 4:
      System.out.println("Exit!!!!");
      break;
  }
 }
}

 