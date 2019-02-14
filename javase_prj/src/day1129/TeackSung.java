package day1129;

/**
 * 공통적인 특징을 정의하고
 * 택성의 특징정의
 * @author Owner
 */
public class TeackSung extends Person{

	public int shootPower;
	public int goal;
	
	
	/**
	 * 기본생성자
	 * 택성의 기본슛강도 정의
	 */
	public TeackSung() {
		shootPower=7;
	}//TeackSung
	
	/**
	 * 택성이 슛강도에 따른 확률
	 * @param shootnum 슛을 쏜 횟수
	 * @param shootPower 슛강도
	 */
	public String goalPersent(int shootnum, int shootPower) {
		double per;
		if (shootPower>=7) {
			per=0.7;
			goal= (int)(shootnum*(per));
		}else if ( shootPower>=5) {
			per=0.5;
			goal= (int)(shootnum*(per));
		}else {
			per=0.2;
			goal=(int)(shootnum*per);
		}//end else
		
		return getName()+"이 골키퍼 상대로 "+shootPower+"의 강도로 "+shootnum+"번 슛을 쏴서 "
					+(per*(double)100)+"퍼센트의 확률로 "+goal+"골을 넣었다";
	}//end TeackSung
	
	
}//class
