public class SecondLargestElement
{
 public static int findSecondLargest(int[] arr)
 {
  if (arr == null || arr.length < 2)
  {
   System.out.println("Cannot find Second largest");
   return -1;
  }
  int largest = Integer.MIN_VALUE;
  int secondLargest = Integer.MIN_VALUE;
  for (int i = 0; i < arr.length; i++) 
  {
   if (arr[i] > largest) 
   {
    secondLargest = largest;
    largest = arr[i];
   } 
   else if (arr[i] > secondLargest && arr[i] != largest) 
   {
    secondLargest = arr[i];
   }
  }
  return secondLargest;
  }
  public static void main(String[] args)
  {
   int[] numbers = {10, 20, 4, 45, 99, 99, 67};
   int secondLargest = findSecondLargest(numbers);
   if (secondLargest == Integer.MIN_VALUE)
   {
    System.out.println("Could not find a valid second largest element.");
   } 
   else 
   {
    System.out.println("The second largest element is: " + secondLargest);
   } 
}
}