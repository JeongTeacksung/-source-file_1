package day1130;

public class SubConstr extends SuperConstr {
	int i;
	
	public SubConstr() {
		super();
		
		System.out.println("자식 기본생성자");
	}//SubConstr
	
	public SubConstr(int i) {
		this();
		System.out.println("자식 인자 생성자"+i);
	}//SubConstr


}//class
