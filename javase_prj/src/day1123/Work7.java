package day1123;

/**
 * �ʱ��� ��¡��«�� �Ŷ�鿡 ���� �׼�
 * @author Owner
 */
public class Work7 {
	private String name;
	private int spicyStrength;
	private int preferencePoint;
	
	public Work7() {
		this(5,5);
	}
	public Work7(int spicyStrength, int preferencePoint) {
		this.spicyStrength=spicyStrength;
		this.preferencePoint=preferencePoint;
	}
	
	public void setSpicyStrength(int spicyStrength) {
		if (!(spicyStrength>0)) {
			spicyStrength = 1;
		}//end if
		this.spicyStrength = spicyStrength;
	}//setSpicyStrength
	
	public void setPreferencePoint(int preferencePoint) {
		this.preferencePoint=preferencePoint;
	}//setPreferencePoint
	
	public void setName(String name) {
		this.name=name;
	}//setName
	
	public int getSpicyStrength() {
		return spicyStrength;
	}//getSpicyStrength
	
	public int getPreferencePoint() {
		return preferencePoint;
	}//getPreferencePoint
	
	public String getName() {
		return name;
	}//String getName
	
	public String act() {
		return "��� ���־�";
	}
	public String act(String taste) {
		return name+"��(��) ��ȣ�� "+preferencePoint+"������ "+taste+" �Դ´�.";
	}
	
}//class
