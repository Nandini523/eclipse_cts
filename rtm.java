import java.io.*;
import java.util.*;
class rtm
{
int id;
String name;
Scanner s=new Scanner(System.in);
public void get()
{
System.out.println("enter id");
id=s.nextInt();
System.out.println("enter name");
name=s.next();
}
public void put()
{
System.out.println("name: "+name);
System.out.println("id: "+id);
}
public static void main(String [] a)
{
rtm r=new rtm();
r.get();
r.put();
}
}