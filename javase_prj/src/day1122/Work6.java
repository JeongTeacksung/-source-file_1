package day1122;

/**
 * ����<br>
 * �Ʒ��� ������ ó���ϴ� method�� type�� �˸°� �ۼ��ϰ� API�ּ���<br>
 * ������ �� ȣ���Ͽ� ����� �� �� Java Doc�� �����غ�����.<br>
 * - API�ּ��� � ������ method������ �ּ����� ����Ұ�.<br>
 *<br>
 * 1. �ڽ��� �̸��� ��ȯ�ϴ� method�ۼ�.<br>
 * 2. ���̸� �Է¹޾� �¾ �ظ� ��ȯ�ϴ�  method �ۼ�.<br>
 * 3. ���ڸ� �Է¹޾� �ش� ������ Unicode ���� ��ȯ�ϴ� method �ۼ�.<br>
 * 4. ���ڸ� �Է¹޾� ���ڰ�  ������, ������ ������ ���� �� �ش� ������<br>
 *    ���ڸ�  ����ϴ� ���� �ϴ� method  �ۼ�<br>
 * 5. ȣ���ϸ� �ڽ��� �ּҸ� ����ϴ�  method �ۼ�.<br>
 * 6. ģ���� �̸��� �Է¹޾� ����ϴ�  method �ۼ�(ģ���� n�� �Դϴ�.)<br>
 * @author Owner
 */
public class Work6 {
	
	/**
	 * ���ü��� ��ȯ�ϴ� method�ۼ�
	 */
	public void name() {
		System.out.println("���ü�");
	}//name
	
	/**
	 * ���ü��� ��ȯ�ϴ� method
	 * @return ���ü� ��ȯ
	 */
	public String name1() {
		String i = "���ü�";
		return i;
	}//name1 ��ȯ
	
	/**	
	 * ���̸� �Է¹޾� �¾ ��
	 * @param i ����
	 */
	public void birth(int i) {
		
		System.out.println(2018-i+1);
	}//birth
	
	public int birth1(int i) {
		int j = 2018-i+1;
		return j;
	}//birth1
	
	/**
	 * ���ڸ� �Է¹޾� �ش繮���� Unicode���� ��ȯ
	 * @param j ���� ��
	 */
	public void unicode(char j) {
		int i = j;
		System.out.println(i);
	}//unicode
	
	public int unicode1(char j) {
		int i = j;
		return i;
	}//unicode1
	
	/**
	 * ���ڸ� �Է¹޾� ���ڷ� ���
	 * @param i ���ڷ� �ٲ� ���� ��
	 */
	public void unicode(int i) {
		if ((i>64&&i<91)||(i>97&&i<123)) {
			char j = (char) i ;
			System.out.println(j);
		}else {
			System.out.println("�������� ���");
		}//end if			
	}//unicode
	
	/**
	 * ���� �ּҸ� ����ϴ� method 
	 */
	public void myAdress() {
		System.out.println("����� ���α� ����1��");
	}// myAdress
	
	/**
	 * ģ���� �̸��� �Է¹޾� ģ���� ������� ���
	 * @param i ģ�� �̸�
	 */
	public void friend(String ... i) {
	
		int j = i.length;
			
		System.out.println("ģ���� "+j+"�� �Դϴ�.");
	}// friend
	
	
	public static void main(String[] args) {

	Work6 na = new Work6();
	//1������ ��
	na.name();
	System.out.println(na.name1());
	
	//2������ ��
	na.birth(26);
	System.out.println(na.birth1(26));
	
	//3������ ��
	na.unicode('A');
	System.out.println(na.unicode1('A'));
	
	//4������ ��
	na.unicode(122);
	//5������ ��
	na.myAdress();
	//6������ ��
	na.friend("���ü�","������","�ڼ�ȫ");
	}//main
	
}//class
