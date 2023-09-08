package ioin.com.io;


import java.io.FileWriter;

public class Testwriter {
	public static void main(String[] args)throws Exception {
		FileWriter file = new FileWriter("C:\\Users\\hp\\Desktop\\mahi//shiv.txt");
		file.write("everything will be fine\n");
		file.write("mahi");
		file.close();
	}
}
