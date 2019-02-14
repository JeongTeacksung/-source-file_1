package day1211;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Work extends Frame implements ItemListener  {

	private Label lbl;
	private Choice choice;
	private TextField tf;
	
	public Work() {
		lbl=new Label("Label");
		choice=new Choice();
		tf=new TextField("������ ȭ����");
		
		String[] color = {"������","������","�Ķ���","������","���","��ȫ��"};
		for(int i=0; i<color.length; i++) {
			choice.add(color[i]);
		}
		
		setLayout(new FlowLayout());
		add(lbl);
		add(tf);
		add(choice);
		
		choice.addItemListener(this);
		
		setBounds(200, 200, 400, 300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});		
		
		
		
		
	}//Work
	
	public static void main(String[] args) {
		new Work();
		
		
	}//main

	@Override
	public void itemStateChanged(ItemEvent e) {
		String readItem=choice.getSelectedItem();
		Color c=Color.BLACK;
		if(readItem.equals("������")) {
			c=Color.BLACK;
		}else if(readItem.equals("�Ķ���")) {
			c=Color.blue;
		}else if(readItem.equals("������")) {
			c=Color.red;
		}else if(readItem.equals("���")) {
			c=Color.GREEN;			
		}else if(readItem.equals("��ȫ��")) {
			c=Color.pink;			
		}else {
			c=Color.black;
		}//end if		
		tf.setForeground(c);
		
	}//itemStateChanged

}//class
