class Student
{
private String name;
private String status;
public Student(String name,String status)
{
this.name=name;
this.status=status;
}
void display()
{
System.out.println("name:"+name);
System.out.println("status:"+status);
}
}
class ScienceStudent extends Student
{
private int practical;
public ScienceStudent(String name,String status,int practical)
{
super(name,status);
this.practical=practical;
}
public void display()
{
super.display();
System.out.println("practical:"+practical);
}
}
class ArtsStudent extends Student
{
private int project;
public ArtsStudent(String name,String status,int project)
{
super(name,status);
this.project=project;
}
public void display()
{
super.display();
System.out.println("project:"+project);
}
}
class pDemo4
{
public static void main(String a[])
{
Student S1=new ScienceStudent("anji","fail",10);
Student S2=new ArtsStudent("rahul","pass",25);
S1.display();
S2.display();
}
}








