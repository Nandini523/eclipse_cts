package hpack;

 class student {
int stu_id;
String stu_name;
String stu_branch;
double cgpa;

public student(int stu_id, String stu_name, String stu_branch, double cgpa) {
	super();
	this.stu_id = stu_id;
	this.stu_name = stu_name;
	this.stu_branch = stu_branch;
	this.cgpa = cgpa;
}

@Override
public String toString() {
	return "student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_branch=" + stu_branch + ", cgpa=" + cgpa
			+ "]";
}

 }







