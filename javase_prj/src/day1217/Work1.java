package day1217;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Work1 {
	private List<DataVO> dataList = new ArrayList<DataVO>();
	
	public Work1() {
		String menu = "";
		do {
			menu=JOptionPane.showInputDialog("메뉴선택\n1.입력  2.출력  3.종료");
			if(Integer.parseInt(menu)==1) {
				String[] data=JOptionPane.showInputDialog("데이터입력\n예) 이름, 자바점수, 오라클점수").split(",");
				for (int i = 0; i < data.length; i++) {
					data[i] = data[i].trim();
				}
				DataVO da=new DataVO();
				da.setName(data[0]);
				da.setJavascore(Integer.parseInt(data[1]));
				da.setOraclescore(Integer.parseInt(data[2]));
			
				dataList.add(da);
				
			}//end if
			if(Integer.parseInt(menu)==2) {
				JTextArea jta = new JTextArea(10, 40);
				jta.setEditable(false);
				jta.append("번호\t이름\t자바점수\t오라클점수\t총점\t평균\n");
				int javaScore=0;
				int oracleScore=0;
				int sum=0;
				double avg=0;
				for(int i=0; i<dataList.size(); i++) {
					javaScore=dataList.get(i).getJavascore();
					oracleScore=dataList.get(i).getOraclescore();
					
					jta.append((i+1)+"\t"+dataList.get(i).getName()+"\t"
							+javaScore+"\t"+oracleScore+"\t"+(javaScore + oracleScore) 
							+ "\t" + ((double) (javaScore + oracleScore) / 2) + "\n");
					sum += javaScore + oracleScore;
					avg += ((double) (javaScore + oracleScore) / 2);	
				}//end for
				
				JScrollPane jsp=new JScrollPane(jta);
				JOptionPane.showMessageDialog(null,jta);
			}//end if			
			
		} while (Integer.parseInt(menu)!=3);
		
		
	}//Work1

	public static void main(String[] args) {
		new Work1();
	}//main

}//class
