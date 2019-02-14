package day1205;

import org.omg.Messaging.SyncScopeHelper;

/**
 * Math : 객체를 생성하지 않고 사용하는 클래스
 * @author Owner
 */
public class UseMath {

	public UseMath() {
//		Math m=new Math();
		int i=-12;
		System.out.println(i+"의 절대값 : "+Math.abs(i));
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.round(10.5));//소수점 이하 첫자리에서
		System.out.println(Math.floor(10.9));//소수점 이하 첫자리에서
		
		double d=Math.random();
		System.out.println("발생한 난수 : "+d);
		System.out.println("범위를 설정한 난수 : "+d*5);
		System.out.println("범위를 설정한 난수에서 정수 : "+(int)(d*10));
		
		// A(65)-Z(90)중 하나의 문자를 반환하는 일
		System.out.println( (char)((int)(d*26)+65) );
		
	}//UseMath
	
	public char[] createPassword() {
		char[] tempPass=new char[8];
		//영문자 대문자, 소문자, 숫자로 이루어진 임의의
		//비밀번호 8자리를 생성하여 반환하는 일
		String flag="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		
		for(int i=0; i<tempPass.length; i++) {
			tempPass[i]=flag.charAt((int)(Math.random()*flag.length()));
			System.out.print(tempPass[i]);
		}//end for
		return tempPass;
	}//createPassword
	
	public char[] createPassword1() {
		char[] tempPass=new char[8];
		int d;
		for(int i=0; i<tempPass.length; i++) {
			d=(int)(Math.random()*3)+1;
			switch (d) {
			case 1:
				tempPass[i]=(char)((int)(Math.random()*26)+65);
				break;
			case 2:
				tempPass[i]=(char)((int)(Math.random()*26)+97);
				break;
			case 3:
				tempPass[i]=(char)((int)(Math.random()*10)+48);	
				break;
			}//switch
			/*if(i<2) {
				tempPass[i]=(char)((int)(d*26)+65);
				System.out.print(tempPass[i]);
			}else if(i<4) {
				tempPass[i]=(char)((int)(d*26)+97);	
				System.out.print(tempPass[i]);
			}else if(i<8) {
				tempPass[i]=(char)((int)(d*10));	
				System.out.print((int)tempPass[i]);
			}//end else*/
			
		}//end for
		System.out.println(tempPass);
		return tempPass;
	}//end createPassword1
	
	
	public static void main(String[] args) {
		new UseMath().createPassword1();
		
		
	}//math

}//class
