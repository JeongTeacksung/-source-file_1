package day1119;

/**
 * switch~case : ������ ���� �� (JDK1.7�������ʹ� ���ڿ��� �񱳰���)<br>
 * ����) switch(������){<br>
 * 			case ��� : ���๮��;<br>
 * 			case ��� : ���๮��;<br>
 * 			case ��� : ���๮��;<br>
 *						. <br>
 *						. <br>
 *			default : ��ġ�ϴ� ����� ���� �� ���๮��;<br>
 *			}<br>
 * @author Owner
 */
public class TestSwitchCase {

	public static void main(String[] args) {
//		String i="1"; jdk 1.7���� ���ʹ� ���ڿ��� ����
		int i=0;
		
		//switch�� �ԷµǴ� ������ ���������� byte, short, int, char, string
		switch (i) {
		//case�� �ԷµǴ� ������ ���� �ٸ� ��������� ������.
		case 0 : System.out.println("����");
		case 1 : System.out.println("��ħ");
		case 2 : System.out.println("����");
		default : System.out.println("����");
		}//end switch
		
	}//main

}//class
