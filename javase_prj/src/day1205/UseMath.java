package day1205;

import org.omg.Messaging.SyncScopeHelper;

/**
 * Math : ��ü�� �������� �ʰ� ����ϴ� Ŭ����
 * @author Owner
 */
public class UseMath {

	public UseMath() {
//		Math m=new Math();
		int i=-12;
		System.out.println(i+"�� ���밪 : "+Math.abs(i));
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.round(10.5));//�Ҽ��� ���� ù�ڸ�����
		System.out.println(Math.floor(10.9));//�Ҽ��� ���� ù�ڸ�����
		
		double d=Math.random();
		System.out.println("�߻��� ���� : "+d);
		System.out.println("������ ������ ���� : "+d*5);
		System.out.println("������ ������ �������� ���� : "+(int)(d*10));
		
		// A(65)-Z(90)�� �ϳ��� ���ڸ� ��ȯ�ϴ� ��
		System.out.println( (char)((int)(d*26)+65) );
		
	}//UseMath
	
	public char[] createPassword() {
		char[] tempPass=new char[8];
		//������ �빮��, �ҹ���, ���ڷ� �̷���� ������
		//��й�ȣ 8�ڸ��� �����Ͽ� ��ȯ�ϴ� ��
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
