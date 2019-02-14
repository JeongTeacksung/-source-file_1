package day1210;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Work2 extends Frame{

	public Work2() {
		super("수동배치");
		Label lbl1=new Label("글꼴");
		Label lbl2=new Label("글꼴 스타일");
		Label lbl3=new Label("크기");
		Label lbl4=new Label("보기");
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		TextField tf3=new TextField();
		TextField tf4=new TextField("AaBbYyZz");
		Button bt1=new Button("확인");
		Button bt2=new Button("취소");
		
		List list1 = new List();
		list1.add("Dialog");
		list1.add("Serif");
		list1.add("SansSerif");
		list1.add("Monospaced");
		list1.add("DialogInput");
		
		List list2 = new List();
		list2.add("일반");
		list2.add("굵게");
		list2.add("기울임꼴");
		list2.add("굵게 기울임꼴");
		
		
		
		List list3 = new List();
		for(int i=2; i<=80; i+=2) {
			String j=String.valueOf(i);
			list3.add(j);
		}//end for

		setLayout(null);
		

		lbl1.setBounds(50, 100, 100, 25); // x, y, w, h
		lbl2.setBounds(200, 100, 100, 25); // x, y, w, h
		lbl3.setBounds(350, 100, 100, 25); // x, y, w, h
		lbl4.setBounds(200,300,100,25);
		tf1.setBounds(50, 130, 120, 25); // x, y, w, h
		tf2.setBounds(200, 130, 120, 25); // x, y, w, h
		tf3.setBounds(350, 130, 120, 25); // x, y, w, h
		tf4.setBounds(200, 330, 150,50);
		bt1.setBounds(325, 390, 60, 25);
		bt2.setBounds(390, 390, 60, 25);
		list1.setBounds(50, 160, 120, 100); // x, y, w, h
		list2.setBounds(200, 160, 120, 100); // x, y, w, h
		list3.setBounds(350, 160, 120, 100); // x, y, w, h
		tf4.setFont(new Font("보기", Font.BOLD, 28));
		
		add( lbl1 );
		add( lbl2 );
		add( lbl3 );
		add( lbl4 );
		add( tf1 );
		add( tf2 );
		add( tf3 );
		add( tf4 );
		add( bt1);
		add( bt2);
		add( list1 );
		add( list2 );
		add( list3 );
		
		
		setBounds(50,10,500,500);//setLocation, setSize 한번에 묶어사용가능
		setResizable(false); //크기고정

		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});//windowClosing
		
		
		
	}//Work2
	
	public static void main(String[] args) {
		new Work2();
		
		
	}//main

}//class
