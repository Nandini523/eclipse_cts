package over;
class Engine
{
	String fueltype;
	int age,engum;
	public Engine(String fueltype, int age, int engum) {
		super();
		this.fueltype = fueltype;
		this.age = age;
		this.engum = engum;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEngum() {
		return engum;
	}
	public void setEngum(int engum) {
		this.engum = engum;
	}
	@Override
	public String toString() {
		return "Engine [fueltype=" + fueltype + ", age=" + age + ", engum=" + engum + "]";
	}
	}
class Mcar
{
	Engine e;
	String carmodel;
	String carno;
	public Mcar(Engine e, String carmodel, String carno) {
		super();
		this.e = e;
		this.carmodel = carmodel;
		this.carno = carno;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	@Override
	public String toString() {
		return "Mcar [e=" + e + ", carmodel=" + carmodel + ", carno=" + carno + "]";
	}
	
	}
public class Hasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Mcar m=new Mcar(new Engine("hx",5,32),"maruthi","maru_523");
      System.out.println(m);
	}

}
