package use;

import java.util.Scanner;

import homework.BankBook;
import homework.LoanBankBook;
import homework.SavingsBankBook;

/**
 * 
 * @author bitcamp init() ==> �ű������� ����ϴ�. ���ϴ� ��ȣ�� �������� 1. ���� 2. ���� 3. ���� 0. ����
 *         �����ϰ� BankBook Ŭ�������� ����� �� �ֵ��� ó���� ���ִ� �޼ҵ� ȣ��
 * 
 *         main() ���� �� ���� �ܼ��� BankBookApp�� init() ȣ���ϴ� ��
 */
public class BankBookApp {
	private Scanner in = new Scanner(System.in);

	public void init() {
		System.out.println("�ű������� ����ϴ�. ���ϴ� ��ȣ�� 0~3���� ���� ��������. \r\n   1. ���� 2. ���� 3. ���� 0. ����");
		BankBook bankBook= null;
		switch (in.nextInt()) {
		case 1:
			bankBook = new SavingsBankBook();
			//bankBookCreateProcess(new SavingsBankBook());
//			bankBook.baseInput();
//			bankBook.output();
//			init();
			break;
		case 2:

			break;
		case 3:
			bankBook = new LoanBankBook();
//			bankBook.baseInput();
//			bankBook.output();
//			init();
			break;
		case 0:
			System.out.println("���α׷� ����");
			System.exit(0);
			//return ;

		default:
			System.out.println("���α׷� ó������ �����մϴ�. �˸��� ��ȣ�� �Է��ϼ���");
			init();
		}
		
		bankBookCreateProcess(bankBook);
		init();
	}//init()  end
//	public void bankBookCreateProcess(LoanBankBook bankBook) {
//		bankBook.baseInput();
//		bankBook.output();
//	}
//	public void bankBookCreateProcess(SavingsBankBook bankBook) {
//		bankBook.baseInput();
//		bankBook.output();
//	}

	public void bankBookCreateProcess(BankBook bankBook) {
		bankBook.baseInput();
		bankBook.output();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//init();
		BankBookApp  app = new BankBookApp();
		app.init();
	}

}
