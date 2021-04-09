class employee
{
private String eid;
private String name;
employee(String  eid, String name)
{
this.eid=eid;
this.name=name;
}
public void display()
{
System.out.println("email id,"+eid);
System.out.println("e name:"+ename);
}
}
class sDemo5
{
public static void main(String arg[])
{
employee e1=new employee("arun@gmail.com","Arun");
employee e2=new employee("balu@gmail.com,"balu");
e1.display();
e2.display();
}
}