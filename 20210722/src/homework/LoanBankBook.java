package homework;

import java.io.IOException;

public class LoanBankBook extends BankBook {
	protected int monthlyPaidAmount;
	private static int count;
	protected  static double rate = 7.8 ;//7.8%
	public LoanBankBook() {
		// accountNum = "300-" + ++count; // 300-0001
		accountNum = String.format("%3d-%04d", BankCode.LOAN_ACCOUNT, ++count);
	}

	@Override
	public void input() {

		try {
			System.out.print("����ݾ�?");
			total = Long.parseLong(reader.readLine());
		} catch (NumberFormatException e) {
			System.out.println(",�� Ư������ ������� ���ð� ��ġ�� ������");
			input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void calc() {
		//'(10000 + (10000 * 10 /100) ) / (3*12)
		interest = (long) (total * rate /100);
		monthlyPaidAmount = (int)((total + interest) / (period * 12));
	}

	@Override
	public void output() {
//		System.out.println(custName);
//		System.out.println(period);
//		System.out.println(total);
//		System.out.println(accountNum);
		
//		 ���̸�   ���¹�ȣ    �Աݾ�       �Ⱓ   ����      ����     ����ȯ�޾�
//		   �踻��    100-0001  10000000     1    4.5%   
//		
		
		System.out.printf(
				"%8s%10s%10s%4s(��)%6s%10s%10s\n",
				"���̸�","���¹�ȣ","����ݾ�","�Ⱓ","����","����","���Աݾ�");
		System.out.printf(
				"%10s%10s%,10d%4d  %4.1f%% %,10d%,10d\n",
				custName,accountNum,total,period,rate,interest,monthlyPaidAmount);
		
	}
}






