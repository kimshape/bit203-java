package iotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {
public static void main(String[] args) throws IOException{
	FileInputStream fis = new FileInputStream(new File("readme.txt"));
	int read;
	while((read=fis.read())!=-1) {
		System.out.print((char)read);
	}
	fis.close();
}
}
////    
 // c:/~~~~~~~~~~/20210719>java iotest.TestFileInputStream