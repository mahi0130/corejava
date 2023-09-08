package in.com.collection;

public class Employee implements Comparable<Employee>{
	private int id=0;
	private String name = null;
	private int salary = 0;
	
	public Employee(int id,String name, int salary){
		this.id=id;
		this.name = name;
		this.salary=salary;
		
	}
	public int getid() {
		return id ;
	}
	public String getname() {
		return name;
	}
	public int getsalary() {
		return salary;
	}
	@Override
	public String toString() {
		
			return id + " " +name+ " "+ salary;
		}
	@Override
	public int compareTo(Employee o) {
		int i = this.name.compareTo(o.name);
		if(i==0) {
		return o.salary-this.salary;
		
		}
		return i;
		
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Employee)) {
			return false;
		}
		 Employee e = (Employee)obj;
		 boolean b = this.id==e.id&&this.salary==e.salary;
		 return b;
		}
	@Override
	public int hashCode() {
		String str = this.id+this.name+this.salary;
		return str.hashCode();
	}
}

	
	
