package day1205;

import java.util.StringTokenizer;

/**
 * ���ڿ��� ª�� ����� �����ϴ� StringTokenizer�� ���
 * @author Owner
 */
public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		String msg="������ ������ �Դϴ�. ������ -5�Դϴ�.";
		
		//�������� ���� : �Ű����� �ϳ��� ������ ���
		StringTokenizer stk=new StringTokenizer(msg);
		
		System.out.println(stk.countTokens() +"��");
		while(stk.hasMoreTokens()) {//��ū�� �����ϴ���?
			//��ū�� ��� �����͸� �������� �̵�
			System.out.println(stk.nextToken());
		}//end while
		
		String names="������,������~���ü�,����ö.������~������,������";
		
		//Ư�����ڷ� ��ū ���� : �Ű����� �ΰ��� ������
		StringTokenizer stk1=new StringTokenizer(names,",~.");
		System.out.println("---------------------------------");
		System.out.println("��ū�� �� : "+ stk1.countTokens());
		while(stk1.hasMoreTokens()) {
			System.out.println(stk1.nextToken());
		}//end while
		
		//Ư�����ڷ� ��ū ����, ���е� ���ڿ��� ��ū���� ���
		//�Ű����� ������ ������
		StringTokenizer stk2=new StringTokenizer(names, ",.~",true);
		System.out.println("��ū�� �� : "+stk2.countTokens());
		while(stk2.hasMoreTokens()) {
			System.out.println(stk2.nextToken());
		}//end while
		
	}//UseStringTokenizer
	
	public static void main(String[] args) {
		new UseStringTokenizer();
	}//main

}//class
