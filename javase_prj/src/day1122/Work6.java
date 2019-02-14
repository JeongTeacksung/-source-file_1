package day1122;

/**
 * 숙제<br>
 * 아래의 업무를 처리하는 method를 type에 알맞게 작성하고 API주석을<br>
 * 설정한 후 호출하여 결과를 본 후 Java Doc을 생성해보세요.<br>
 * - API주석은 어떤 형태의 method인지를 주석으로 기술할것.<br>
 *<br>
 * 1. 자신의 이름을 반환하는 method작성.<br>
 * 2. 나이를 입력받아 태어난 해를 반환하는  method 작성.<br>
 * 3. 문자를 입력받아 해당 문자의 Unicode 값을 반환하는 method 작성.<br>
 * 4. 숫자를 입력받아 숫자가  영문자, 숫자의 범위에 있을 때 해당 숫자의<br>
 *    문자를  출력하는 일을 하는 method  작성<br>
 * 5. 호출하면 자신의 주소를 출력하는  method 작성.<br>
 * 6. 친구의 이름을 입력받아 출력하는  method 작성(친구는 n명 입니다.)<br>
 * @author Owner
 */
public class Work6 {
	
	/**
	 * 정택성을 반환하는 method작성
	 */
	public void name() {
		System.out.println("정택성");
	}//name
	
	/**
	 * 정택성을 반환하는 method
	 * @return 정택성 반환
	 */
	public String name1() {
		String i = "정택성";
		return i;
	}//name1 반환
	
	/**	
	 * 나이를 입력받아 태어난 해
	 * @param i 나이
	 */
	public void birth(int i) {
		
		System.out.println(2018-i+1);
	}//birth
	
	public int birth1(int i) {
		int j = 2018-i+1;
		return j;
	}//birth1
	
	/**
	 * 문자를 입력받아 해당문자의 Unicode값을 반환
	 * @param j 문자 값
	 */
	public void unicode(char j) {
		int i = j;
		System.out.println(i);
	}//unicode
	
	public int unicode1(char j) {
		int i = j;
		return i;
	}//unicode1
	
	/**
	 * 숫자를 입력받아 문자로 출력
	 * @param i 문자로 바꿀 숫자 값
	 */
	public void unicode(int i) {
		if ((i>64&&i<91)||(i>97&&i<123)) {
			char j = (char) i ;
			System.out.println(j);
		}else {
			System.out.println("범위에서 벗어남");
		}//end if			
	}//unicode
	
	/**
	 * 나의 주소를 출력하는 method 
	 */
	public void myAdress() {
		System.out.println("서울시 구로구 구로1동");
	}// myAdress
	
	/**
	 * 친구의 이름을 입력받아 친구가 몇명인지 출력
	 * @param i 친구 이름
	 */
	public void friend(String ... i) {
	
		int j = i.length;
			
		System.out.println("친구는 "+j+"명 입니다.");
	}// friend
	
	
	public static void main(String[] args) {

	Work6 na = new Work6();
	//1번문제 답
	na.name();
	System.out.println(na.name1());
	
	//2번문제 답
	na.birth(26);
	System.out.println(na.birth1(26));
	
	//3번문제 답
	na.unicode('A');
	System.out.println(na.unicode1('A'));
	
	//4번문제 답
	na.unicode(122);
	//5번문제 답
	na.myAdress();
	//6번문제 답
	na.friend("정택성","이재현","박수홍");
	}//main
	
}//class
