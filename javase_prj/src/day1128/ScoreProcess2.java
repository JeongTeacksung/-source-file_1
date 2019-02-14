package day1128;

/**
 * 학생의 Oracle, Java, JDBC 과목 점수를 처리하는 프로그램
 * @author Owner
 */
public class ScoreProcess2 {
	private int total;
	private int oracleTotal;
	private int javaTotal;
	private int jdbcTotal;
	private int allTotal;
	private int oracleMax;
	private int javaMax;
	private int jdbcMax;
	private int temp;
	private int temp1;
	private int temp2;
	
	public ScoreProcess2() {
		total=0;
		oracleTotal=0;
		javaTotal=0;
		jdbcTotal=0;
		allTotal=jdbcTotal+javaTotal+oracleTotal;
		temp=0;
		temp1=0;
		temp2=0;
	}//ScoreProcess2
	
	/**
	 * 점수 누적 합
	 * @param score
	 */
	public void addTotal(int score) {
		total+=score;
	}//addTotal
	public void addOracleTotal(int score) {
		oracleTotal+=score;
	}
	public void addJavaTotal(int score) {
		javaTotal+=score;
	}
	public void addJDBCTotal(int score) {
		jdbcTotal+=score;
	}
	public void addAllTotal(int i, int j , int k) {
		allTotal=(i+j+k);
	}

	/**
	 * 점수를 얻는 일
	 * @return
	 */
	public int getTotal() {
		return total;
	}//getTotal
	public int getoracleTotal() {
		return oracleTotal;
	}//getTotal
	public int getjavaTotal() {
		return javaTotal;
	}//getTotal
	public int getjdbcTotal() {
		return jdbcTotal;
	}//getTotal
	public int getallTotal() {
		return allTotal;
	}//getTotal
	/**
	 * 총합 점수를 초기화
	 */
	public void resetTotal() {
		total=0;
		oracleTotal=0;
		javaTotal=0;
		jdbcTotal=0;
	}//resetTotal
	
	
	public String[] nameData() {
		String[] name= {"김정운","이재현","정택성","노진경","최지우","김건하"};
		return name;
	}//nameData
	public int[][] scoreData(){
		int[][] score= {{85,86,81},{95,91,100},{89,71,59},
				{97,96,91},{78,74,77},{100,95,68}};
		return score;
	}//scoreData
	
	public void printScore(String[] name, int[][] score) {
		//숙제. 모든 일은 합당한 매개변수와 반환형을 사용하여
		//method로 정의하여 호출하여 사용한다.
		//1. 각 학생의 평균을 구하여 출력(출력 소수이하 한자리 까지만 출력)
		System.out.println("번호\t이름\tOracle\tJava\tJDBC\t총점\t평균");	
		System.out.println("-------------------------------------------------");
		
		for(int i =0; i<score.length; i++) {//행
			System.out.println();
			System.out.printf("%d\t%s\t",i+1,name[i]);
			for(int j=0; j<score[i].length; j++) {//열
				System.out.printf("%d\t",score[i][j]);
				addTotal(score[i][j]);
			}//end for			
			System.out.printf("%d\t%.1f\n",getTotal(),(double)getTotal()/3);
			resetTotal();
		}//end for
		System.out.println("-------------------------------------------------");
		//2. 각 과목당 총점과 총점의 총점
		System.out.printf("과목총점-------------------------------------------------\n");
			for (int i=0; i<6; i++) {
				addOracleTotal(score[i][0]);
				addJavaTotal(score[i][1]);
				addJDBCTotal(score[i][2]);
			}//end for
			addAllTotal(getoracleTotal(),getjavaTotal(),getjdbcTotal());
			System.out.printf("Oracle[%d]\tJava[%d]\tJDBC[%d]\t전체총점[%d]\n",getoracleTotal(),
					getjavaTotal(),getjdbcTotal(),getallTotal());	
		
		//3. 각 과목당 평균과 전체 평균(전체평균은 소수이하 두자리까지 출력)
		System.out.printf("과목평균-------------------------------------------------\n");
		System.out.printf("Oracle[%.2f]\tJava[%.2f]\tJDBC[%.2f]\t전체평균[%.2f]\n",
					(double)getoracleTotal()/score.length,
					(double)getjavaTotal()/score.length,
					(double)getjdbcTotal()/score.length,
					(double)getallTotal()/(score.length*3));
		System.out.println("----------------------------------------------------------");
		//4. 각 과목당 최고 점수를 출력
		for(int i=0; i<score.length; i++) {
			if (oracleMax<score[i][0]) {
				oracleMax=score[i][0];
			}//end if
			if(javaMax<score[i][1]) {
				javaMax=score[i][1];
			}//end if
			if(jdbcMax<score[i][2]) {
				jdbcMax=score[i][2];
			}//end if
		}//end for
		System.out.printf("최고점수 오라클 [%d] 자바[%d] JDBC [%d]\n",
					oracleMax,javaMax,jdbcMax);
		
		//5. 일등학생의 이름과 총점, 번호
		for(int i =0; i<score.length; i++) {//행
			for(int j=0; j<score[i].length; j++) {//열		
				addTotal(score[i][j]);
				 
			}//end for
		if(temp<getTotal()) {
			temp=getTotal();
			temp1=i;
		}
			resetTotal();
		}//end for
		
		
		System.out.printf("TOP 번호[%d] 이름[%s] 총점[%d]\n",temp1+1,name[temp1],temp);
		
		
			
	
		//6. 자바점수만 오름차순 정렬하여 출력.
		System.out.printf("자바 점수의 오름차순 출력--------\n");
		for(int i=0; i<score.length; i++) {
			for(int j=i+1; j<score.length; j++) {
				if(score[i][1]>score[j][1])	 {
					temp2=score[i][1];
					score[i][1]=score[j][1];
					score[j][1]=temp2;
				}//end if
			}//end for
			System.out.println(score[i][1]);
		}//end for
		
	}//printScore
	
	//숙제 2
	/* 2차원 배열을 참조형 형식으로 만들고 아래와 같이 값을 넣어 출력하는
	 * method 작성
	 * 111111111
	 * 100000001
	 * 100000001
	 * 100000001
	 * 100000001
	 * 111111111
	*/
	public void ar(){
		int[][] ar=new int[5][5];
		for (int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length; j++) {
				ar[i][j]=i==0||i==ar.length-1||
						j==0||j==ar[i].length-1 ? 1:0;
				System.out.print(ar[i][j]);
			}//end for
			System.out.println();
		}//end for
	}//end ar
	
	public static void main(String[] args) {
		ScoreProcess2 sp2 = new ScoreProcess2();
		//처리할 데이터 받기
		String[] name = sp2.nameData();
		int[][] score = sp2.scoreData();
		//처리
		sp2.printScore(name, score);
		
		int[][] ar=new int[5][5];
		for (int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length; j++) {
				ar[i][j]=i==0||i==ar.length-1||
						j==0||j==ar[i].length-1 ? 1:0;
				System.out.print(ar[i][j]);
			}//end for
			System.out.println();
		}//end for
	}//main

}//class
