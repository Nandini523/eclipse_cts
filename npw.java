import java.util.*;
class npw
{
public static void main(String [] a)
{
int i=1,j=1;
Scanner s=new Scanner(System.in);
System.out.println("enter n");
int n=s.nextInt();
while(i<=n)
{
j=1;
while(j<=i)
{
System.out.print(j);
j++;
}
System.out.print("\n");
i++;
}
}
}