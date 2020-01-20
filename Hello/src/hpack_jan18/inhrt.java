package hpack;

public class inhrt extends empmanager {
    int numbers;
    int hours;
	@Override
	public String toString() {
		return "inhrt [numbers=" + numbers + ", hours=" + hours + ", emp_id=" + emp_id + ", emp_sal=" + emp_sal
				+ ", emp_name=" + emp_name + ", emp_loc=" + emp_loc + ", a=" + a + "]";
	}	
    public int getNumbers() {
		return numbers;
	}
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	} 
	inhrt(int emp_id,String emp_name,int emp_sal,String emp_loc,int numbers,int hours,Adress a) {
		super(emp_id,emp_name,emp_sal,emp_loc,a);
		// TODO Auto-generated constructor stub
		this.a=a;
		this.numbers=numbers;
		this.hours=hours;	
	}    
    int calSal()
    {
    	return emp_sal*hours*numbers;
    }
}
