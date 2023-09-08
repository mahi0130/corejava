package in.com.collection;

public class Testequalhashcode {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Mahi",500000);
		Employee e2 = new Employee(1,"Mahi",500000);
		String s = "java";
		System.out.println(e1.equals(s));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
