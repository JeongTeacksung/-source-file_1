package day1123;

/**
 * 너구리 오징어짬뽕 신라면에 대한 액션
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
		return "라면 맛있어";
	}
	public String act(String taste) {
		return name+"은(는) 선호도 "+preferencePoint+"점으로 "+taste+" 먹는다.";
	}
	
}//class
