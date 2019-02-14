package day1130;

public class SuperConstr {
	int i;
	
	public SuperConstr() {
		this(100);
		System.out.println("부모의 기본생성자");
	}//SuperConstr
	
	public SuperConstr(int i) {
		super();
		this.i=i;
		System.out.println("부모 인자 생성자"+i);
	}//SuperConstr
	
}//class
