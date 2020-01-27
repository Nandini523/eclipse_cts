import java.util.*;
class num_pat
{
public static void main(String [] a)
{
Scanner s=new Scanner(System.in);
System.out.println("enter n");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.print("\n");
}
}

}