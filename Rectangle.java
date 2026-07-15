import java.util.Scanner;
public class Rectangle
{
 private double length;
 private double breadth;
 public void setdetail()
 {
 Scanner scanner=new Scanner(System.in);
 System.out.println("Enter length:");
 length=scanner.nextDouble();
 System.out.println("Enter breadth:");
 breadth=scanner.nextDouble();
 }
 public void display()
 {
  System.out.println("length of rectangle:"+length);
  System.out.println("breadth of rectangle:"+breadth);
  System.out.println("Area of rectangle:"+(length*breadth));
 }
 public static void main(String[] args)
 {
  Rectangle rect=new Rectangle();
  rect.setdetail();
  rect.display();
 }
}
   
 
 