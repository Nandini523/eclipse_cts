package assign;
class student
{
	int s_id,c_id;
	String name,gender,pno;
	public student(int s_id, int c_id, String name, String gender, String pno) {
		super();
		this.s_id = s_id;
		this.c_id = c_id;
		this.name = name;
		this.gender = gender;
		this.pno = pno;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	@Override
	public String toString() {
		return "stu [s_id=" + s_id + ", c_id=" + c_id + ", name=" + name + ", gender=" + gender + ", pno=" + pno + "]";
	}
	}
 