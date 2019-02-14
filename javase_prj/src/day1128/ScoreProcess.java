package day1128;

/**
 * 4강의장 학생들의 성적처리 프로그램
 * @author Owner
 */
public class ScoreProcess {

	public ScoreProcess() {
		String[] nameArr = {"이재찬","정택성","이재현","김건우","공선의"};
		int[] scoreArr = {89, 76, 99, 64, 50};
		int totalScore=0; //총점 누적 합
		int maxScore=0; //최고점수
		int minScore=100;//최하점수
		int temp = 0;//정렬값을 임시로 저장
		
		System.out.println("번호\t이름\t점수");
		System.out.println("----------------------------------");
		for(int i=0; i<nameArr.length; i++) {
			System.out.printf("%d\t%s\t%d\n", i+1, nameArr[i], scoreArr[i]);
			totalScore+=scoreArr[i];;//totalScore=totalScore+scoreArr[i]
			
			//최고점수가 현재 순환중인 방의 값보다 작다면
			if( maxScore < scoreArr[i]) {
				//현재 순환중인 방의 값으로 최고점수를 변경해준다.
				maxScore=scoreArr[i];
			}//end if
			
			//최하점수구하기
			if(minScore > scoreArr[i]) {
				minScore=scoreArr[i];
			}//end if
			
			
			
		}//end for
		
		System.out.println("----------------------------------");
		System.out.println("응시인원 : "+nameArr.length+"명");
		System.out.printf("총점 [%5d] 평균 [%.2f]\n",totalScore, 
				(double)totalScore/nameArr.length);
		System.out.printf("최고점[%5d] 최하점[%5d]\n",
					maxScore, minScore); 
		for(int i=0; i<scoreArr.length; i++) {
			for(int j=i+1; j<scoreArr.length; j++) {
				if(scoreArr[i]<scoreArr[j]) {
					temp=scoreArr[i];
					scoreArr[i]=scoreArr[j];
					scoreArr[j]=temp;
				}//end if
			}//end for			
					System.out.printf("%-4d",scoreArr[i]);
		}//end for
		
		
		
	}//ScoreProcess
	
	public static void main(String[] args) {
		new ScoreProcess();
		System.out.println("--------------------------");
		int birth=1964;
		String[] zodiac= {"원숭이","닭","개","돼지","쥐","소","범","토끼",
				"용","뱀","말","양"};
		System.out.println(zodiac[birth%12]);
		
	}//main

}//class
