import java.util.*;
public class Functions{
    public static void Table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
            return;
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        Table(n);
    }
}