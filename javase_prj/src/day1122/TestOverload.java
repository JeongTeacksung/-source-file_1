package day1122;

/**
 * ������ : method Overload<br>
 * �ϳ��� Ŭ�������� ���� �̸��� method�� ������ �ۼ��ϴ� ��.<br>
 * ��Ģ) ���������� ��ȯ�� method���� �����ϰ� ����� 
 * 		�Ű������� �ٸ��� �ۼ�.
 */
public class TestOverload {
	
	/**
	 *  ���� �ϳ� ����ϴ� ��
	 */
	public void printStar() {
		System.out.println("��");
	}//printStar
	
	/**
	 * �ԷµǴ� ���� ���� ���� ������ ����ϴ� ��
	 * @param count ����� ���� ����
	 */
	public void printStar(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("��");
		}//end for
	}//printStar
	
	/**
	 * ������ 3���� ����ϴ� ��
	 */
	public void gugudan( ) {
	
		for (int i = 1; i < 10; i++) {
			
			System.out.println(3+" x "+i+" = "+(3*i));
		}//end for
	}//gugudan
	
	/**
	 * �Է��ϴ� ���� 2~9�� ������ �� �ش�ܺ��� 9�ܱ��� ����ϴ���
	 * @param i ���۴�
	 */
	public void gugudan(int i) {
		if (i>1&&i<10) {
			for (int j = i; j < 10; j++) {
				for (int j2 = 1; j2 < 10; j2++) {
					System.out.println(j+" x "+j2+" = "+(j*j2));
				}//end for
				
			}//end for
		}else { 
			System.out.println("2~9�� ���̰� �ƴ�");
		}//end if

	}//gugudan
	
	public static void main(String[] args) {

		TestOverload to = new TestOverload();
		//�� ������ ���
		to.printStar();
		//���� ������ ���
		to.printStar(5);
		
		//������ 3���� ����ϴ� method
		to.gugudan();
		//�Է��ϴ� ���� 2~9�� ������ �� �ش� �ܺ��� 9�ܱ����� ����ϴ� method
		to.gugudan(4);
		
	}//main

}//class
