package day1210;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Container Component : 
 * �Ϲ� ������Ʈ�� Container ������Ʈ�� ������ �� �ִ� Component ���
 * @author Owner
 */
//1. window component���
@SuppressWarnings("serial")
public class UsePanel extends Frame{

	public UsePanel() {
		super("Container Component ���");
		//2. Component ����
		Label lblName = new Label("�̸�");
		//������ : Field
		lblName.setBackground(Color.PINK);
		lblName.setForeground(Color.magenta);
		TextField tfName = new TextField(20);
		//������ : RGB�� ����� �����ڸ� ��� -> �پ��� ���� ����� �� �ִ�.
		Color back=new Color(0xEDA0E3);
		Color fore=new Color(0x19CD61);
		tfName.setBackground(back);
		tfName.setForeground(fore);
		
		Button btnAdd = new Button("�߰�");
		Button btnClose = new Button("����");
		TextArea taDisplay = new TextArea();
		//�۲� : Dialog, DialogInput,Monospaced, Serif, or SansSerif
		//Style : PLAIN, BOLD, ITALIC, BOLD|ITALIC
		taDisplay.setFont(new Font("Dialog", Font.BOLD|Font.ITALIC, 20));
		
		//�Ϲ� ������Ʈ�� ��ġ�� �� �ִ� �����̳� ������Ʈ�� ����
		Panel panelNorth= new Panel(); // FlowLayout
		//������ �����̳� ������Ʈ�� �Ϲ� ������Ʈ ��ġ
		panelNorth.add(lblName);
		panelNorth.add(tfName);
		panelNorth.add(btnAdd);
		panelNorth.add(btnClose);
		
		//3. ��ġ������ ����
		setLayout(new BorderLayout());
		//4. ��ġ BorderLayout Ư¡ : �ϳ��� �������� �ϳ��� ������Ʈ�� ���� ����
		add("North",panelNorth);
//		add("North", lblName);
//		add("North", tfName);
//		add("North", btnAdd);
//		add("North", btnClose);
		add("Center", taDisplay);
		
		//5. ������ ũ�⼳��
		setBounds(200, 150, 400, 250);
		//6. ����ڿ��� �����ֱ�
		setVisible(true);
		//������ ���� �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});//addWindowListener
		
		
		
	}//UsePanel
	
	public static void main(String[] args) {

		new UsePanel();
		
	}//main

}//class