package use;

import java.util.Scanner;

import homework.BankBook;
import homework.LoanBankBook;
import homework.SavingsBankBook;

/**
 * 
 * @author bitcamp init() ==> 신규통장을 만듭니다. 원하는 번호를 누르세요 1. 저축 2. 적금 3. 대출 0. 종료
 *         선택하고 BankBook 클래스들이 실행될 수 있도록 처리할 수있는 메소드 호출
 * 
 *         main() 에서 할 일은 단순히 BankBookApp의 init() 호출하는 것
 */
public class BankBookApp {
	private Scanner in = new Scanner(System.in);

	public void init() {
		System.out.println("신규통장을 만듭니다. 원하는 번호를 0~3사의 수를 누르세요. \r\n   1. 저축 2. 적금 3. 대출 0. 종료");
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
			System.out.println("프로그램 종료");
			System.exit(0);
			//return ;

		default:
			System.out.println("프로그램 처음부터 시작합니다. 알맞은 번호를 입력하세요");
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
