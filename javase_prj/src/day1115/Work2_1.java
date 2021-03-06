package day1115;
//숙제
class Work2_1{
	public static void main(String[] args) {
/*
1. 변수에 할당된 값이 양수일때만 2진수로 출력하고 음수라면 ~를 사용하여
    양수로 변경하고 입력된 그대로의 10진수로 출력.
    출력 예)  " 양수 인경우"  10은  1010
                 " 음수 인경우"  -10 은 10
*/		
		int i=10;		
		System.out.println(i>0 ? Integer.toBinaryString(i) : (~--i));
	
	/*--------------------------------------------------------------------------------
	2. 2147483647의 값에서 상위 2byte와 하위 2byte 값을 분리하여 출력해보세요. 
    출력 예) 상위 2byte -> 32767
                하위 2byte - > 65535
	*/	
		int j=2147483647;

		System.out.println("상위 2byte -> "+(j>>16)+ " 하위 2byte -> "+(j>>47));
	/*
	3. ||를 사용했을 때 전항이 true라면 후항을 연산하지 않는 것을 증명할 수 있는
     코드를 작성하세요.
	*/
		boolean flag1=true, flag2=true, flag3=true;

		flag3= (flag1=3>2) || (flag2=2>3);
			
		System.out.println("전항"+flag1+ " 후항"+flag2+ " 판단 " +flag3);


	}//main
}//class
