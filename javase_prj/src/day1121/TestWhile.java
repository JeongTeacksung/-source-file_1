package day1121;

/**
 * while : ���۰� ���� �� �� ����ϴ� �ݺ���<br>
 * 			�ּ� 0�� ����, �ִ� ���Ǳ��� ����<br>
 * ����) while(���ǽ�){<br>
 * 				�ݺ����๮��;<br>
 * 		  }
 * @author Owner
 */
public class TestWhile {

	public static void main(String[] args) {
		int i=0; //�ʱⰪ
		
		while(i < 10) {
			System.out.println("i = "+i);//�ݺ����๮��
			i++;//������
		}//end while
		
		System.out.println("-----------------------------");
		
		//���� �Է¹޾� 2~9�� ���̶�� ������ ���
//		int j = Integer.parseInt(args[0]);
//		
//		if (j>=2 && j<=9) {
//			int k=1;
//			while(k<10) {
//				System.out.println(j+" * "+k+" = "+(k*j) );
//				k++;
//			}//end while
//		}//end if
		
		
		//���� loop
		i=0;
		while(true) {
			System.out.println("����loop");
			if (i==5) {
				break;
			}//end if
			i++;
		}//end while
				
	}//main

}//class
