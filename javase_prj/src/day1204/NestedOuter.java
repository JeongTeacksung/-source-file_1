package day1204;

/**
 * ����Ŭ������ static ����ó�� ����� �� �ִ� ��øŬ����
 * @author Owner
 */
public class NestedOuter {

	int i;
	static int j;
	
	public NestedOuter() {
		System.out.println("�ٱ� Ŭ������ ������");
	}//NestedOuter
	
	public void outInstMethod() {
		System.out.println("�ٱ� Ŭ������ instance method");
	}//outInstMethod
	
	public static void outStatMethod() {
		System.out.println("�ٱ� Ŭ������ static method");
	}//outStatMethod
	
	///////////////////Nested class ����//////////////////////////
	static class NestedInner{
//		int in_i; //instance ���� - ��밡�������� ������������
		static int in_j; //static ����
//		public NestedInner() {//������ - ��밡�������� ������������
//		}
		public void inMethod() {
			System.out.println("���� Ŭ������ instance method");
		}//inMethod
		
		public static void inStatMethod() {
			System.out.println("���� Ŭ������ static method");
			System.out.println("�ٱ� Ŭ������ �ڿ� ��� i = ���Ұ�,  j = "+
					NestedOuter.j);
//			outInstMethod();// instance������ method�̹Ƿ� ����� �� ����.
			NestedOuter.outStatMethod();
			
		}//inStatMethod
		
	}//class
	///////////////////Nested class ��//////////////////////////
	public static void main(String[] args) {
		//static ������ ����� ������ ��üȭ ���� Ŭ������.������
		//Ŭ������.method������ ����Ѵ�.
		NestedInner.inStatMethod();
	}//main

}//class
