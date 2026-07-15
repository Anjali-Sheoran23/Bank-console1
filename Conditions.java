import java.util.*;
public class Conditions{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:");
        int num=sc.nextInt();
        switch(num){
            case 1:System.out.println("January");
            break;
            case 2:System.out.println("february");
            break;
            case 3:System.out.println("march");
            break;
            case 4:System.out.println("April");
            break;
            case 5:System.out.println("may");
            break;
            default:System.out.println("invalid number of month");
        }
    }
}