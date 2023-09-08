package ioin.com.io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Printwriter {
	public static void main(String[] args)throws Exception {
		FileWriter file = new FileWriter("C:\\Users\\hp\\Desktop\\mahi//shiv.txt",true);
		PrintWriter out = new PrintWriter(file);
		out.println("hello how are you ");
		out.close();
		file.close();
		
		
	}
}
