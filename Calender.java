import java.util.Scanner;
class Calender
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter the month:1.January 2.february 3.March 4.April 5.May 6.June 7. july 8.August 9.September 10.October 11.November 12.December");
  int month=scanner.nextInt();
  switch(month)
  {
   case 1:
         System.out.println("Month=January");
         break;
   case 2:
         System.out.println("Month=February");
         System.out.println("Enter the year:");
         int year=scanner.nextInt();
         if(year%4==0)
         {
         System.out.println("leap year......29 days");
         }
         else
         {
         System.out.println("Not a leap year");
         }
         break;
  case 3:
        System.out.println("Month=March");
        break;
  case 4:
       System.out.println("Month=April");
       break;
  case 5:
       System.out.println("Month=May");
       break;
  case 6:
       System.out.println("Month=June");
       break;
  case 7:
       System.out.println("Month=July");
       break;
  case 8:
       System.out.println("Month=August");
       break;
  case 9:
       System.out.println("Month=September");
       break;
  case 10:
       System.out.println("Month=October");
       break;
  case 11:
       System.out.println("Month=November");
       break;
  case 12:
       System.out.println("Month=December");
       break;
      }
   }
}