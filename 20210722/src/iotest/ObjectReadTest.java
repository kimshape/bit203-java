package iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream=null;
		ObjectInputStream objectInputStream=null;
		try {
			fileInputStream = new FileInputStream("20210722.dat");
			System.out.println("파일존재");
			objectInputStream = new ObjectInputStream( fileInputStream  );
			//Object  obj = objectInputStream.readObject() ;
			Member member = (Member)objectInputStream.readObject() ;
			System.out.println(member.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(objectInputStream != null) objectInputStream.close();
			if(fileInputStream != null) fileInputStream.close();
		}
		
		
		
	}

}
