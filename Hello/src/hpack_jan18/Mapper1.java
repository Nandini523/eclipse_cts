package hpack;
import java.util.*;
public class Mapper1 {
public static void main(String [] ar)
{
	Map<Integer,student> m=new HashMap<Integer,student>();
	student s=new student(523,"nandu","cse");
	student s1=new student(530,"appu","ece");
	student s2=new student(545,"gayi","mech");
	m.put(1,s);
	m.put(2,s1);
	m.put(3,s2);
	for(Map.Entry<Integer,student> entry:m.entrySet())
	{
		int k=entry.getKey();
	    student v=entry.getValue();
		System.out.println(k);
		System.out.println(v.stu_id+" "+v.stu_name+" "+v.stu_branch);
	}
	}
}
