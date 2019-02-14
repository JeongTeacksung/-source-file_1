package day1114;
/*
2. 기본형 데이터형에 대응되는 클래스를 Wrapper Class라고 한다. 
   Java Document에서 Wrapper클래스의 상수가 존재하는지 찾아보고 
   그에 대한 최소값과 최대값을 출력 한다. 
 
   출력 :  byte의 최소값 :  -128  최대값 : 127 
*/
class Work1_2{

	public static void main(String[] args) {
	
	System.out.println("byte의 최소값 : "+Byte.MIN_VALUE+
				" 최대값 : "+Byte.MAX_VALUE);
	
	System.out.println("short의 최소값 : "+Short.MIN_VALUE+
				" 최대값 : "+Short.MAX_VALUE);

	System.out.println("int의 최소값 : "+Integer.MIN_VALUE+
				" 최대값 : "+Integer.MAX_VALUE);

	System.out.println("long의 최소값 : "+Long.MIN_VALUE+
				" 최대값 : "+Long.MAX_VALUE);

	System.out.println("float의 최소값 : "+Float.MIN_VALUE+
				" 최대값 : "+Float.MAX_VALUE);

	System.out.println("double의 최소값 : "+Double.MIN_VALUE+
				" 최대값 : "+Double.MAX_VALUE);

	System.out.println("boolean의 최소값 : "+Boolean.FALSE+
				" 최대값 : "+Boolean.TRUE);

	
	System.out.println("char의 최소값 : "+(int)Character.MIN_VALUE+
				" 최대값 : "+(int)Character.MAX_VALUE);
	}
}
