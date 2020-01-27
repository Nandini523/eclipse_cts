import java.util.*;
class strn
{
public static void main(String []a)
{
Scanner s=new Scanner(System.in);
System.out.println("enter n");
int n=s.nextInt();
int d=n-1;
for(int i=1;i<=n;i++)
{
for(int j=d;j>=1;j--)
System.out.print(" ");
d--;
for(int k=1;k<=2*i-1;k++)
System.out.print("*");
System.out.print("\n");
}
}
}