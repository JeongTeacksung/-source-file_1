package day1119;

/**
 * if~else : 둘 중 하나의 코드를 실행해야 할 때 사용<br>
 * 문법 )	if(조건식){<br>
 * 				조건에 맞을 때 수행할 문장들;<br>
 * 			}else{<br>
 * 				조건에 맞지 않을 때 수행할 문장들;<br>
 * 			}
 * 
 * @author Owner
 */
public class TestIfElse {

	public static void main(String[] args) {
		int i=-21;
		//변수에 존재하는 수가 음수인지 양수인지를 판단
		System.out.print( i+"는(은)" );
		if ( i < 0 ) {
			System.out.println("음수");
		} else {
			System.out.println("양수");
		}
		//변수에 존재하는 수가 홀수인지 짝수인지를 판단
		//수행하는 행수가 한 행 이라면 {}는 생략가능
		if ( i % 2 == 0 ) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}//end if
		
		//입력하는 수가 3의 배수라면 "짝"을 출력하고 그렇지 않다면
		//입력한 수를 출력하세요.
		if ( i % 3 == 0 ) {
			System.out.println("짝");
		} else {
			System.out.println(i);
		}//end if
		
	}//main

}//class
