package in.com.collection;

import java.util.Comparator;

public class OrderbyEmplooyee implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getid()-o2.getid();
		}
	
}
	class Orderbyasc implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getname().compareTo(o2.getname());
		}
		
	}
	class orderbynamedsc implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o2.getname().compareTo(o1.getname());
		}
		
	}
	class orderbysalary   implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getsalary()-o2.getsalary();
		}
	}
