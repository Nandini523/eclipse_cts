package assign;
class hosteller extends student {
String hname;
int rno;
public hosteller(int s_id, int c_id, String name, String gender, String pno,String hname,int rno) {
	super(s_id, c_id, name, gender, pno);
	// TODO Auto-generated constructor stub
	this.hname=hname;
	this.rno=rno;
	
}
public String getHname() {
	return hname;
}
public void setHname(String hname) {
	this.hname = hname;
}
public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
@Override
public String toString() {
	return "hosteller [hname=" + hname + ", rno=" + rno + ", s_id=" + s_id + ", c_id=" + c_id + ", name=" + name
			+ ", gender=" + gender + ", pno=" + pno + "]";
}
}
