package iotest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Member member = new Member(123, "kim malja", "123");
		
		FileOutputStream fileOutputStream;
		ObjectOutputStream objectOutputStream;
		try {
			fileOutputStream = new FileOutputStream( "20210722.dat" );
			objectOutputStream = new ObjectOutputStream( fileOutputStream   );
			objectOutputStream.writeObject(member);
			objectOutputStream.flush();
			//System.out.println("1");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
		
	}

}
