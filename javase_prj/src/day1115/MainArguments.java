package day1115;
/*
	Java ���α׷� �ܺο��� Java ���α׷� ���η� ����
	������ �� main method�� Arguments ���.
	���� ) java bytecode�� �� �� ��
*/

class MainArguments{
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0]+args[1]); // ���ڿ��� ���ϱ⸸ �ȴ�.
		
		//���ڿ��� ������ ��ȯ
		//Integer.parseInt(���ڿ�); ���ڿ��� �����Ͽ� int������
		//��ȯ�� �� �� ���� ��ȯ�ϴ� ��  // int i= (int)args[0]; ���� -> �������������̱⶧���� �⺻������ ����x
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		Integer.parseInt("111");
		

		System.out.println( i*j );
		
		System.out.println(args[2]+"�� �ȳ��ϼ���"); // args[�ε���]  �ε����� �����ؾ��Ѵ� *Java�� 0���ͽ���
	}//main
}//class
