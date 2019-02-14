package day1207;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * Set : �˻��� ����� ������(get X) �ߺ����� �������� �ʴ� ���
 * @author Owner
 */
public class UseSet {

	public UseSet() {
		//JDK1.5 ���Ͽ����� Generic�� �������� �ʰ� ��ü�� ����
		//1. ����)
		Set<String> set=new HashSet<>();
		//2.�� �Ҵ�) - ������� �Էµ��� �ʴ´�.
		set.add("���ü�");
		set.add("������");
		set.add("������");
		set.add("������");
		set.add("������");
		set.add("������");
		set.add("�̺���");
		set.add("������");//�ߺ����� �������� �ʴ´�.
		System.out.println(set.size()+" / "+set);
		set.remove("������"); //����������
		System.out.println(set.size()+" / "+set);
		
		//�迭�� ����
		String[] names=new String[set.size()];
		set.toArray(names);
		
		//set�� ��� ��(Element)�� �� ���
//		System.out.println(set.get("������")); //set ��ü�� �˻��� ����� ����.
		//Iterator�� ����Ͽ� ���� ���
		Iterator<String> ita=set.iterator();
		
		String name="";
		while(ita.hasNext()) { //Iterator�� �����ϴ� Set�� ��Ұ� �����Ѵٸ�
			name=ita.next(); //�ش����� ���� ��� ���� �����ͷ� �̵�
			System.out.print(name+" ");
		}//end while
		System.out.println();
		System.out.println("-------------���� for--------------");
		for(String temp : set) {
			System.out.print(temp+" ");
		}//end for
		System.out.println();
		
		//��� ���� �� ����
		set.clear();
		System.out.println("clear�� set : "+set+" ũ�� : "+set.size());
		System.out.println("-------------�迭�� ������ ��-------------");
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}//end for
		System.out.println();
		
	}//UseSet
	
	public int[] lotto1() {
		int[] tempLotto=new int[6];
		
		Random random=new Random();
		for( int i=0; i<tempLotto.length; i++) {
			tempLotto[i]=random.nextInt(45)+1; // ���� ���� �߻��� �� �ִ�
			for(int j=0; j<i; j++) {
				if(tempLotto[i]==tempLotto[j]) { //���� ���� ����.
					i--; // �ߺ� �߻��� ��ȣ�� �ε�����°�� �ٽ� �߻���Ű������
					//�ε�����ȣ�� �ϳ� ���δ�
					break; //�ݺ����� ����������.
				}//end if
				
			}//end for
		}//end for
		
		return tempLotto;
	}
	
	public Integer[] lotto2() {
		Integer[] tempLotto=new Integer[6];
		
		Set<Integer> set=new HashSet<>();
		Random random=new Random();
		while(true) {
			set.add(random.nextInt(45)+1); // ���� ���� �߻��� �� �ִ�
			if(set.size()==6) {
				break;
			}//end if			
		}//end while
		set.toArray(tempLotto);
		
		return tempLotto;
	}
	
	
	
	public static void main(String[] args) {
		UseSet us=new UseSet();
		int[] temp=us.lotto1();
		
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+ " ");
		}//end for
		System.out.printf("\n------------------------\n");
		
		Integer[] temp1=us.lotto2();
		
		for(int i=0; i<temp1.length; i++) {
			System.out.print(temp1[i]+ " ");
		}//end for
		
		
	}//main

}//class
