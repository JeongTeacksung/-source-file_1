package day1115;
//����
class Work2_1{
	public static void main(String[] args) {
/*
1. ������ �Ҵ�� ���� ����϶��� 2������ ����ϰ� ������� ~�� ����Ͽ�
    ����� �����ϰ� �Էµ� �״���� 10������ ���.
    ��� ��)  " ��� �ΰ��"  10��  1010
                 " ���� �ΰ��"  -10 �� 10
*/		
		int i=10;		
		System.out.println(i>0 ? Integer.toBinaryString(i) : (~--i));
	
	/*--------------------------------------------------------------------------------
	2. 2147483647�� ������ ���� 2byte�� ���� 2byte ���� �и��Ͽ� ����غ�����. 
    ��� ��) ���� 2byte -> 32767
                ���� 2byte - > 65535
	*/	
		int j=2147483647;

		System.out.println("���� 2byte -> "+(j>>16)+ " ���� 2byte -> "+(j>>47));
	/*
	3. ||�� ������� �� ������ true��� ������ �������� �ʴ� ���� ������ �� �ִ�
     �ڵ带 �ۼ��ϼ���.
	*/
		boolean flag1=true, flag2=true, flag3=true;

		flag3= (flag1=3>2) || (flag2=2>3);
			
		System.out.println("����"+flag1+ " ����"+flag2+ " �Ǵ� " +flag3);


	}//main
}//class