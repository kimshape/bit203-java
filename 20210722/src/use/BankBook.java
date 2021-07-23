package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class BankBook {
	protected  String custName;
	protected  String accountNum;
	protected  int period;
	/* protected static double rate ; */
	protected  long interest; 
	protected  long total;
	
	protected static BufferedReader reader;
	
	public void  baseInput()  {
		if(reader ==null) {
			reader = new BufferedReader(
					   new InputStreamReader( System.in)
					);
		}//if(reader ==null) true 구문의 종료부분
		/*
		 * 
 		저축 관련 입력 , 대출도 , 적금도 동일하게 받을 자리가 있다
       고객이름? 김말자
          ====>>>>>>  입금금액? 10000000  ?????
       기간(년단위)?1
		 */
		
		try {
			System.out.print("고객이름?");
			custName = reader.readLine();
			//????? sub 클래스에서 override한 메소드 호출하도록 만들어준다
			input();
			System.out.print("기간(년)?");
			period = reader.read()-48;
			reader.read();reader.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			/* 예상하지 못한 예외가 발생했을때 우회할 수 있는 코드구문  */
		}
		calc();
	}
	protected abstract void input();
	
	protected abstract void calc() ;
	
	public abstract void  output() ;
	
	
}










