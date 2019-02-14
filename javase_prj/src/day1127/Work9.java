package day1127;

/**
 * 숙제 1. <br>
 * 주민번호를 입력받아 처리하는 프로그램 작성<br>
 * 각 작업은 method정의하고 호출하여 결과를 받아서 처리<br>
 * 1-1) 생성자는 주민번호를 받아 instance변수에 할당한다<br>
 * -인스턴스 변수의 값 사용<br>
 * 1-2) 주민번호(14자)의 길이체크하여 14자가 아니면 false반환<br>
 * 1-3) 주민번호의 6번째 자리가 '-'이 아니면 false반환<br>
 * 1-4) 주민번호의 유효성 검증하여 유효하면 true <br>
 *  -각자리에 2 3 4 5 6 7 8 9 2 3 4 5 를 곱한값을
 *  더하여 11로 나눈 나머지 값을 얻고 11에서 그 값을
 *  빼고 10으로 나눈 나머지가 주민번호의 끝자리와 같다면 true<br>
 *  1-5) 생년월일을 반환하는 일 : "1988-11-11"<br>
 *  1-6) 나이를 반환하는 일 : 정수로반환 <br>
 *  1-7) 성별을 반환 : 남 또는 여 <br>
 *  1-8) 내국인/외국인 반환 : 123409-내국인 56(1900년대)78-외국인
 *  1-9) 띠를 반환 : "양 띠"
 * @author Owner
 */
public class Work9 {
	public String ssn;
	
	/**
	 * 주민번호를 받아 instance변수에 할당한다
	 * @param ssn 주민번호 입력
	 */
	public Work9(String ssn) {
		this.ssn=ssn;
	}//Work9
	
	/**
	 * 주민번호(14자)의 길이체크하여 14자가 아니면 false반환
	 */
	public boolean ssn_length() {
	
		return ssn.length() ==14;
	}//ssn_length
	
	/**
	 * 1-3) 주민번호의 6번째 자리가 '-'이 아니면 false반환
	 * @return true false
	 */
	public boolean ssn_hipen() {
		int index=ssn.indexOf("-");
		return index==6;
	}//ssn_hipen
	
	
	/**
	 * 1-4) 주민번호의 유효성 검증하여 유효하면 true
	 * @return 유효성 검증 true / false
	 */
	public boolean ssn_check() {
		String result=ssn.substring(0, 6)+ssn.substring(7,14);
		int k=0;
		int sum=0;
		for (int i=2; i<14; i++) {		
			if(i<10) {
				k=i*Integer.parseInt(result.substring(i-2, i-1));
				 
			}else {
				k=(i-8)*Integer.parseInt(result.substring(i-2, i-1));			 	
			}//end else
			sum=sum+k;
		}//end for	
		return (11-(sum%11))%10==Integer.parseInt(result.substring(12,13)); 
	}//ssn_check
	
	/**
	 * 1-5) 생년월일을 반환하는 일 : "1988-11-11"
	 * @return 생년월일
	 */
	public String ssn_birth() {
		String year;

		if((ssn.substring(7, 8).equals("0"))||(ssn.substring(7,8).equals("9"))) {
			year="18";
		}else if((ssn.substring(7, 8).equals("1"))||(ssn.substring(7, 8).equals("2"))||
				(ssn.substring(7, 8).equals("5"))||(ssn.substring(7, 8).equals("6"))) {
			year="19";
		}else if((ssn.substring(7, 8).equals("3"))||(ssn.substring(7, 8).equals("4"))||
				(ssn.substring(7, 8).equals("7"))||(ssn.substring(7, 8).equals("8"))) {
			year="20";
		}else{
			year="없다";
		}//end if
		String birth_year= year+ssn.substring(0,2)+"-"
						+ssn.substring(2,4)+"-"+ssn.substring(4,6);
		
		return birth_year;
	}//ssn_birth
	
	/**
	 * 1-6) 나이를 반환하는 일 : 정수로반환 
	 * @return 나이를 정수로 반환
	 */
	public int ssn_age() {
		return 2019-Integer.parseInt(ssn_birth());
	}//ssn_age
	
	/**
	 * 1-7) 성별을 반환 : 남 또는 여
	 * @return 남, 여
	 */
	public String ssn_gender() {
		String gender;
		if ((ssn.substring(7, 8).equals("1"))||(ssn.substring(7, 8).equals("3"))) {
			gender="남";
		}else { 
			gender="여";
		}
		return gender;
	}//ssn_gender
	
	/**
	 * 1-8) 내국인/외국인 반환 : 123409-내국인 5678-외국인
	 * @return 내국인, 외국인
	 */
	public String ssn_contry() {
		String contry;
		if ((ssn.substring(7, 8).equals("5"))||(ssn.substring(7, 8).equals("6"))||
				(ssn.substring(7,8).equals("7"))||(ssn.substring(7,8).equals("8"))) {
			contry="외국인";
		}else {
			contry="내국인";
		}
		return contry;
	}//ssn_contry
	
	
	/**
	 * 1-9) 띠를 반환 : "양 띠"
	 * @return 띠
	 */
	public String ssn_ddi() {
		int j = Integer.parseInt(this.ssn_birth().substring(0, 4))%12;
		String[] arr = {"원숭이","닭","개","돼지","쥐","소","범","토끼",
				"용","뱀","말","양"};
		

		
		return arr[j]+"띠"; 
	}//ssn_ddi
	
	
	
	public static void main(String[] args) {
		String ssn="930729-1111111";
		Work9 ssn1 = new Work9(ssn);

		if(ssn1.ssn_length() == true) {
			if(ssn1.ssn_hipen()==true) {
				if(ssn1.ssn_check()==true) {
					
				}else {
					System.out.println("잘못된 주민번호");
				}//end if
			}else {
				System.out.println("-이 위치가 틀림");
			}//end if
		}else {
			System.out.println("주민번호의 길이가 틀림");
		}//end if
		System.out.println(ssn1.ssn_ddi());
		
		
	}//main

}//class
