
public class Student {
private int sno;
private String name;
private LunchBox lunchbox;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LunchBox getLunchbox() {
	return lunchbox;
}
public void setLunchbox(LunchBox lunchbox) {
	this.lunchbox = lunchbox;
}
public void display(){
	System.out.println("Sno "+sno+" Name "+name);
	lunchbox.eat();
}
}
