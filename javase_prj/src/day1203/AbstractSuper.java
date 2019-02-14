package day1203;

/**
 * 상속을 목적으로 만드는 부모 클래스<br>
 * 객체화가 되지 않는다.<br>
 * 자식클래스가 반드시 구현해야할 abstract method를 가지는 클래스
 * @author Owner
 */
public abstract class AbstractSuper {

	int i;
	
	public AbstractSuper() {
		//자식클래스가 생성 될 때만 호출된다.
		System.out.println("AbstractSuper 부모 생성자");
	}//AbstractSuper
	
	public void method() {
		System.out.println("부모 일을 하는 일반 method");
	}//method
	
	//abstract method는 자식이 반드시 구현해야할 일의 목록정의
	public abstract void absMethod();//추상method
	public abstract String absMethod1(int i);//추상method
	
	
//	public static void main(String[] args) {
//		new AbstractSuper(); //객체화 될 수 없다.
//	}//main

}//class
