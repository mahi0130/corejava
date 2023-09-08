package testshivamsir;

public class Employee {
	private int id = 0;
	private String name = null;
	private int salary = 0;
	
	public Employee(int id ,String name,int salary) {
		this.id=id;
		this.name = name;
		this.salary = salary;
	}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public int getsalary() {
		return salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (id+" "+name+" "+salary);
	}
}
