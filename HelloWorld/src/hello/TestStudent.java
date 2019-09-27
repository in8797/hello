package hello;

public class TestStudent {
	int snum;
	String name;
	int ko;
	int en;
	int ma;
	int sum;
	double age;
	
	public TestStudent() {
		
	}
	public TestStudent(int sum, double age) {
		super();
		this.sum = sum;
		this.age = age;
	}
	public TestStudent(int snum, String name, int ko, int en, int ma) {
		this.snum = snum;
		this.name = name;
		this.ko = ko;
		this.en = en;
		this.ma = ma;

	}
	public TestStudent(int snum, String name, int ko, int en, int ma, int sum, double age) {
		super();
		this.snum = snum;
		this.name = name;
		this.ko = ko;
		this.en = en;
		this.ma = ma;
		this.sum = sum;
		this.age = age;
	}
	public int getSum() {
		return ko+en+ma;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAge() {
		
		return age=sum/3;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKo() {
		return ko;
	}
	public void setKo(int ko) {
		this.ko = ko;
	}
	public int getEn() {
		return en;
	}
	public void setEn(int en) {
		this.en = en;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
}
