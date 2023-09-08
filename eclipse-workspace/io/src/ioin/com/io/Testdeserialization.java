package ioin.com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Testdeserialization {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\hp\\\\Desktop\\\\Miss.m\\\\sivi");
		ObjectInputStream in = new ObjectInputStream(file);
		Object o = in.readObject();
		Marksheet m = (Marksheet)o;
		System.out.println(m.id);
		System.out.println(m.name);
		System.out.println(m.Account);
		System.out.println(m.bs);
		System.out.println(m.eco);
		System.out.println(m.total);
		
		in.close();
		file.close();
		
		
	}
	

}
