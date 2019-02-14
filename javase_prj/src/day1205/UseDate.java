package day1205;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * ������ �ִ� ��¥ ������ ���� ��
 * ���� - java.text.SimpleDateFormat
 * ��¥���� - java.util.Date
 * @author Owner
 */
public class UseDate {

	public UseDate() {
		Date date=new Date();
		System.out.println(date);
//		System.out.println(1900+date.getYear()); //����õ method�� ����.
		//Locale - �ٸ� ������ ��¥ �������� �����Ͽ� ������ ��
		
		SimpleDateFormat sdf=new SimpleDateFormat
				("yyyy-MM-dd a HH(hh,kk):mm:ss EEEE",Locale.US);
		String formatDate=sdf.format(date);
		System.out.println(formatDate);
		//2018��12��05�� ���� 15(03,15):40:14 ������
		//2018-12-05 PM 16(04,16):03:13 Wednesday
	}//UseDate
	
	public static void main(String[] args) {
		new UseDate();
	}//main

}//class
