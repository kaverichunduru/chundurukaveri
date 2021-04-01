class X
{
public void display()
{
System.out.println("class X");
}
}
class Y extends X
{
public void display()
{
System.out.println("class Y");
}
}
class overloading
{
public static void main(String a[])
{
X X1=new Y();
X1.display();
}
}


