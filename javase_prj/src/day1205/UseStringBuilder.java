package day1205;

/**
 * StringBuffer, StringBuilder(JDK1.5)
 * 문자열을 heap에 직접 저장하고 사용하는 클래스
 * @author Owner
 */
public class UseStringBuilder {

	public void useStringBuffer() {
		//1.클래스 생성
		StringBuffer sb=new StringBuffer();
		//2.값(정수, 실수, 문자, 불린, 문자열,,,,) 추가
		sb.append("오늘은 ");//문자열
		sb.append(12);//정수
		sb.append("월 5일").append(" 수요일 입니다.");
		System.out.println(sb);
		
		//2.값 삽입
		//오늘은 12월 5일 수요일 입니다.
		//0 1 2 34
		sb.insert(4, "2018년");
		System.out.println(sb);
		
		//4. 값 삭제 : delete(시작인덱스, 끝인덱스)
		//오늘은 2018년12월 5일 수요일 입니다.
		sb.delete(0, 3);
		System.out.println(sb);
		sb.reverse();
		sb.reverse();
		System.out.println(sb);
		
	}//useStringBuffer
	public void useStringBuilder() {
			//1.클래스 생성
			StringBuilder sb=new StringBuilder();
			//2.값(정수, 실수, 문자, 불린, 문자열,,,,) 추가
			sb.append("오늘은 ");//문자열
			sb.append(12);//정수
			sb.append("월 5일").append(" 수요일 입니다.");
			System.out.println(sb);
			
			//2.값 삽입
			//오늘은 12월 5일 수요일 입니다.
			//0 1 2 34
			sb.insert(4, "2018년");
			System.out.println(sb);
			
			//4. 값 삭제 : delete(시작인덱스, 끝인덱스)
			//오늘은 2018년12월 5일 수요일 입니다.
			sb.delete(0, 3);
			System.out.println(sb);
			sb.reverse();
			sb.reverse();
			System.out.println(sb);
			
		}//useStringBuffer		
	
	public static void main(String[] args) {
		UseStringBuilder usb=new UseStringBuilder();
		usb.useStringBuilder();
		System.out.println("======================");
		usb.useStringBuffer();
		
		String str="안녕하세요?"; //짧은 문자열
		System.out.println(str);
		
		String str1="안"; 
		//문자열에 +가 붙어서 긴 문자열
		System.out.println(str1+"녕"+"하"+"세"+"요?");
		//new StringBuilder().append(str1).append("녕").append("하"),,
		System.out.println(new StringBuilder().append(str1).append("녕"));
		
		
	}//main

}//class
