package day1203;

/**
 * interface�� �����ϴ� class (�ڽ�Ŭ�����̰� interface�� ��� 
 * �߻�method�� Override�ϴ� Ŭ����)
 * ���� interface�� �θ� interface�� �����ٸ� �������� �ڽ�Ŭ����������
 * ��� �߻�method�� �����ؾ��Ѵ�.
 * @author Owner
 */
public class InterfaceImpl implements SuperInterface {
	
	public String msgA() { //InterA
		return "������ ȭ����";
	}//msgA
	
	public String msgB() { //InterB
		return "������ ������";
	}//msgB
	@Override
	public void methodA() { //SuperInterface
		System.out.println("methodA");
	}//methodA
	
	@Override
	public void methodB(int i) { //SuperInterface
		System.out.println("methodB");
	}//methodB
	
	public void test() {
	}
	
	public static void main(String[] args) {
		//�ڽ� Ŭ������ ��üȭ : ��� method�� ȣ�� �� �� �ִ�
		//ii.msgA(), ii.msgB, ii.methodA(), ii.methodB(), ii.test()
		InterfaceImpl ii=new InterfaceImpl();
		ii.methodB(12);
		
		//is a ������ ��üȭ
		//SuperInterface�� ��üȭ�� �ϸ� Override�� method�� ȣ��
		//�θ��� method�� ��� ȣ�Ⱑ��
		//si.msgA(), si.msgB, si.methodA(), si.methodB()
		SuperInterface si=new InterfaceImpl();
		System.out.println(si.msgA());
		
		//InterA�� ��üȭ�ϸ�
		//ia.msgA()
		InterA ia=new InterfaceImpl();
		System.out.println(ia.msgA());
		
		//InterB�� ��üȭ�ϸ�
		//ib.msgB()
		InterB ib=new InterfaceImpl();
		System.out.println(ib.msgB());
		
		// Object o=new InterfaceImpl();
		// interface�� ��üȭ ���� �ʴ´�.
//		InterA ia1=new InterA();  //Error
//		SuperInterface si1=new SuperInterface(); //Error
		
	}//main


}//class
