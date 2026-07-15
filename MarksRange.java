import java.util.Scanner;
class MarksRange
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter marks:");
  int marks=scanner.nextInt();
  if(marks<0 || marks>100)
  {
   System.out.println("Invalid marks");
  }
  else
  {
  int gradecategory=marks/10;
  char grade;
  switch(gradecategory)
  {
   case 10:
   case 9:
        grade='A';
        break;
  case 8:
  case 7:
       grade='B';
       break;
  case 6:
  case 5:
       grade='C';
       break;
  case 4:
  case 3:
       grade='D';
       break;
  default:
       grade='F';
  }
   System.out.println("Grade="+grade);
  }
 }
}
