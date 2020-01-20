package hpack;
import java.util.*;
public class Namecomp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		student s1=(student)o1;
		student s2=(student)o2;
		return s1.stu_name.compareTo(s2.stu_name);
	}

}
