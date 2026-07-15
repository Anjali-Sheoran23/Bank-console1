import java.util.*;
public class Loops{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter marks:");
            int marks=sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("This is good");
            }
            else if(marks>=60 && marks<=89){
                System.out.println("This is also good");
            }
            else if(marks>=0 && marks<=59){
                System.out.println("This is good as well");
            }
            else{
                System.out.println("Invalid marks");
            }
            System.out.println("Enter your choice:1->continue to enter marks,0->stop program");
            num=sc.nextInt();
        }
        while(num==1);
    }
}