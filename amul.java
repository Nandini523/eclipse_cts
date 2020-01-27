import java.io.*;
import java.util.*;
class arr
{
public static void main(String ar[])
{
int a[][]={{3,4},{1,2}};
int [][]b={{4,5},{6,7}};
int [][]c=new int[2][2];
for(int i=0;i<c.length;i++)
{
for(int j=0;j<c.length;j++)
{
c[i][j]=0;
for(int k=0;k<c.length;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}