package hpack;

public class Adress {
int pin;
String lmark;
String hno;
public Adress(int pin, String lmark, String hno) {
	super();
	this.pin = pin;
	this.lmark = lmark;
	this.hno = hno;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getLmark() {
	return lmark;
}
public void setLmark(String lmark) {
	this.lmark = lmark;
}
public String getHno() {
	return hno;
}
public void setHno(String hno) {
	this.hno = hno;
}
@Override
public String toString() {
	return "Adress [pin=" + pin + ", lmark=" + lmark + ", hno=" + hno + "]";
}

}
