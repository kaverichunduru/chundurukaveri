class Array
{
public static void main(String arg[])
{
int arr[]={1,2,3,4,5};
int max=arr[0];int i;
for(i=1;i<arr.length;i++)
if(arr[i]>max)
max=arr[i];
System.out.println("the largest number in array="+max);
}
}