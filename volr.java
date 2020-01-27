import java.util.*;
class volr
{
int l,b,h;
Scanner s=new Scanner(System.in);
public void set()
{
System.out.println("len");
l=s.nextInt();
System.out.println("bre");
b=s.nextInt();
System.out.println("wid");
h=s.nextInt();
}
public long calv()
{
long v=l*b*h;
return v;
}
public static void main(String [] a)
{
volr  v1=new volr();
v1.set();
long res=v1.calv();
System.out.println(res);
}
}