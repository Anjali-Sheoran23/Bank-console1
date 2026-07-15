import java.util.Scanner;
class Temperature
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Conversion of temperature:1.Celsius to Fahrenheit 2.Fahrenheit to celsius 3. Exit!!!");
  int temp=scanner.nextInt();
  switch(temp)
  {
   case 1:
         System.out.println("Enter the temperature in celsius=");
         float DC=scanner.nextFloat();
         System.out.println("Covert to fahrenheit");
         float DF;
         DF=(DC*9/5)+32;
         System.out.println("Temperature="+DF+"degree fahrenheit");
         break;
   case 2:
        System.out.println("Enter the temperature in Fahrenheit=");
        float F=scanner.nextFloat();
        System.out.println("Conert to celsius:");
        float C;
        C=(F-32)*5/9;
        System.out.println("Temperature="+C+"degree celsius");
        break;
   default:
        System.out.println("Exit!!!!!");
   }
 }
}