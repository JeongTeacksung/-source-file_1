package day1120;

/**
 * switch~case�� ����� ���� ���ϱ�
 * @author Owner
 */
public class TestSwitchCase {
	
	public static final int GRADE__A_PLUS=10;
	public static final int GRADE__A=9;
	public static final int GRADE__B=8;
	public static final int GRADE__C=7;
	public static final int GRADE__D=6;
	
	public static void main(String[] args) {
		
		int score=100;
//		char grade=' ';//char�� ���ڸ� �����Ѵ�. ''�ڵ�¿� ���ھ���.
						  // ' ' ���鹮��(white space) - unicode \u0000
						  // unicode \u0000�� �ڹ��ڵ��� ���������� ����Ҽ�����.
		char grade=64;
		
		//case�� ����� �������� �������� ������ Constant�� ���
		if(score>=0 && score <=100) {
			switch (score/10) {
			case TestSwitchCase.GRADE__D : grade++;
			case TestSwitchCase.GRADE__C : grade++;
			case TestSwitchCase.GRADE__B : grade++;
			case TestSwitchCase.GRADE__A : 
			case TestSwitchCase.GRADE__A_PLUS : grade++;break;
			default : grade+=6;
/*			case 10 :
			case 9 : grade='A'; break;
			case 8 : grade='B';	break;
			case 7 : grade='C';	break;
			case 6 : grade='D';	break;
			default : grade='F';	
*/			//break;  default�� �Ʒ��ٿ� ����� �ڵ尡 �����Ƿ� �б⹮�� ������� �ʴ´�.
						
			}//end switch
		
			System.out.println(score+"���� ������"+grade);		
		}else {
			System.out.println("������ 0~100�� ���̸� �Է°���!!! �Է�����["
						+score+"]");
		}//end if
		
	}//main

}//class
