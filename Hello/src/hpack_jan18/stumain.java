package hpack;
import java.util.*;
public class stumain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
a.add(new student(523,"nandu","cse",8.3));
a.add(new student(529,"appu","cse",8.4));
a.add(new student(540,"gaayi","ece",7.3));
System.out.println("sort by name");
Collections.sort(a,new Namecomp());
Iterator i=a.iterator();
while(i.hasNext())
{
	student st=(student)i.next();
	System.out.println(st.stu_id+" "+st.stu_name+" "+st.stu_branch);
	}

System.out.println("sort by id");
Collections.sort(a,new Agecomp());
Iterator i1=a.iterator();
while(i1.hasNext())
{
	student st=(student)i1.next();
	System.out.println(st.stu_id+" "+st.stu_name+" "+st.stu_branch);
	}
	}
}
