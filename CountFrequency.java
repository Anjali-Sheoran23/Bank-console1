class CountFrequency
{
 public static void main(String[] args)
 {
  int arr[]={4,3,2,4,3,2};
  int i,j;
  boolean arr1[]=new boolean[arr.length];
  for(i=0;i<arr.length;i++)
  {
    if(arr1[i]==true)
    {
        continue;
    }
    int count=1;
  for(j=i+1;j<arr.length;j++)
  {
   if(arr[i]==arr[j])
   {
    
    count++;
    arr1[j] = true;
   }
  }
  System.out.println(arr[i]+":"+count);
  }
 }
}
    