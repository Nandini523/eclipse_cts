import java.util.*;
class vol
{
int l,b,w;
public void set(int l,int b,int w)
{
this.l=l;
this.b=b;
this.w=w;
}
public int  calv()
{
int v=l*b*w;
return v;
}
public static void main(String []a)
{
vol v1 =new vol();
v1.set(10,2,3);
int v2=v1.calv(); 
System.out.println(v2);

}
}