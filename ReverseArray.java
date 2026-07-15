import java.util.Scanner;
public class ReverseArray{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array:");
int size=sc.nextInt();
int arr[]=new int[size];
System.out.println("enter the array elements:");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("entered array is:");
for(int i=0;i<size;i++)
{
System.out.print(arr[i] +" ");
}
System.out.println( );
System.out.println("reverse array is:");
for(int i=size-1;i>=0 && i<size;i--)
{
System.out.print(arr[i] +" ");
}
System.out.println( );
}
}

