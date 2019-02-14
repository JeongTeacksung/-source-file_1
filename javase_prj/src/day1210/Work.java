package day1210;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Work extends Frame {

	public Work() {
		super("자동배치");
		
		Label tfNorth=new Label("학 생 관 리");
		TextArea taCenter=new TextArea();
		Label lblName=new Label("이름");
		TextField tfName=new TextField(10);
		Label lblAge=new Label("나이");
		TextField tfAge=new TextField(10);
		Label lblPhone=new Label("전화번호");
		TextField tfPhone=new TextField(10);
		Label lblgender=new Label("성별");
		
		Button btn1=new Button("추가");
		Button btn2=new Button("변경");
		Button btn3=new Button("삭제");
		Button btn4=new Button("종료");
		
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox rb1=new Checkbox("남자", true, cg);
		Checkbox rb2=new Checkbox("여자", false, cg);
		
		//체크박스 라벨
		Panel panelgender=new Panel();
		panelgender.setLayout(new FlowLayout());
		panelgender.add(rb1);
		panelgender.add(rb2);
		
		//North 제목부분 라벨
		Panel panelNorth=new Panel();
		panelNorth.add(tfNorth);
		
		//센터 왼쪽 라벨
		Panel panelLeft=new Panel();
		panelLeft.setLayout(new GridLayout(4, 2));
		panelLeft.add(lblName);
		panelLeft.add(tfName);
		panelLeft.add(lblAge);
		panelLeft.add(tfAge);
		panelLeft.add(lblPhone);
		panelLeft.add(tfPhone);
		panelLeft.add(lblgender);
		panelLeft.add(panelgender);
		
		//센터 오른쪽 왼쪽 합친 라벨
		Panel panelCenter1= new Panel();
		panelCenter1.setLayout(new GridLayout(1, 2));
		panelCenter1.add(panelLeft);
		panelCenter1.add(taCenter);
		
		//South 밑에부분 버튼 라벨
		Panel panelSouth= new Panel();
		panelSouth.setLayout(new FlowLayout());
		panelSouth.add(btn1);
		panelSouth.add(btn2);
		panelSouth.add(btn3);
		panelSouth.add(btn4);
		
		
		//라벨이용 전체 틀 정리
		setLayout(new BorderLayout());
		add("North",tfNorth);
		add("Center",panelCenter1);
		add("South",panelSouth);
		
		//사이즈
		setSize(400,300);
		//보여주기
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
		
	}//Work

	
	
	public static void main(String[] args) {
		new Work();
		
	}//main

}//class
