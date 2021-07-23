package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class BankBook {
	protected String custName;
	protected String accountNum;
	protected int period;
	protected double rate;
	protected long interest;
	protected long total;

	protected BufferedReader reader;

	public void baseInput() {
		if (reader == null) {
			reader = new BufferedReader(new InputStreamReader(System.in));
		} // if(reader ==null) true 구문의 종료부분
		/*
		 * 
		 * 저축 관련 입력 , 대출도 , 적금도 동일하게 받을 자리가 있다 고객이름? 김말자 ====>>>>>> 입금금액? 10000000 ?????
		 * 기간(년단위)?1
		 */
		System.out.print("고객이름?");
		try {
			
			custName = reader.readLine();
			// ????? sub 클래스에서 override한 메소드 호출하도록 만들어준다
			input();
			System.out.print("기간(년)?");
			period = reader.read() - 48;
			reader.read();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calc();
	}

	protected abstract void input();

	protected abstract void calc() {

	}

	public abstract void output();
}
