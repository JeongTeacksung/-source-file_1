package day1128;

/**
 * �л��� Oracle, Java, JDBC ���� ������ ó���ϴ� ���α׷�
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
	 * ���� ���� ��
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
	 * ������ ��� ��
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
	 * ���� ������ �ʱ�ȭ
	 */
	public void resetTotal() {
		total=0;
		oracleTotal=0;
		javaTotal=0;
		jdbcTotal=0;
	}//resetTotal
	
	
	public String[] nameData() {
		String[] name= {"������","������","���ü�","������","������","�����"};
		return name;
	}//nameData
	public int[][] scoreData(){
		int[][] score= {{85,86,81},{95,91,100},{89,71,59},
				{97,96,91},{78,74,77},{100,95,68}};
		return score;
	}//scoreData
	
	public void printScore(String[] name, int[][] score) {
		//����. ��� ���� �մ��� �Ű������� ��ȯ���� ����Ͽ�
		//method�� �����Ͽ� ȣ���Ͽ� ����Ѵ�.
		//1. �� �л��� ����� ���Ͽ� ���(��� �Ҽ����� ���ڸ� ������ ���)
		System.out.println("��ȣ\t�̸�\tOracle\tJava\tJDBC\t����\t���");	
		System.out.println("-------------------------------------------------");
		
		for(int i =0; i<score.length; i++) {//��
			System.out.println();
			System.out.printf("%d\t%s\t",i+1,name[i]);
			for(int j=0; j<score[i].length; j++) {//��
				System.out.printf("%d\t",score[i][j]);
				addTotal(score[i][j]);
			}//end for			
			System.out.printf("%d\t%.1f\n",getTotal(),(double)getTotal()/3);
			resetTotal();
		}//end for
		System.out.println("-------------------------------------------------");
		//2. �� ����� ������ ������ ����
		System.out.printf("��������-------------------------------------------------\n");
			for (int i=0; i<6; i++) {
				addOracleTotal(score[i][0]);
				addJavaTotal(score[i][1]);
				addJDBCTotal(score[i][2]);
			}//end for
			addAllTotal(getoracleTotal(),getjavaTotal(),getjdbcTotal());
			System.out.printf("Oracle[%d]\tJava[%d]\tJDBC[%d]\t��ü����[%d]\n",getoracleTotal(),
					getjavaTotal(),getjdbcTotal(),getallTotal());	
		
		//3. �� ����� ��հ� ��ü ���(��ü����� �Ҽ����� ���ڸ����� ���)
		System.out.printf("�������-------------------------------------------------\n");
		System.out.printf("Oracle[%.2f]\tJava[%.2f]\tJDBC[%.2f]\t��ü���[%.2f]\n",
					(double)getoracleTotal()/score.length,
					(double)getjavaTotal()/score.length,
					(double)getjdbcTotal()/score.length,
					(double)getallTotal()/(score.length*3));
		System.out.println("----------------------------------------------------------");
		//4. �� ����� �ְ� ������ ���
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
		System.out.printf("�ְ����� ����Ŭ [%d] �ڹ�[%d] JDBC [%d]\n",
					oracleMax,javaMax,jdbcMax);
		
		//5. �ϵ��л��� �̸��� ����, ��ȣ
		for(int i =0; i<score.length; i++) {//��
			for(int j=0; j<score[i].length; j++) {//��		
				addTotal(score[i][j]);
				 
			}//end for
		if(temp<getTotal()) {
			temp=getTotal();
			temp1=i;
		}
			resetTotal();
		}//end for
		
		
		System.out.printf("TOP ��ȣ[%d] �̸�[%s] ����[%d]\n",temp1+1,name[temp1],temp);
		
		
			
	
		//6. �ڹ������� �������� �����Ͽ� ���.
		System.out.printf("�ڹ� ������ �������� ���--------\n");
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
	
	//���� 2
	/* 2���� �迭�� ������ �������� ����� �Ʒ��� ���� ���� �־� ����ϴ�
	 * method �ۼ�
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
		//ó���� ������ �ޱ�
		String[] name = sp2.nameData();
		int[][] score = sp2.scoreData();
		//ó��
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
