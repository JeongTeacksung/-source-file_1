package day1129;



public class Work_sub extends Work {
	int j=0;
	private String temp2;
	private String temp3;
	public void createArr() {
		Work[] arr= null;
		arr=new Work[7];
		
		arr[0]=new Work(1, "������", "����� ������ ���ﵿ", 28, "����");
		arr[1]=new Work(2, "������", "����� ���빮�� ��ʸ���", 27, "����");
		arr[2]=new Work(3, "������", "������ ���뱸 ���뵿", 26, "����");
		arr[3]=new Work(4, "���ü�", "����� ���α� ���ε�", 27, "����");
		arr[4]=new Work(5, "���ü�", "����� ���۱� �󵵵�", 29, "����");
		arr[5]=new Work(6, "�����", "��⵵ ��õ�� ��õ��", 26, "����");
		arr[6]=new Work(7, "�����", "����� ������ �����絿", 27, "����");
		
		Work tempData=null;
		for(int i = 0; i<arr.length; i++) {
			tempData=arr[i];
			System.out.println(tempData.getNum()+", "+
						tempData.getName()+", "+tempData.getAddress()+", "+
						tempData.getAge()+", "+tempData.getGender());
			
		////////����ÿ� ����ִ� �ο��� ���//////////
			if (tempData.getAddress().substring(0,3).equals("�����")) {
				j++;
			}//end if
			addAge(tempData.getAge());
			maxAge(tempData.getAge());
			
			if(arr[i].getAge()==getMaxAge()) {
				temp2=arr[i].getName();
				temp3=arr[i].getGender();
			}//end if
		}//end for
		//////////////////////////////////////////////////////////
		System.out.println("����� ������ "+j+"��");
		
		System.out.println("���� �� "+getTotalAge()+"��");
		
		System.out.println("�ְ���� "+temp2+"("+temp3+")");
		
	}//creatArr
	public static void main(String[] args) {
		Work_sub wo=new Work_sub();
		wo.createArr();
	
		
	}

}
