import java.util.Scanner;
class Area
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Find area:");
  int  area=scanner.nextInt();
  switch(area)
  {
  case 1:
       System.out.println("Enter Length:");
       double length=scanner.nextDouble();
       System.out.println("Enter Breadth:");
       double breadth=scanner.nextDouble();
      System.out.println("Area of rectangle="+(length*breadth));
      break;
  case 2:
       System.out.println("Enter Base:");
       double Base=scanner.nextDouble();
       System.out.println("Enter Height:");
       double Height=scanner.nextDouble();
      System.out.println("Area of Triangle="+(Base*Height)/2);
      break;
 case 3:
      System.out.println("Exit");
      break;
  }
 }
}