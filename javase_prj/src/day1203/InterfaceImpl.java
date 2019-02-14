package day1203;

/**
 * interface를 구현하는 class (자식클래스이고 interface내 모든 
 * 추상method를 Override하는 클래스)
 * 구현 interface가 부모 interface를 가진다면 최종적인 자식클래스에서는
 * 모든 추상method를 구현해야한다.
 * @author Owner
 */
public class InterfaceImpl implements SuperInterface {
	
	public String msgA() { //InterA
		return "내일은 화요일";
	}//msgA
	
	public String msgB() { //InterB
		return "오늘은 월요일";
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
		//자식 클래스로 객체화 : 모든 method를 호출 할 수 있다
		//ii.msgA(), ii.msgB, ii.methodA(), ii.methodB(), ii.test()
		InterfaceImpl ii=new InterfaceImpl();
		ii.methodB(12);
		
		//is a 관계의 객체화
		//SuperInterface로 객체화를 하면 Override된 method만 호출
		//부모의 method도 모두 호출가능
		//si.msgA(), si.msgB, si.methodA(), si.methodB()
		SuperInterface si=new InterfaceImpl();
		System.out.println(si.msgA());
		
		//InterA로 객체화하면
		//ia.msgA()
		InterA ia=new InterfaceImpl();
		System.out.println(ia.msgA());
		
		//InterB로 객체화하면
		//ib.msgB()
		InterB ib=new InterfaceImpl();
		System.out.println(ib.msgB());
		
		// Object o=new InterfaceImpl();
		// interface는 객체화 되지 않는다.
//		InterA ia1=new InterA();  //Error
//		SuperInterface si1=new SuperInterface(); //Error
		
	}//main


}//class
