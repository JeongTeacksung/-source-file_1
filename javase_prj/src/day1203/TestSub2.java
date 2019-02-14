package day1203;

public class TestSub2 extends TestSuper{
	int i;
	public TestSub2() {
		super();
		System.out.println("자식의 생성자");
	}//TestSub
	
	public void subMethod() {
		System.out.println("자식의 subMethod22222222");
	}//subMethod
	
	@Override
	public void printI() {
		System.out.println("자식2222222 Override한 method"+i+
				", 부모의 i = "+super.i);
	}//printI
	
	
}
