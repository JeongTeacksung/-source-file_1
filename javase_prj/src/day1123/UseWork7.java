package day1123;

/**
 * 라면의 선호도점수와 라면맛평가 비교
 * @author Owner
 */
public class UseWork7 {
	
	public static void main(String[] args) {
		Work7 sinlamen = new Work7(10,7);
		sinlamen.setName("신라면");
//		sinlamen.setPreferencePoint(10);
//		sinlamen.setSpicyStrength(7);
		
		System.out.println(sinlamen.act());
		System.out.println(sinlamen.act("맛있게"));
		
		System.out.println("-----------------------");
		
		Work7 nugulee = new Work7();
		nugulee.setName("너구리");
//		nugulee.setPreferencePoint(2);
//		nugulee.setSpicyStrength(1);
		
		System.out.println(nugulee.act("그냥저래"));
	}

}
