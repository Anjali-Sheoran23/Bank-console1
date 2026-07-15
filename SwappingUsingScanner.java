import java.util.Scanner;
class SwappingUsingScanner
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter num1:");
  int num1=scanner.nextInt();
  System.out.println("Enter num2:");
  int num2=scanner.nextInt();
  num1=num1+num2;
  num2=num1-num2;
  num1=num1-num2;
  System.out.println("After swapping:");
  System.out.println("num1="+num1);
  System.out.println("num2="+num2);
  scanner.close();
 }
}

  