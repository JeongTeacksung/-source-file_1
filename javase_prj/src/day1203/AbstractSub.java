package day1203;

/**
 * �߻� Ŭ������ �θ�� �ϴ� �ڽ�Ŭ����<br>
 * �ڽ�Ŭ������ �ݵ�� �θ�Ŭ������ �߻�method�� Override�ؾ��Ѵ�.
 * @author Owner
 */
public class AbstractSub extends AbstractSuper{

	public void subMethod() {
		System.out.println("�ڽ� method!!!!");
	}//subMethod

	@Override
	//Override ��Ģ : ���������ڴ� �޶� �ǰ� (������) ��ȯ��, method��,
	//�Ű������� ���ƾ� �Ѵ�.
	public void absMethod() {
		//�߻� method�� super�� ȣ���� �� ����.
//		super.absMethod(); //Error
		System.out.println("Override�� �ڽ� absMethod");
	}//absMethod
	
	@Override
	public String absMethod1(int param_i) {
		return String.valueOf(param_i).concat(" - �ڽ�");
	}//absMethod1
	
	public static void main(String[] args) {
		
		//�ڽ�Ŭ������ ��üȭ �Ǹ� �߻�Ŭ������ ��üȭ�� �ȴ�.
		AbstractSub as=new AbstractSub();
		//�ڽ�Ŭ���� ��üȭ : �θ��� ����, method, �ڽ��� ����, method
		as.i=12; // �θ𺯼�
		as.method();// �θ�  method
		
		//Override�� method�� �ڽĿ��� ������ ���̹Ƿ� �ڽ��� method�� ȣ��ȴ�.
		as.absMethod();// ���� �̸����� �����Ѵٸ� �ڽ��� methodȣ��
		System.out.println(as.absMethod1(3));//���� �̸����� �����Ѵٸ� �ڽ��� methodȣ��
		as.subMethod();
		
		// is a ������ ��üȭ : ��ü ������	
		// �θ�Ŭ������ ��ü��=new �ڽĻ�����();
		AbstractSuper as1=new AbstractSub();
		//�θ��� �ڿ�ȣ�� ����
		as1.i=100;
		as1.method();
		//Override�� method�� �����Ѵٸ� �ڽ��� method�� ȣ�� ����
		//�߻�method�� body�� ������ ȣ���ϰԵǸ� �ڽ��� method�� ȣ��ȴ�.
		as1.absMethod();
		System.out.println(as1.absMethod1(2018));
		
		// is a ����� ��üȭ�ϸ� �ڽ��� ���� method�� ȣ��Ұ�
//		as1.subMethod(); // Error
		
	}//main

}//class