import java.util.Scanner;
class OddOrEven
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter the size of array:");
  int n=scanner.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter the array values:");
  for(int i=0;i<n;i++)
  {
  System.out.println("Element at index:"+(i+1));
  arr[i]=scanner.nextInt();
  }
  System.out.println("Entered array elements:");
  for(int i=0;i<n;i++)
  {
  System.out.println(arr[i]+" ");
  }
  for(int i=0;i<n;i++)
  {
   if(arr[i]%2==0)
   {
    System.out.println(i+" " +"even number");
   }
   else
   {
    System.out.println(i+" " +"odd number");
   }
  }
 }
} 