import java.util.Scanner;
class VowelOrConsonant
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter the character:");
  char ch=scanner.next().charAt(0);
  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
  {
   System.out.println("Alphabet is vowel");
  }
  else
  {
  System.out.println("Alphabet is consonant");
  }
 }
}   
 