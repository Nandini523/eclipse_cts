import java.io.*;
import java.util.*;
class arr
{
public static void main(String ar[])
{
int a[]={20,1,5,15,3,2};
for( int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("Assending:");
for(int d:a)
System.out.print(d+" ");
for( int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]<a[j])
{
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("\nDescending:");
for(int d:a)
System.out.print(d+" ");
}
}