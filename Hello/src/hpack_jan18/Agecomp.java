package hpack;
import java.util.*;
public class Agecomp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		student s1=(student)o1;
		student s2=(student)o2;
		if(s1.stu_id==s2.stu_id)
			return 0;
		else if(s1.stu_id>s2.stu_id)
			return 1;
		else
			return -1;
	}

}
