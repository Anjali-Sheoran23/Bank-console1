import java.util.Scanner;
public class JaggedArray
{
 public static void main(String[] args)
 {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the number of rows");
  int rows = scanner.nextInt();
  int[][] Arr = new int[rows][];
  for (int i = 0; i<rows; i++) 
  {
   System.out.print("Enter the number of columns for row:" + (i + 1) );
   int columns = scanner.nextInt();
   Arr[i] = new int[columns];
  }
   for (int i = 0; i<rows; i++)
   {
    for (int j = 0; j < Arr[i].length; j++)
    {
     System.out.print("Enter value for rows");
     Arr[i][j] = scanner.nextInt();
    }
   }
     for (int i = 0; i < rows; i++)
     {
      for (int j = 0; j<Arr[i].length; j++)
      {
       System.out.print(Arr[i][j] + " ");
      }
       System.out.println();
    }
}
}