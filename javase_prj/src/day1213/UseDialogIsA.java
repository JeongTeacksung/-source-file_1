package day1213;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Frame클래스에서 is a 로 생성된 Dialog클래스를 사용
 * @author Owner
 */
@SuppressWarnings("serial")
public class UseDialogIsA extends Frame implements ActionListener {

	private Button btn1;
	
	public UseDialogIsA() {
		super("다이얼로그 사용");
		
		btn1=new Button("다이얼로그 사용");
		Panel panel=new Panel();
		panel.add(btn1);
		
		add("Center", panel);
		
		btn1.addActionListener(this);
		
		setBounds(100, 100, 300, 400);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		
	}//UseDialogHasA
	
	@Override
	public void actionPerformed(ActionEvent ae) {
			createDialog();
	}//actionPerformed

	public void createDialog() {
		new DialogIsA(this);
		
	}//createDialog
	
	public static void main(String[] args) {
		new UseDialogIsA();
	}//main

}//class
