import java.util.*;
import java.io.*;
class minp
{
public static void main(String [] ar)
{
Scanner s=new Scanner(System.in);
System.out.println("enter n");
int n=s.nextInt();
int []a=new int[n];
System.out.println("enter"+ n+"elements");
for(int i=0;i<n;i++)
a[i]=s.nextInt();
minp o=new minp();
int m=o.min(a);
System.out.println(m);
}
public int min(int [] a)
{
int d=0,n=a[d];
for(d=1;d<a.length;d++)
{
if(a[d]>n)
n=a[d];
}
return n;
}
}