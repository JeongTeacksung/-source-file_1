package day1127;

/**
 * ���� 1. <br>
 * �ֹι�ȣ�� �Է¹޾� ó���ϴ� ���α׷� �ۼ�<br>
 * �� �۾��� method�����ϰ� ȣ���Ͽ� ����� �޾Ƽ� ó��<br>
 * 1-1) �����ڴ� �ֹι�ȣ�� �޾� instance������ �Ҵ��Ѵ�<br>
 * -�ν��Ͻ� ������ �� ���<br>
 * 1-2) �ֹι�ȣ(14��)�� ����üũ�Ͽ� 14�ڰ� �ƴϸ� false��ȯ<br>
 * 1-3) �ֹι�ȣ�� 6��° �ڸ��� '-'�� �ƴϸ� false��ȯ<br>
 * 1-4) �ֹι�ȣ�� ��ȿ�� �����Ͽ� ��ȿ�ϸ� true <br>
 *  -���ڸ��� 2 3 4 5 6 7 8 9 2 3 4 5 �� ���Ѱ���
 *  ���Ͽ� 11�� ���� ������ ���� ��� 11���� �� ����
 *  ���� 10���� ���� �������� �ֹι�ȣ�� ���ڸ��� ���ٸ� true<br>
 *  1-5) ��������� ��ȯ�ϴ� �� : "1988-11-11"<br>
 *  1-6) ���̸� ��ȯ�ϴ� �� : �����ι�ȯ <br>
 *  1-7) ������ ��ȯ : �� �Ǵ� �� <br>
 *  1-8) ������/�ܱ��� ��ȯ : 123409-������ 56(1900���)78-�ܱ���
 *  1-9) �츦 ��ȯ : "�� ��"
 * @author Owner
 */
public class Work9 {
	public String ssn;
	
	/**
	 * �ֹι�ȣ�� �޾� instance������ �Ҵ��Ѵ�
	 * @param ssn �ֹι�ȣ �Է�
	 */
	public Work9(String ssn) {
		this.ssn=ssn;
	}//Work9
	
	/**
	 * �ֹι�ȣ(14��)�� ����üũ�Ͽ� 14�ڰ� �ƴϸ� false��ȯ
	 */
	public boolean ssn_length() {
	
		return ssn.length() ==14;
	}//ssn_length
	
	/**
	 * 1-3) �ֹι�ȣ�� 6��° �ڸ��� '-'�� �ƴϸ� false��ȯ
	 * @return true false
	 */
	public boolean ssn_hipen() {
		int index=ssn.indexOf("-");
		return index==6;
	}//ssn_hipen
	
	
	/**
	 * 1-4) �ֹι�ȣ�� ��ȿ�� �����Ͽ� ��ȿ�ϸ� true
	 * @return ��ȿ�� ���� true / false
	 */
	public boolean ssn_check() {
		String result=ssn.substring(0, 6)+ssn.substring(7,14);
		int k=0;
		int sum=0;
		for (int i=2; i<14; i++) {		
			if(i<10) {
				k=i*Integer.parseInt(result.substring(i-2, i-1));
				 
			}else {
				k=(i-8)*Integer.parseInt(result.substring(i-2, i-1));			 	
			}//end else
			sum=sum+k;
		}//end for	
		return (11-(sum%11))%10==Integer.parseInt(result.substring(12,13)); 
	}//ssn_check
	
	/**
	 * 1-5) ��������� ��ȯ�ϴ� �� : "1988-11-11"
	 * @return �������
	 */
	public String ssn_birth() {
		String year;

		if((ssn.substring(7, 8).equals("0"))||(ssn.substring(7,8).equals("9"))) {
			year="18";
		}else if((ssn.substring(7, 8).equals("1"))||(ssn.substring(7, 8).equals("2"))||
				(ssn.substring(7, 8).equals("5"))||(ssn.substring(7, 8).equals("6"))) {
			year="19";
		}else if((ssn.substring(7, 8).equals("3"))||(ssn.substring(7, 8).equals("4"))||
				(ssn.substring(7, 8).equals("7"))||(ssn.substring(7, 8).equals("8"))) {
			year="20";
		}else{
			year="����";
		}//end if
		String birth_year= year+ssn.substring(0,2)+"-"
						+ssn.substring(2,4)+"-"+ssn.substring(4,6);
		
		return birth_year;
	}//ssn_birth
	
	/**
	 * 1-6) ���̸� ��ȯ�ϴ� �� : �����ι�ȯ 
	 * @return ���̸� ������ ��ȯ
	 */
	public int ssn_age() {
		return 2019-Integer.parseInt(ssn_birth());
	}//ssn_age
	
	/**
	 * 1-7) ������ ��ȯ : �� �Ǵ� ��
	 * @return ��, ��
	 */
	public String ssn_gender() {
		String gender;
		if ((ssn.substring(7, 8).equals("1"))||(ssn.substring(7, 8).equals("3"))) {
			gender="��";
		}else { 
			gender="��";
		}
		return gender;
	}//ssn_gender
	
	/**
	 * 1-8) ������/�ܱ��� ��ȯ : 123409-������ 5678-�ܱ���
	 * @return ������, �ܱ���
	 */
	public String ssn_contry() {
		String contry;
		if ((ssn.substring(7, 8).equals("5"))||(ssn.substring(7, 8).equals("6"))||
				(ssn.substring(7,8).equals("7"))||(ssn.substring(7,8).equals("8"))) {
			contry="�ܱ���";
		}else {
			contry="������";
		}
		return contry;
	}//ssn_contry
	
	
	/**
	 * 1-9) �츦 ��ȯ : "�� ��"
	 * @return ��
	 */
	public String ssn_ddi() {
		int j = Integer.parseInt(this.ssn_birth().substring(0, 4))%12;
		String[] arr = {"������","��","��","����","��","��","��","�䳢",
				"��","��","��","��"};
		

		
		return arr[j]+"��"; 
	}//ssn_ddi
	
	
	
	public static void main(String[] args) {
		String ssn="930729-1111111";
		Work9 ssn1 = new Work9(ssn);

		if(ssn1.ssn_length() == true) {
			if(ssn1.ssn_hipen()==true) {
				if(ssn1.ssn_check()==true) {
					
				}else {
					System.out.println("�߸��� �ֹι�ȣ");
				}//end if
			}else {
				System.out.println("-�� ��ġ�� Ʋ��");
			}//end if
		}else {
			System.out.println("�ֹι�ȣ�� ���̰� Ʋ��");
		}//end if
		System.out.println(ssn1.ssn_ddi());
		
		
	}//main

}//class
