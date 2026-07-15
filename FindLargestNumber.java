class FindLargestNumber
{
 public static void main(String[] args)
 {
  int num1=5,num2=6,num3=7;
  {
   int largest=(num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
   {
    System.out.println("largest number="+largest);
   }
  }
 }
}