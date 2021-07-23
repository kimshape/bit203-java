package homework;

import java.io.IOException;

public class SavingsBankBook extends BankBook {
	protected int savingsAmount; //����ݾ�
	private static int count;//**** ����Ŭ������ ���� ????  2021.07.23 Ȯ���ʿ�
	protected  static double rate = 4.5 ;//4.5%
	//������
	public SavingsBankBook() {
		accountNum = String.format("%3d-%04d",BankCode.SAVINGS_ACCOUNT ,++count);
	}
	
	@Override
	protected void input() {
		// TODO Auto-generated method stub

		try {
			System.out.print("����ݾ�?");
			savingsAmount = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			System.out.println(",�� Ư������ ������� ���ð� ��ġ�� ������");
			input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("����~~~  ==>"+e.getMessage());
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
				"%8s%10s%10s%4s(��)%6s%10s%10s\n",
				"���̸�","���¹�ȣ","����ݾ�","�Ⱓ","����","����","�����ȯ�ޱ�");
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







