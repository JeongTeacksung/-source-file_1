package day1121;

/**
 * 숙제<br>
 * 1.  while을 사용하여 구구단 전체 단을 출력하는  instance method를<br>
 *   작성하고, 호출하세요.<br>
 * <br>
 * 2.  do~while을 사용하여 아래의 형태의  *을 출력하는  static method를<br>
 *   작성하여 호출하세요.<br>
 *   *<br>
 *   **<br>
 *   ***<br>
 *   ****<br>
 * @author Owner
 */
public class Work5 {

//	숙제
//	1.  while을 사용하여 구구단 전체 단을 출력하는  instance method를
//	    작성하고, 호출하세요.

	public void instanceMathodGugudan( ) {
		int i = 2;
		while(i<10) {
			if(i>1&&i<10) {
				
							System.out.println(i+"단 출력");
				int j = 1;
				while(j<10 ) {
					System.out.println(i+" x "+j+" = "+(i*j));
					j++;
				}//end while
				i++;
			}//end if
			
		}//end while
	}//instance mathod
	
//	2.  do~while을 사용하여 아래의 형태의  *을 출력하는  static method를
//    작성하여 호출하세요.
//    *
//    **
//    ***
//    ****
	public static void staticMethod() {
		int i = 0;
		do {
			System.out.println("");
			if(i<1) {
				System.out.print("*");
			}else if(i<2 ) {
				System.out.print("**");
			}else if(i<3) {
				System.out.print("***");
			}else if(i<4) {
				System.out.print("****");
			}
			i++;
		} while (i<4);
	}//staticMathod	
		
	public static void staticMethod2() {
		int k = 1;
		do {
			System.out.println("");
			for(int i=0; i<k; i++) {
				System.out.print("*");					
			}//end for
			k++;
		} while(k<5);
	}//staticMathod2
	
	public static void main(String[] args) {

		Work5 gugu = new Work5();
		
		gugu.instanceMathodGugudan();
		
//==============================
		Work5.staticMethod();
		Work5.staticMethod2();
	}//main
	
	

}//class

