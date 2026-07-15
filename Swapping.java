class Swapping
{
 public static void main(String[] args)
 {
  int num1=5,num2=4;
  System.out.println("value of num1 before swapping:"+num1);
  System.out.println("value of num2 before swapping:"+num2);
  {
   num1=num1+num2;
   num2=num1-num2;
   num1=num1-num2;
  }
 System.out.println("value of num1 after swapping:"+num1);
 System.out.println("value of num2 after swapping:"+num2);
 }
}