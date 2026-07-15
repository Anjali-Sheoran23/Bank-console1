import java.util.Scanner;
public class SumArray{
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
System.out.println("enter the target sum:");
int target_sum=sc.nextInt();
for(int i=0;i<size;i++)
{
for(int j=i+1;j<size;j++)
{
if(arr[i]+arr[j]==target_sum)
{
System.out.println(arr[i] +" , " +arr[j]); 
}}}
}}

