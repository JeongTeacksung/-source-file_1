package day1129;

/**
 * �������� Ư¡�� �����ϰ�
 * �ü��� Ư¡����
 * @author Owner
 */
public class TeackSung extends Person{

	public int shootPower;
	public int goal;
	
	
	/**
	 * �⺻������
	 * �ü��� �⺻������ ����
	 */
	public TeackSung() {
		shootPower=7;
	}//TeackSung
	
	/**
	 * �ü��� �������� ���� Ȯ��
	 * @param shootnum ���� �� Ƚ��
	 * @param shootPower ������
	 */
	public String goalPersent(int shootnum, int shootPower) {
		double per;
		if (shootPower>=7) {
			per=0.7;
			goal= (int)(shootnum*(per));
		}else if ( shootPower>=5) {
			per=0.5;
			goal= (int)(shootnum*(per));
		}else {
			per=0.2;
			goal=(int)(shootnum*per);
		}//end else
		
		return getName()+"�� ��Ű�� ���� "+shootPower+"�� ������ "+shootnum+"�� ���� ���� "
					+(per*(double)100)+"�ۼ�Ʈ�� Ȯ���� "+goal+"���� �־���";
	}//end TeackSung
	
	
}//class
