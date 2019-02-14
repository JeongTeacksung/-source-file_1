package day1122;

/**
 * Variable Arguments : 
 * �Ű������� �ϳ��ε� �μ��� ������ ���� �� �ִ� ���<br>
 * method �������� �迭�� ó���ȴ�<br>
 * ����) "�������� ... �Ķ���͸�" �������� ����
 * @author Owner
 */
public class VariableArguments {

	/**
	 * ���� ������������ �� �Է� ���� ������ ��� �� ��
	 * @param param ���� ������
	 */
	public void test(int ... param) {
		for (int val : param) {
			System.out.println(val);
		}//end for

		System.out.println("test method called!!!");
	}//test
	
	/**
	 * ���� �μ��� �ޱ����� �Ű������� ���� ���������� ����� �� �ִ�.
	 * @param i ó���Ű�����
	 * @param d �ι�°�Ű�����
	 * @param j ����°�Ű�����
	 */
	public void test1(int i, double d, int ... j) {
		System.out.println("ó�� �Ű����� : "+i);
		System.out.println("�ι�° �Ű����� : "+d);
		System.out.println("����° �Ű����� : "+j);
		for(int idx=0; idx < j.length; idx++) {
			System.out.println(j[idx]);
		}//end for
	}//test
	//���ڿ��� �Է¹��� �� �ִ� �Ű������� ���
	public void printName(String name) {
		System.out.println( name );
	}
	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
//		va.test(1,2,3,4,5);
		va.test1(1,3.14,10,20,30,40,50,60,70,80);
		
		String name = "���ü�";
		va.printName(name);
		
	}//main

}//class