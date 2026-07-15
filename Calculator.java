import java.util.Scanner;
class Calculator
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter num1:");
  int num1=scanner.nextInt();
  System.out.println("Enter num2:");
  int num2=scanner.nextInt(); 
  
  for(;;)
  {
    System.out.println("Enter Choice : ");
    System.out.println("1.Add 2.Sub 3.Mul 4.Div 5.Exit");
    switch(scaner.nextInt())
    {
        case 1:
            System.out.println("Addition : "+num1+num2);
            break;
        case 2:
            System.out.println("Subtraction: "+num1-num2);
            break;
        case 3:
            System.out.println("Multiplication: "num1*num2);
            break;
        case 4:
            System.out.println("division: "num1/num2);
            break;        
        case 5:
            System.exit(0);
            break;

        default:
            System.out.println("Enter valid choice...");
    }
  }
 }
}
