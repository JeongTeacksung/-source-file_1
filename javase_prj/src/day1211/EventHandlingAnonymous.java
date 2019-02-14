package day1211;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * anonymous inner class�� �̺�Ʈ ó��
 * @author Owner
 */
//1. ������ ������Ʈ ���
@SuppressWarnings("serial")
public class EventHandlingAnonymous extends Frame{
	//2. �̺�Ʈó���� ����� Component ����
	private Button btn;
	
	public EventHandlingAnonymous() {
		super();
		//3. ������Ʈ ����
		btn=new Button("Ŭ��");
		//4. ��ġ
		Panel panel=new Panel();
		panel.add(btn);
		
		add("Center",panel);
		//5. �̺�Ʈ ��� : anonymous inner class
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư Ŭ��!!!");
				dispose();
			}//actionPerformed
		});
		
		//6. ������ ũ�� ����
		setBounds(200,100,400,200);
		//7. ����ڿ��� �����ֱ�
		setVisible(true);
		
	}//EventHandlingAnonymous
	
	public Button getBtn() {
		return btn;
	}//getBtn
	
	
	public static void main(String[] args) {
		new EventHandlingAnonymous();
	}//main

}//class