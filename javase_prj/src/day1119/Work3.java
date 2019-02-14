package day1119;

/**
 * 숙제 <br>
 * 1. 출퇴근 시간을 입력받아 아래의 조건으로 출력하세요.  <br>
 *  출력 :  출퇴근 시간은 최대 2시간의 제한이 있으며 60분을 넘는 다면 "장거리"<br>
 *	 60분 이하라면 "단거리"를 출력하세요.<br>
 * 
 * 2. 이름, 교통수단과 출퇴근 거리를 입력받아 아래와 같이 출력하세요.<br>
 *  교통수단은 "버스,지하철,택시,도보"로 제한한다.<br>
 * 버스요금 1200원, 지하철 요금 1250원, 택시요금 3800원 입니다.<br>
 *  요금은 10키로 까지는 기본요금, 매 5키로 초과시 마다 100원씩 증가 합니다.<br>
 *
 * 출력   :  xxx님 출퇴근 교통수단은 xx이며 거리는 xx 키로 입니다.<br>
 *            편도 이용 요금 xx원이고, 왕복이용 요금 xx원이며, 한달 20일기준<br>
 *            교통비는 총: xxxx원 입니다.  <br>
 *
 * @author Owner
 */
public class Work3 {

	public static void main(String[] args) {
		//1번문제 답
		int tmin = Integer.parseInt(args[0]);
		
		if (tmin<60) {
			System.out.println("단거리");
		}else if (tmin<=120) {
			System.out.println("장거리");
		}else {
			System.out.println("출퇴근 제한");
		}//end else
		
		
		//2번문제 답
		int distance = Integer.parseInt(args[3]);
		int price = 0;
		
		if (args[2].equals("버스")) {
			 price = 1200;
		}else if (args[2].equals("지하철")) {
			 price = 1250;
		}else if (args[2].equals("택시")) {
			 price = 3800;
		}else {
			price=0;
		}
		int distance_price = 0;
		if (distance<=10) {
			 distance_price = 0;
		}else if (distance>10) {
			 distance_price = ((distance-10)/5)*100;
		}
		System.out.println(args[1]+"님 출퇴근 교통수단은"+args[2]+"이며 거리는 "+
					args[3]+"키로 입니다. 편도 이용요금 "+(price+distance_price)+
					"원이고, 왕복이용 요금 "+((price+distance_price)*2)+
					"원이며, 한달 20일기준 교통비는 총 : "+(((price+distance_price)*2)*20)+
					"원 입니다.");
	}//main
}//class
