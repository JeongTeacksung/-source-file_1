package day1128;

/**
 * 4������ �л����� ����ó�� ���α׷�
 * @author Owner
 */
public class ScoreProcess {

	public ScoreProcess() {
		String[] nameArr = {"������","���ü�","������","��ǿ�","������"};
		int[] scoreArr = {89, 76, 99, 64, 50};
		int totalScore=0; //���� ���� ��
		int maxScore=0; //�ְ�����
		int minScore=100;//��������
		int temp = 0;//���İ��� �ӽ÷� ����
		
		System.out.println("��ȣ\t�̸�\t����");
		System.out.println("----------------------------------");
		for(int i=0; i<nameArr.length; i++) {
			System.out.printf("%d\t%s\t%d\n", i+1, nameArr[i], scoreArr[i]);
			totalScore+=scoreArr[i];;//totalScore=totalScore+scoreArr[i]
			
			//�ְ������� ���� ��ȯ���� ���� ������ �۴ٸ�
			if( maxScore < scoreArr[i]) {
				//���� ��ȯ���� ���� ������ �ְ������� �������ش�.
				maxScore=scoreArr[i];
			}//end if
			
			//�����������ϱ�
			if(minScore > scoreArr[i]) {
				minScore=scoreArr[i];
			}//end if
			
			
			
		}//end for
		
		System.out.println("----------------------------------");
		System.out.println("�����ο� : "+nameArr.length+"��");
		System.out.printf("���� [%5d] ��� [%.2f]\n",totalScore, 
				(double)totalScore/nameArr.length);
		System.out.printf("�ְ���[%5d] ������[%5d]\n",
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
		String[] zodiac= {"������","��","��","����","��","��","��","�䳢",
				"��","��","��","��"};
		System.out.println(zodiac[birth%12]);
		
	}//main

}//class
