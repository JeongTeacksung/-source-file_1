package day1211;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ActionListener를 사용한 이벤트처리<br>
 * is a 관계로 이벤트를 처리
 * @author Owner
 */
//1. window component상속
@SuppressWarnings("serial")
public class UseActionListener extends Frame implements ActionListener{
	private TextField tfName;
	private TextArea taDisplay;
	public UseActionListener() {
		super("Action Event 사용");
		//2. Component 생성
		Label lblName = new Label("이름");
		tfName = new TextField(20);
		Button btnAdd = new Button("추가");
		Button btnClose = new Button("종료");
		taDisplay = new TextArea();
		taDisplay.setFont(new Font("Dialog", Font.BOLD, 30));
		
		//일반 컴포넌트를 배치할 수 있는 컨테이너 컴포넌트를 생성
		Panel panelNorth= new Panel(); // FlowLayout
		//생성된 컨테이너 컴포넌트에 일반 컴포넌트 배치
		panelNorth.add(lblName);
		panelNorth.add(tfName);
		panelNorth.add(btnAdd);
		panelNorth.add(btnClose);
		
		//3. 배치관리자 설정
		setLayout(new BorderLayout());
		//4. 배치 BorderLayout 특징 : 하나의 지역에는 하나의 컴포넌트만 저장 가능
		add("North",panelNorth);
//		add("North", lblName);
//		add("North", tfName);
//		add("North", btnAdd);
//		add("North", btnClose);
		add("Center", taDisplay);
		
		//이벤트 등록
		btnAdd.addActionListener(this); //버튼에서 이벤트가 등록
		tfName.addActionListener(this); //텍스트필드에서 이벤트가 등록
		
		//5. 윈도우 크기설정
		setBounds(200, 150, 400, 250);
		//6. 사용자에게 보여주기
		setVisible(true);
		//윈도우 종료 이벤트 처리
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});//addWindowListener
		
		
		
	}//UsePanel
	
	public static void main(String[] args) {

		new UseActionListener();
		
	}//main

	@Override
	public void actionPerformed(ActionEvent ae) {
		//TextField의 값을 받아와서, TextArea에 추가
		String name=tfName.getText();
		if(!name.isEmpty()) {//입력문자열이 비어있지 않다면 
		//TextArea에 추가
		taDisplay.append(name+"\n");
		//TextField의 값을 초기화
		tfName.setText("");
		}//end if
		//커서를 TextField에 재설정
		tfName.requestFocus();
		
		
		
	}//actionPerformed

}//class
