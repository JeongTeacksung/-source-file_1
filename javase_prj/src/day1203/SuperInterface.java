package day1203;

/**
 * ����Ŭ����(�ڽ�Ŭ����)���� �ݵ�� �����ؾ��ϴ� ���� ��ϸ�
 * �����ϴ� interface���� (������ ������)
 * @author Owner
 */
//interface�� �θ� ������ ���� �� �ִ�.
public interface SuperInterface extends InterA,InterB {
	//constant : ������ ���ó�� ���
//	int i; //������ �ۼ��� �� ����. Error
	public static final int FLAG_VALUE=12;
	
	//�߻�method ����
	//�Ϲ� method�� ���� �� ���� Error
//	public void test() {
//	}
	//abstract�� ��������ʾƵ� �ȴ�.
	public void methodA();
	//abstract�� ����ص� �ȴ�.
	public abstract void methodB(int i);
	
}//interface
