package day1126;

/**
 * this�� ����� ������ ȣ��
 * @author Owner
 */
public class ThisConstructor {
	public ThisConstructor() {
//		this(26);
		System.out.println("�⺻ ������");
	}//ThisConstructor
	
	public ThisConstructor(int i) {
		this();
		System.out.println("�����ִ� ������");
//		this(); //�������� ù��° �ٿ����� ��밡��
	}//ThisConstructor
	

	public static void main(String[] args) {

		new ThisConstructor();
		new ThisConstructor(24);
		
		
	}//main

}//class
