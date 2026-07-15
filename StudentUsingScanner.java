import java.util.Scanner;
class StudentUsingScanner
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter your name:");
  String name=scanner.nextLine();
  System.out.println("Enter your age:");
  int age=scanner.nextInt();
  System.out.print("Enter your marks:");
  float marks=scanner.nextFloat();
  System.out.println("Name="+name);
  System.out.println("Age="+age);
  System.out.println("Marks="+marks);
 }
}
