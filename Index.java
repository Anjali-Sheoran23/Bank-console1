import java.util.Scanner;
class Index
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter the size of array:");
  int n=scanner.nextInt();
  System.out.println("Enter the element to be searched:");
  int index=scanner.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter the array elements:");
  for(int i=0;i<n;i++)
  {
   System.out.println("Element at index:"+(i+1));
   arr[i]=scanner.nextInt();
  }
  System.out.println("Entered array:");
  for(int i=0;i<n;i++)
  {
   System.out.println(arr[i]+" ");
  }
  for(int i=0;i<n;i++)
  {
   if(arr[i]==index)
   {
    System.out.println("Index:"+i);
   }
   else 
   {
    System.out.println("Element not found(-1)");
   }
  }
 }
} 