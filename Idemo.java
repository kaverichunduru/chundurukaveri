interface shape
{
public abstract void display();
}
class circle implements shape
{
public void display()
{
System.out.println("circle");
}
}
class rectangle implements shape
{
public void display()
{
System.out.println("rectangle");
}
}
class square implements shape
{
public void display()
{
System.out.println("square");
}
}
class Idemo
{
public static void main(String a[])
{
shape s1=new circle();
shape s2=new rectangle();
shape s3=new square();
s1.display();
s2.display();
s3.display();
}
}
