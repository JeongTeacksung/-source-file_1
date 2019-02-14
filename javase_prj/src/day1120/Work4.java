package day1120;

/**
 * 숙제 1.<br>
 *구구단 출력 (flowchart 그리고 )<br>
 *2x1=2    3x1=3  4x1=4  ...            9x1=9<br>
 *.<br>
 *.<br>
 *.<br>
 *2x9=18                                     9x9=81<br>
 *<br>
 *숙제2.<br>
 *0 0<br>
 *1 0 1 1<br>
 *  2 0 2 1 2 2<br>
 *    3 0 3 1 3 2 3 3<br> 
 * @author Owner
 */
public class Work4 {

	public static void main(String[] args) {
//		숙제 1.
//		구구단 출력 (flowchart 그리고 )
//		2x1=2    3x1=3  4x1=4  ...            9x1=9
//		.
//		.
//		.
//		2x9=18                                     9x9=81	
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j+" x "+i+" = "+(i*j)+"      ");
			}System.out.println("");
		}
			
//		숙제2.
//		0 0
//		 1 0 1 1
//		   2 0 2 1 2 2
//		     3 0 3 1 3 2 3 3 
		
		for (int i = 0; i < 4; i++) {
		
			for (int j = 0; j <= i; j++) {

				System.out.print(i+" "+j+" ");
			}//end for
				System.out.println("");
				if (i==0) {
					System.out.print("  ");
				}
					else if(i==1) {
						System.out.print("     ");
					}	else if(i==2) {
							System.out.print("        ");
						}//end elseif				


			
		}//end for		
					
		
		
		
		
		
	}//main

}//class
