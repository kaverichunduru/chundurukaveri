class point
{
double X;
double Y;
point(double X,double Y)
{
this.X=X;
this.Y=Y;
}
public static double distance(point p1,point p2)
{
double pdistance;
double Xdiff=p2.X-p1.X;
double Ydiff=p2.Y-p1.Y;
double SumOfSquares=Math.pow(Xdiff,2)+Math.pow(Ydiff,2);
pdistance=Math.sqrt(SumOfSquares);
return pdistance;
}
public static void main(String a[])
{
point p1=new point(10,20);
point p2=new point(5,10);
double distance=distance(p1,p2);
System.out.println(distance);
}
}
