package day1203;

public class TestSub2 extends TestSuper{
	int i;
	public TestSub2() {
		super();
		System.out.println("�ڽ��� ������");
	}//TestSub
	
	public void subMethod() {
		System.out.println("�ڽ��� subMethod22222222");
	}//subMethod
	
	@Override
	public void printI() {
		System.out.println("�ڽ�2222222 Override�� method"+i+
				", �θ��� i = "+super.i);
	}//printI
	
	
}
