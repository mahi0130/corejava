package ioin.com.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerilisation {
	public static void main(String[] args) throws Exception {
		Marksheet m = new Marksheet();
		m.id=1;
		m.name="Mahi";
		m.Account=82;
		m.bs=85;
		m.eco=98;
		m.total=m.Account + m.bs+ m.eco;
		
		FileOutputStream File = new FileOutputStream("C:\\Users\\hp\\Desktop\\Miss.m\\sivi");
		ObjectOutputStream out = new ObjectOutputStream(File);
		out.writeObject(m);
		
		out.close();
		File.close();
		System.out.println("Object Write Sucessfully");
		
	}
}
