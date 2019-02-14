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
		super("�ڵ���ġ");
		
		Label tfNorth=new Label("�� �� �� ��");
		TextArea taCenter=new TextArea();
		Label lblName=new Label("�̸�");
		TextField tfName=new TextField(10);
		Label lblAge=new Label("����");
		TextField tfAge=new TextField(10);
		Label lblPhone=new Label("��ȭ��ȣ");
		TextField tfPhone=new TextField(10);
		Label lblgender=new Label("����");
		
		Button btn1=new Button("�߰�");
		Button btn2=new Button("����");
		Button btn3=new Button("����");
		Button btn4=new Button("����");
		
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox rb1=new Checkbox("����", true, cg);
		Checkbox rb2=new Checkbox("����", false, cg);
		
		//üũ�ڽ� ��
		Panel panelgender=new Panel();
		panelgender.setLayout(new FlowLayout());
		panelgender.add(rb1);
		panelgender.add(rb2);
		
		//North ����κ� ��
		Panel panelNorth=new Panel();
		panelNorth.add(tfNorth);
		
		//���� ���� ��
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
		
		//���� ������ ���� ��ģ ��
		Panel panelCenter1= new Panel();
		panelCenter1.setLayout(new GridLayout(1, 2));
		panelCenter1.add(panelLeft);
		panelCenter1.add(taCenter);
		
		//South �ؿ��κ� ��ư ��
		Panel panelSouth= new Panel();
		panelSouth.setLayout(new FlowLayout());
		panelSouth.add(btn1);
		panelSouth.add(btn2);
		panelSouth.add(btn3);
		panelSouth.add(btn4);
		
		
		//���̿� ��ü Ʋ ����
		setLayout(new BorderLayout());
		add("North",tfNorth);
		add("Center",panelCenter1);
		add("South",panelSouth);
		
		//������
		setSize(400,300);
		//�����ֱ�
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
