package day1205;

import java.util.StringTokenizer;

/**
 * 1. 1~45 사이의 수 중에서 무작위로 하나를 뽑아 6개의 세트를 만들어 배열로 반환하는 method를 만들고,
 *    호출하여 출력할 것. (단, 중복된 수는 배열에 입력되지 않아야 한다.)<br>
 *    
 * 2. 아래 제시된 문자열을 구분 문자로 잘라내어 문자열 배열에 저장하고 반환하는 일을 하는 method를 작성하세요.<br>
 *    "이재찬",이재현.공선의,정택성~이재현!최지우.김희철,이재찬,이재찬,정택성.공선의"<br>
 *    출력 : 이재찬 이재현 공선의 정택성 이재현 최지우 김희철 이재찬 이재찬 정택성 공선의<br>
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
		 "이재찬,이재현.공선의,정택성~이재현!최지우.김희철,이재찬,이재찬,정택성.공선의";
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
