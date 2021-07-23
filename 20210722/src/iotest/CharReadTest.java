package iotest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharReadTest {

	public static void main(String[] args) throws IOException {
		// readme.txt ==> char stream  
		// File Reader  1:1 
		// BufferReader
		File file = new File("c:/datas/readme.txt");
		if(!file.exists()) {
			if(file.createNewFile()) {
				System.out.println("ok");
			}else {
				System.out.println("예기치 않은 문제 발생");
			}
		}
		System.out.println("----파일존재한다---");
		//FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		
		System.out.println(bufferedReader.readLine() );
		
	}

}













