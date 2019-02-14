package day1120;

/**
 * switch~case를 사용한 학점 구하기
 * @author Owner
 */
public class TestSwitchCase {
	
	public static final int GRADE__A_PLUS=10;
	public static final int GRADE__A=9;
	public static final int GRADE__B=8;
	public static final int GRADE__C=7;
	public static final int GRADE__D=6;
	
	public static void main(String[] args) {
		
		int score=100;
//		char grade=' ';//char는 문자를 저장한다. ''코드셋에 문자없음.
						  // ' ' 공백문자(white space) - unicode \u0000
						  // unicode \u0000은 자바코딩에 직접적으로 사용할수없다.
		char grade=64;
		
		//case의 상수는 가독성이 떨어지기 때문에 Constant를 사용
		if(score>=0 && score <=100) {
			switch (score/10) {
			case TestSwitchCase.GRADE__D : grade++;
			case TestSwitchCase.GRADE__C : grade++;
			case TestSwitchCase.GRADE__B : grade++;
			case TestSwitchCase.GRADE__A : 
			case TestSwitchCase.GRADE__A_PLUS : grade++;break;
			default : grade+=6;
/*			case 10 :
			case 9 : grade='A'; break;
			case 8 : grade='B';	break;
			case 7 : grade='C';	break;
			case 6 : grade='D';	break;
			default : grade='F';	
*/			//break;  default는 아랫줄에 실행될 코드가 없으므로 분기문을 사용하지 않는다.
						
			}//end switch
		
			System.out.println(score+"점의 학점은"+grade);		
		}else {
			System.out.println("점수는 0~100점 사이만 입력가능!!! 입력점수["
						+score+"]");
		}//end if
		
	}//main

}//class
