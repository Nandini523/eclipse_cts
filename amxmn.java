import java.io.*;
import java.util.*;
class arr
{
public static void main(String ar[])
{
int a[]={20,1,5,15,3,2,1};
int i=0,b=0;
int min=a[i];
for( i=1;i<a.length;i++)
{
if(a[i]<min)
min=a[i];
}
System.out.println("min is: "+min);
int max=a[b];
for( b=1;b<a.length;b++)
{
if(a[b]>max)
max=a[b];
}
System.out.println("max is: "+max);
}
}