class bemp
{
int id;
String name;
double sal;
public bemp()
{
id=1;
name="0";
sal=1;
}
public bemp(int id, String name ,double sal)
{
this.id=id;
this.name=name;
this.sal=sal;
}
public void putb()
{
System.out.println("id: "+id+"\nname: "+name+"\nsal: "+sal);
}
}