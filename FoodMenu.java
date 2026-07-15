import java.util.Scanner;
class FoodMenu
{

 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  int priceofpizza=300;
  int priceofburger=150;
  int priceofpasta=200;
  System.out.println("Choose: 1.Order Pizza 2.Order Burger 3.Order Pasta 4.View Bill 5.Exit");
  int choose=scanner.nextInt();
  switch(choose)
  {
  case 1:
       System.out.println("Order Pizza");
 case 2:
      System.out.println("Order Burger");
 case 3:
      System.out.println("order Pasta");
 case 4:
      System.out.println("Total bill="+(priceofpizza+priceofburger+priceofpasta));
      break;
 case 5:
      System.out.println("Exit!!!!!");
      break;
  }
 }
} 
        