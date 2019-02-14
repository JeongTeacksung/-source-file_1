package day1122;

/**
 * 출력 method
 * @author Owner
 */
public class UsePrintf {

	public static void main(String[] args) {
//		System.out.printf("정수%d\n", 11);
//		System.out.format("정수%d", 11);
		
		System.out.printf("정수[%d][%5d][%-5d]\n",11,11,11); // 정수[11][   11][11   ]
		System.out.printf("문자[%c][%5c][%-5c]\n",'A','B','C'); // 문자[A][    B][C    ]
		System.out.printf("문자열[%s][%5s][%-5s]\n",
					"자바","자바","자바"); //문자열[자바][   자바][자바   ]
		System.out.printf("실수[%.2f][%5.2f][%-5.2f]\n",3.141592,
					3.141592,3.141592); // 실수[3.14][ 3.14][3.14 ]
		
		System.out.printf("오늘은 %d년%d월%d일 %s요일 시력은 %.2f입니다.",
					2018,11,22,"목",1.5); //오늘은 2018년11월22일 목요일 시력은 1.50입니다.

	}//main

}//class
