package ioin.com.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Readbykeyboard {
	public static void main(String[] args)throws Exception {
		
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);
		FileWriter write = new FileWriter ("C:\\Users\\hp\\Desktop\\keybord\\mouse.txt",true);
		PrintWriter out = new PrintWriter(write);
		String line = in.readLine();
		while(!(line.equals("byee"))) {
			out.println(line);
			line = in.readLine();
		}
		System.out.println("this compler is stopped....");
		
		out.close();
		write.close();
		in.close();
		isReader.close();
		
	}

}
