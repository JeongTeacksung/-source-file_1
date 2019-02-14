package day1122;

/**
 * 다형성 : method Overload<br>
 * 하나의 클래스에서 같은 이름의 method를 여러개 작성하는 것.<br>
 * 규칙) 접근지정자 반환형 method명은 동일하게 만들고 
 * 		매개변수만 다르게 작성.
 */
public class TestOverload {
	
	/**
	 *  ★을 하나 출력하는 일
	 */
	public void printStar() {
		System.out.println("★");
	}//printStar
	
	/**
	 * 입력되는 값에 따라 ☆을 여러개 출력하는 일
	 * @param count 출력할 별의 갯수
	 */
	public void printStar(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("☆");
		}//end for
	}//printStar
	
	/**
	 * 구구단 3단을 출력하는 일
	 */
	public void gugudan( ) {
	
		for (int i = 1; i < 10; i++) {
			
			System.out.println(3+" x "+i+" = "+(3*i));
		}//end for
	}//gugudan
	
	/**
	 * 입력하는 단이 2~9단 사이일 때 해당단부터 9단까지 출력하는일
	 * @param i 시작단
	 */
	public void gugudan(int i) {
		if (i>1&&i<10) {
			for (int j = i; j < 10; j++) {
				for (int j2 = 1; j2 < 10; j2++) {
					System.out.println(j+" x "+j2+" = "+(j*j2));
				}//end for
				
			}//end for
		}else { 
			System.out.println("2~9단 사이가 아님");
		}//end if

	}//gugudan
	
	public static void main(String[] args) {

		TestOverload to = new TestOverload();
		//별 여러개 출력
		to.printStar();
		//별을 여러개 출력
		to.printStar(5);
		
		//구구단 3단을 출력하는 method
		to.gugudan();
		//입력하는 단이 2~9단 사이일 때 해당 단부터 9단까지를 출력하는 method
		to.gugudan(4);
		
	}//main

}//class
