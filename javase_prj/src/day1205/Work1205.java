package day1205;
import java.util.StringTokenizer;
public class Work1205 {
	
	public int[] Lotto645() {
		int[] lotto = new int[6];
		int rnd = 0;
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				} // end if
			} // end for j
		} // end for i
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		return lotto;
	} // Lotto645
	
	public String[] truncName() {
		String names = "이재찬,이재현.공선의,정택성~이재현!최지우.김희철,이재찬,이재찬,정택성.공선의";
		String[] namesArr = null;
		StringTokenizer stk = new StringTokenizer(names, ",.~!");
		
		System.out.println("토큰 개수 : " + stk.countTokens());
		namesArr = new String[stk.countTokens()];
		
		System.out.print("출력 이름 : ");
		while (stk.hasMoreTokens()) {
			System.out.print(stk.nextToken() + " ");
		} // end while
		
		return namesArr;
	} // truncName
	
	public static void main(String[] args) {
		Work1205 work = new Work1205();
		
		// 1. 
		work.Lotto645();
		
		System.out.println("\n-------------------------------------------------------");
		
		// 2. 
		work.truncName();
		
	} // main
}
