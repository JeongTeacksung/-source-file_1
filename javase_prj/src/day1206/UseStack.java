package day1206;

import java.util.Stack;

/**
 * Stack : LIFO(Last Input First Output)�� ������ Ŭ����
 * @author Owner
 */
public class UseStack {
	
	public UseStack() {

		//����)
		Stack<String> stk=new Stack<>();
		//�� �Ҵ�)
//		stk.add("�θ�"); //�θ�Ŭ������ �����ϴ� ����� ��������ʴ´�
		stk.push("�ϼ̽��ϴ�."); //1
		stk.push("����"); //2
		stk.push("���õ�"); //3
		System.out.println(stk);
		System.out.println("ũ�� : "+stk.size()); //�θ�
		
		//�θ�Ŭ������ �����ϴ� ����� ����ϸ� ������
		//��������� ����� �� ���Եȴ�.
//		for(int i=0; i<stk.size(); i++) {
//			System.out.println(stk.get(i));
//		}
		
		while(!stk.empty()) {
			System.out.println(stk.pop()); //���ÿ��� �����͸� ������
													//���������� �� �����͸�
													//����� �� ����
		}//end while
		
	}//UseStack
	
	
	public static void main(String[] args) {
		new UseStack();
		
		
	}//main

}//class