package day1129;

/**
 * ����� ����Ư¡�� Person���� �����ٰ� ����ϰ�
 * �ڽŸ��� Ư¡�� ������ Ŭ����<br>
 * @author Owner
 */
public final class Clark extends Person {
	public int power;
	
	/**
	 * �⺻ ������ : ��ü�� �����Ǹ� power�� 9�� ����
	 */
	public Clark() {
		super(3,1,1);
		power=9;
	}//Clark
	
	/**
	 * �ԷµǴ� ���� ������ ���� ���� ��ȭ��
	 * �ް��ϰ� ��ȭ�Ѵ�.
	 * @param stone ���� ����
	 * @return ���� ��ȭ
	 */
	public String power(String stone) {
		String result="";
		if (stone.equals("Ŭ���䳪��Ʈ")) {
			power=0;
			result="���� ���� ~(_-_)~";
		}else if(stone.equals("���̾Ƹ��")) {
			power=10;
			result="�����մϴ�~ ~m(^o^)m~";
		}else {
			power=12;
			result="������ ��.��+";
		}//end else
		
		return result;
	}//power

	@Override
	public String eat() {
		
		return getName() + "�� ������ ���� �Դ´�.";
	}//eat
	
	@Override
	public String eat(String menu, int price) {
		return getName()+"�� ����������� "+menu+"�� ������ "+price+"$���� �Դ´�.";
	}//eat
	
	
}//class
