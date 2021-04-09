class employee
{
private int id;
private String name;
employee(int id,String name)
{
this.id=id;
this.name=name;
}
public void display()
{
System.out.println("employee id:"+id);
System.out.println("name:"+name);
}
}
class edemo4
{
public static void main(String a[])
{
employee e1=new employee(445,"kaveri");
employee e2=new employee(420,"prasanna");
e1.display();
e2.display();
}
}