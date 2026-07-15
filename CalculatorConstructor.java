public class CalculatorConstructor 
{
 private double number1;
 private double number2;
 public CalculatorConstructor(double num1, double num2)
 {
  this.number1 = num1;
  this.number2 = num2;
 }
   public double add()
 {
  return number1 + number2;
 }
  public double subtract()
 {
  return number1 - number2;
 }
   public double multiply() 
 {
   return number1 * number2;
 }
    public double divide() 
 {
    if (number2 != 0) 
  {
    return number1 / number2;
  } 
   else
  {
   System.out.println("Error: Division by zero is not allowed.");
   return Double.NaN; 
  }
 }
  public static void main(String[] args)
 {
  CalculatorConstructor myCalculator = new CalculatorConstructor(10.0, 5.0);
  System.out.println("Addition: " + myCalculator.add());
  System.out.println("Subtraction: " + myCalculator.subtract());
  System.out.println("Multiplication: " + myCalculator.multiply());
  System.out.println("Division: " + myCalculator.divide());
  CalculatorConstructor zeroDivisionCalculator = new CalculatorConstructor(10.0, 0.0);
  System.out.println("Division by zero test: " + zeroDivisionCalculator.divide());
}
}
