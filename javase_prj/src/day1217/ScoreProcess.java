package day1217;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import static java.lang.Integer.parseInt;

public class ScoreProcess {
	private List<ScoreVO> listStu;
	private int totalScore;
	private double d;
	public static final int INPUT_DATA=1;
	public static final int VIEW_DATA=2;
	public static final int EXIT=3;
	
	public ScoreProcess() {
		listStu=new ArrayList<ScoreVO>();
	}//ScoreProcess
	
	/**
	 * 선택메뉴 제공
	 */
	public void inputMenu() {
		String selectMenu="", inputResult="";
		boolean exitFlag=false;
		do {
			selectMenu=JOptionPane.showInputDialog(
					"메뉴선택\n1.입력  2.출력  3.종료");
			try {
				switch (parseInt(selectMenu)) {
				case INPUT_DATA: 
					inputResult="데이터의 갯수가 맞지 않거나, 점수는 숫자 형태이어야합니다.";
					if(inputData()) {
						inputResult="추가성공";
					}//end if
					JOptionPane.showMessageDialog(null, inputResult);
					break;
				case VIEW_DATA:
					printData();	break;
				case EXIT:
					exitFlag=true; break;
				default :
					JOptionPane.showMessageDialog(null, 
							"메뉴는 1,2,3 중 하나이어야 합니다.");
				}//end switch
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, 
						"메뉴는 숫자 이어야합니다.");
			}//end catch	
		}while(!exitFlag);
		
	}//inputMenu
	
	/**
	 * 정보처리할 데이터를 입력받기
	 * @return
	 */
	public boolean inputData() {
		boolean flag=false;
		
		String inputData=JOptionPane.showInputDialog("데이터입력\n"
				+ "예)이름, 자바점수, 오라클점수");
		try {
			String[] data=inputData.replaceAll(" ", "").split(",");
			if(data.length == 3) {//입력형식에 맞을 때
				try {
					ScoreVO sv=new ScoreVO(data[0], parseInt(data[1]), parseInt(data[2]));
					listStu.add(sv); //정제된 데이터를 list에 추가
					flag=true; //실행결과를 저장
					//자바점수와 오라클 점수는 숫자이어야한다.
				}catch (NumberFormatException nfe) {
					flag=false;
				}//end catch
			}//end if
		}catch(NullPointerException npe) {
			
		}//end catch
		
		return flag;
	}//inputData
	
	/**
	 * 입력정보를 출력하는 일
	 */
	public void printData() {
		if(listStu.size()==0) {
			JOptionPane.showMessageDialog(null, "출력할 데이터가 없습니다.");
			return;
		}//end if
		
		StringBuilder viewData=new StringBuilder();
		viewData
		.append("-------------------------------------------\n")
		.append("번호\t이름\t자바\t오라클\t총점\t평균\n")
		.append("-------------------------------------------\n");
		int tempTotal=0;
		ScoreVO sv=null;
		
		for(int i=0; i<listStu.size(); i++) {
			sv=listStu.get(i);
			tempTotal=sv.getJavaScore()+sv.getOracleScore();
			viewData.append(i+1).append("\t").append(sv.getName())
			.append("\t").append(sv.getJavaScore())
			.append("\t").append(sv.getOracleScore())
			.append("\t").append(tempTotal)
			.append("\t").append(tempTotal/2.0).append("\n");
			
			//한 학생의 자바점수와 오라클 점수를 더한 값을 누적합
			totalScore+=tempTotal;
			
			tempTotal=0;//한 학생의 총점변수를 초기화
		}//end for
		
		viewData.append("-------------------------------------------\n")
		.append("\t\t\t\t총점").append(totalScore).append("\t평균")
		.append(String.format("%.2f", totalScore/(double)(listStu.size()*2)));
		
		totalScore=0;
		
		JTextArea jta=new JTextArea(7,50);
		jta.append(viewData.toString());
		JScrollPane jsp=new JScrollPane(jta);
		JOptionPane.showMessageDialog(null, jsp);
		
		
	}//printData
	
	
	public static void main(String[] args) {
		ScoreProcess sp=new ScoreProcess();
		sp.inputMenu();
	}//main

}//class
