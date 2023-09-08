package ioin.com.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Testwriteexternalizable {
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		p.id = 1;
		p.name = "paru";
		p.address = "indore";

		FileOutputStream file = new FileOutputStream("C:\\Users\\hp\\Desktop\\io\\nc.txt");

		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(p);

		out.close();
		file.close();

		System.out.println("object write sucessfully....");

	}

}
