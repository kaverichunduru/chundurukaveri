import java.util.scanner;
public class divisible_by_3
{
public static void main(string[] args);
Scanner sc=new  Scanner(System.in);
int n=sc.nextInt();
int sum=0;
for(int i=0;i<=n;i++)
{
if(i%2==0)
{
if(i%3==0)
{
sum=sum+i;
}
}
}
System.out.println("+sum");
}