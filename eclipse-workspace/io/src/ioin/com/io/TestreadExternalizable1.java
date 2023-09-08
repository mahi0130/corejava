package ioin.com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestreadExternalizable1 {
	public static void main(String[] args)throws Exception {
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\hp\\\\Desktop\\\\ncs\\\\ncs.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		Object o = in.readObject();
		Person p = (Person)o;
		System.out.println(p.address);
		System.out.println(p.id);
		System.out.println(p.name);
		
		in.close();
		file.close();
		
	}
}
