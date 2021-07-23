package homework;

import java.io.IOException;

public class SavingsBankBook extends BankBook {
	protected int savingsAmount; //저축금액
	private static int count;//**** 기초클래스로 빼면 ????  2021.07.23 확인필요
	protected  static double rate = 4.5 ;//4.5%
	//생성자
	public SavingsBankBook() {
		accountNum = String.format("%3d-%04d",BankCode.SAVINGS_ACCOUNT ,++count);
	}
	
	@Override
	protected void input() {
		// TODO Auto-generated method stub

		try {
			System.out.print("저축금액?");
			savingsAmount = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			System.out.println(",나 특수문자 사용하지 마시고 수치만 쓰세요");
			input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("예상~~~  ==>"+e.getMessage());
			input();
		}
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
//		System.out.println(custName);
//		System.out.println(period);
//		System.out.println(savingsAmount);
//		System.out.println(accountNum);
		
		
		System.out.printf(
				"%8s%10s%10s%4s(년)%6s%10s%10s\n",
				"고객이름","계좌번호","저축금액","기간","이율","이자","만기시환급금");
		System.out.printf(
				"%10s%10s%,10d%4d  %4.1f%% %,10d%,10d\n",
				custName,accountNum,savingsAmount,period,rate,interest,total);
		

	}

	@Override
	protected void calc() {
		// TODO Auto-generated method stub
		//10000 + ( 10000 *10/100) * 3
		interest = (long) (savingsAmount * rate /100 );
		total = savingsAmount + interest * period ;
	}

}







