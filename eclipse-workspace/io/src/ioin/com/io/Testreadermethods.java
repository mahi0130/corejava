package ioin.com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

public class Testreadermethods {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\hp\\Desktop\\keybord\\mouse.txt");
		if(f.exists()) {
			System.out.println("name "+f.getName());
			System.out.println("Absolute path "+ f.getAbsolutePath());
			System.out.println("Is writable "+f.canWrite());
			System.out.println("is readable "+f.canRead());
			System.out.println("Is file "+ f.isFile());
			System.out.println("Is Directory "+f.isDirectory());
			System.out.println("last modified at"+new Date(f.lastModified()));
			System.out.println("size "+f.length()+"bytes long ");
			
			
			
			
			
			
			
			
		}
			
		}
		
	}


