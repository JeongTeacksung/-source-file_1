package day1127;

/**
 * 
 * @author Owner
 */
public class UseString1 {
	//�̸����� �Է¹޾� �̸����� ��ȿ���� �����Ͽ� boolean������
	//����� ����� ��ȯ�ϴ� ���� �ϴ� method�� ����� ȣ���Ͽ�
	//����ϱ�
	//5���̻��̸鼭 @ . �� ����
	private boolean validEmail(String email) {
		boolean flag=false;
		if(email.indexOf("@")!=-1&&email.indexOf(".")!=-1
				&&email.length()>5) {
			flag=true;
		}//end if
//		flag=email.indexOf("@")!=-1&&email.indexOf(".")!=-1
//				&&email.length()>5;
		
		return flag;
	}//valid
	
	//�����ϴ� �޼ҵ� �ȿ����� ����� ���ϴ°� ����. �̰Ŵ� �Ѱ�
	public void email_check(String email) {
		if((email.indexOf("@")==-1)||(email.indexOf(".")==-1)||(email.length()<=5)) {
			System.out.println("��ȿ���� �ʴ� �̸���");
		}else{
			System.out.println("������ �̸���");
		}//end else
	}//email_check
			
	
	public static void main(String[] args) {

		UseString1 email = new UseString1();
		email.email_check("jacob729@naver.com"); //��ȿ���̸���
		//���ϴ� �޼ҵ� �ȿ����� ����� ���ϴ°� ����
		
		System.out.println(email.validEmail
							("jacob729@naver.com")); //true
		
		String emailch="ruro@daum.net";
		if(email.validEmail(emailch)) {
			System.out.println(emailch+"��ȿ");
		}else {
			System.out.println(emailch+"��ȿ");			
		}//else //ruro@daum.net��ȿ
		
	}//main

}//class
