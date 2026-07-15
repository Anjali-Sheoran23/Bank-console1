import java.util.Scanner;
class MinMaxNumber
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
   System.out.println("value at index:"+(i+1));
   arr[i]=scanner.nextInt();
  }
  System.out.println("Entered array:");
  for(int i=0;i<n;i++)
  {
   System.out.println(arr[i]+" ");
  }
  int max=arr[0];
  int min=arr[0];
  for(int i=0;i<n;i++)
  {
  if(arr[i]>max)
  {
  max=arr[i];
  }
  }
  System.out.println("maximum="+max);
  for(int i=0;i<n;i++)
  {
    if(arr[i]<min)
    {
        min=arr[i];
    }
  }
  System.out.println("Minimum="+min);
 }
}
  
  