package oop.in.com;

public class personencapsulation {
	private String name;
	private int age;
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;		
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		if(age>=0) {
			this.age = age;
		}else {
			System.out.println("invalid user");
		}
	}
}
class main {
	public static void main(String[]args) {
		personencapsulation p = new personencapsulation ();
		p.setage(25);
		p.setname("sanem");
		System.out.println("age "+p.getage());
		System.out.println("name "+p.getname());
	}
}
