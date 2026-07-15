import java.util.Scanner;
public class SecondLargeArray{
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
System.out.println( );
System.out.println("entered array is:" );
for(int i=0;i<size;i++)
{
System.out.print(arr[i] +" " );
}
int temp=0;
for(int i=0;i<size;i++)
{
for(int j=i+1;j<size;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}}
System.out.println("second largest elemeent is :" +arr[size-2]);
}}


