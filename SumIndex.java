import java.util.Scanner;
public class SumIndex{
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
int odd=0;
int even=0;
for(int i=0;i<size;i++)
{
if(i%2==0)
{
even=even+i;
}
else{
odd=odd+i;
}}
System.out.println("Sum of odd index is:" +odd);
System.out.println("Sum of even index is:" +even);
System.out.println("difference between sum of odd and even index is(odd-even):" +(odd-even));
}}



