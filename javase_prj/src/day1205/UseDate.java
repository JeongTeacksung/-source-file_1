package day1205;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 형식이 있는 날짜 정보를 얻을 때
 * 형식 - java.text.SimpleDateFormat
 * 날짜정보 - java.util.Date
 * @author Owner
 */
public class UseDate {

	public UseDate() {
		Date date=new Date();
		System.out.println(date);
//		System.out.println(1900+date.getYear()); //비추천 method가 많다.
		//Locale - 다른 나라의 날짜 형식으로 변경하여 제공할 때
		
		SimpleDateFormat sdf=new SimpleDateFormat
				("yyyy-MM-dd a HH(hh,kk):mm:ss EEEE",Locale.US);
		String formatDate=sdf.format(date);
		System.out.println(formatDate);
		//2018년12월05일 오후 15(03,15):40:14 수요일
		//2018-12-05 PM 16(04,16):03:13 Wednesday
	}//UseDate
	
	public static void main(String[] args) {
		new UseDate();
	}//main

}//class
