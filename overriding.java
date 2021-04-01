class x
{
public void display()
{
System.out.println("class x");
}
}
class y extends x
{
public void display()
{
System.out.println("class y");
}
}
class overriding
{
public static void main(String a[])
{
x x1= new y();
x1.display();
}
}