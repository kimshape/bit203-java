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
		}//if(reader ==null) true ������ ����κ�
		/*
		 * 
 		���� ���� �Է� , ���⵵ , ���ݵ� �����ϰ� ���� �ڸ��� �ִ�
       ���̸�? �踻��
          ====>>>>>>  �Աݱݾ�? 10000000  ?????
       �Ⱓ(�����)?1
		 */
		
		try {
			System.out.print("���̸�?");
			custName = reader.readLine();
			//????? sub Ŭ�������� override�� �޼ҵ� ȣ���ϵ��� ������ش�
			input();
			System.out.print("�Ⱓ(��)?");
			period = reader.read()-48;
			reader.read();reader.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			/* �������� ���� ���ܰ� �߻������� ��ȸ�� �� �ִ� �ڵ屸��  */
		}
		calc();
	}
	protected abstract void input();
	
	protected abstract void calc() ;
	
	public abstract void  output() ;
	
	
}










