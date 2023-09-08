
package ioin.com.io;

import java.io.FileReader;
import java.util.Scanner;

public class Testscanner {
	public static void main(String[] args)throws Exception {
		FileReader file = new FileReader("C:\\Users\\hp\\Desktop\\Miss.m\\Miss.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		file.close();
		
	}
}
