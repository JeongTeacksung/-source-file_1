package day1114;
/*
2. �⺻�� ���������� �����Ǵ� Ŭ������ Wrapper Class��� �Ѵ�. 
   Java Document���� WrapperŬ������ ����� �����ϴ��� ã�ƺ��� 
   �׿� ���� �ּҰ��� �ִ밪�� ��� �Ѵ�. 
 
   ��� :  byte�� �ּҰ� :  -128  �ִ밪 : 127 
*/
class Work1_2{

	public static void main(String[] args) {
	
	System.out.println("byte�� �ּҰ� : "+Byte.MIN_VALUE+
				" �ִ밪 : "+Byte.MAX_VALUE);
	
	System.out.println("short�� �ּҰ� : "+Short.MIN_VALUE+
				" �ִ밪 : "+Short.MAX_VALUE);

	System.out.println("int�� �ּҰ� : "+Integer.MIN_VALUE+
				" �ִ밪 : "+Integer.MAX_VALUE);

	System.out.println("long�� �ּҰ� : "+Long.MIN_VALUE+
				" �ִ밪 : "+Long.MAX_VALUE);

	System.out.println("float�� �ּҰ� : "+Float.MIN_VALUE+
				" �ִ밪 : "+Float.MAX_VALUE);

	System.out.println("double�� �ּҰ� : "+Double.MIN_VALUE+
				" �ִ밪 : "+Double.MAX_VALUE);

	System.out.println("boolean�� �ּҰ� : "+Boolean.FALSE+
				" �ִ밪 : "+Boolean.TRUE);

	
	System.out.println("char�� �ּҰ� : "+(int)Character.MIN_VALUE+
				" �ִ밪 : "+(int)Character.MAX_VALUE);
	}
}