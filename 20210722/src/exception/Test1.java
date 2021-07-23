package exception;

import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 0;
		//System.out.println(a/b);
		
		String as="1234 5";
		try{int c = Integer.parseInt(as);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

