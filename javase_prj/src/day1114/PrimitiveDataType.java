package day1114;
/*
기본형 데이터형
 정수형 : byte, short, int, long
 문자형 : char
 실수형 : float, double
 불린형 : boolean
*/

class PrimitiveDataType {
	public static void main(String[] args) {
		// 정수형
		byte a=10;
		short b=20;
		int c=30;
		long d=40; // 할당되는 값이 4byte내 이므로 literal을 변환할 필요없음
		long e=2147483648L;
		//literal에 저장이 되지 않으므로 literal의 크기를 변경 - 형명시

		System.out.println("byte : "+a+", short : "+b+
				", int : "+c+", long : "+d+", "+e);

		// 문자형 : unicode값 : \u0000
		//char f='A';	//할당 unicode
		char f=66;	//unicode값을 10진수로 할당가능
		char g='0';
		char h='가';
		// 출력 : unicode에 대한 문자 출력
		System.out.println("char : "+f+", "+g+", "+h);

		// 실수
		float i=3.14f;	//형명시 - 실수 literal은 8byte이고
				//float 데이터형은 4type이므로 값할당이 되지 않는다.
		double j=3.14; //리터럴과 데이터형이 같으므로 형명시 생략 할 수 있다.
		double k=3.14D;
	
		System.out.println("float : "+i+", double : "+j+", "+k);

		//불린형
		boolean l=true;
		boolean m=false;
		System.out.println("boolean : "+l+", "+m);
		
		//자동형변환 : int의 하위 데이터형(byte, short, char) 연산되면 결과가 int로 발생
		// int의 하위 데이터형에 값이 할당되면 값의 하위데이터형의 크기에 맞게 변환된다
		byte b1=10, b2=20;
		int result = b1+b2;
		System.out.println(result);


	}//main
}//class