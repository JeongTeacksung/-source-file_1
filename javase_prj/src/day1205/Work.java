package day1205;

import java.util.StringTokenizer;

/**
 * 1. 1~45 ������ �� �߿��� �������� �ϳ��� �̾� 6���� ��Ʈ�� ����� �迭�� ��ȯ�ϴ� method�� �����,
 *    ȣ���Ͽ� ����� ��. (��, �ߺ��� ���� �迭�� �Էµ��� �ʾƾ� �Ѵ�.)<br>
 *    
 * 2. �Ʒ� ���õ� ���ڿ��� ���� ���ڷ� �߶󳻾� ���ڿ� �迭�� �����ϰ� ��ȯ�ϴ� ���� �ϴ� method�� �ۼ��ϼ���.<br>
 *    "������",������.������,���ü�~������!������.����ö,������,������,���ü�.������"<br>
 *    ��� : ������ ������ ������ ���ü� ������ ������ ����ö ������ ������ ���ü� ������<br>
 * @author Owner
 */
public class Work {
	
	public void lotto() {
		int[] num=new int[45];
		for(int i=0; i<6; i++) {
			num[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}//end if
			}//end for
		}//end for
		
		for(int i=0; i<6; i++) {
			System.out.print(num[i]+" ");
	}//end for
			
	}//lotto

	public String[] truncName() {
		String names= 
		 "������,������.������,���ü�~������!������.����ö,������,������,���ü�.������";
		StringTokenizer stk=new StringTokenizer(names, ",.~!");
		String[] nameArr=new String[stk.countTokens()];
		
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}//end while
		
		for(int i=0; i < stk.countTokens(); i++) {
			
		}//end for
		
		return nameArr;
	}//truncName
	

	
	
	
	public static void main(String[] args) {
		new Work().lotto();
		
		
	}//main

}//class
