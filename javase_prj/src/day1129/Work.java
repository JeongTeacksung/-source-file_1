package day1129;

/**
 * ����
 * ��ȣ,�̸�,�ּ�,����,������  ������ �� �ִ� Ŭ������ �����
 * �Ʒ��� ���� ���� �Է��մϴ�.
 * 
 * �Է°�
 * 1, ������, ����� ������ ���ﵿ, 28,����
 * 2, ������, ����� ���빮�� ��ʸ���, 27,����
 * 3, ������, ������ ���뱸 ���뵿, 26,����
 * 4, ���ü�, ����� ���α� ���ε�,27, ����
 * 5, ���ü�, ����� ���۱� �󵵵�,29,����
 * 6, �����, ��⵵ ��õ�� ��õ��,26,����
 * 7, �����, ����� ������ �����絿,27,����
 *  ����� ������ x��
 *  ���� �� x��
 *  �ְ���� "���ü�(����)"
 *  
 *  1. ���ǰ��� �迭�� �Է��ϴ� method�� �ۼ��Ұ�.
 *  2. �迭�� �Էµ� ���� ����ϴ� method �� �ۼ��Ұ�.
 *     2�� method ���� ����ÿ� ��� �ִ� �ο����� ��� �Ұ�.
 *     2�� method ���� ������ ���� ��� �Ұ�.
 *     2�� method ���� ���� ���̰� ���� ����� �̸��� ��� �� ��.
 * @author Owner
 */
public class Work {
	private int num;
	private String name;
	private String address;
	private int age;
	private String gender;
	private int total;
	private int temp;
	private String temp1;

	
	public Work(){
		total=0;
		temp=0;
	}//������
	
	public Work(int num, String name, String address, int age, String gender) {
		this.num=num;
		this.name=name;
		this.address=address;
		this.age=age;
		this.gender=gender;
	}//Work ������
	
	public void setNum(int num) {
		this.num=num;
	}//setNum
	
	public void setName(String name) {
		this.name=name;
	}//setName
	
	public void setAddress(String address) {
		this.address=address;
	}//setAddress
	
	public void setAge(int age) {
		this.age=age;
	}//setAge
	
	public void setGender(String gender) {
		this.gender=gender;
	}//setGender
	
	public int getNum() {
		return num;
	}//getNum
	
	public String getName() {
		return name;
	}//getName
	
	public String getAddress() {
		return address;
	}//getAddress
	
	public int getAge() {
		return age;
	}//getAge()
	
	public String getGender() {
		return gender;
	}//getGender
	
	
	
	////////////////////���� �� ���///////////////////////////
	public void addAge(int age) {
		total+=age;
	}//addAge
	
	public int getTotalAge() {
		return total;
	}//getTotalAge()
	/////////////////////���� �������////////////////////////////////////
	public void maxAge(int age) {
		if(temp<age) {
			temp=age;
		}//end if
		if(age==temp) {
		String temp1 = getName()+"("+getGender()+")";
		}//end if
	}//maxAge
	
	public int getMaxAge() {
		return temp;
	}//geMaxAge
	

}//class
