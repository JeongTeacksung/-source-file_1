package kr.co.sist.memo.view;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.TextArea;

import kr.co.sist.memo.evt.HelpDialogEvt;

@SuppressWarnings("serial")
public class HelpDialog extends Dialog {
	private Button btnOk;
	private TextArea taInform;
	
	public HelpDialog(JavaMemo jm) {
		super(jm, "�޸��� ����", true);
		
		btnOk = new Button("Ȯ��");
		taInform = new TextArea("�� �޸����� Java�� ����� ������\n"
				+ "������ �ڵ���� �� ������ �� �� �ֽ��ϴ�.\n"
				+ "��, �� �ڵ带 ����Ͽ� �������� �� ����\n"
				+ "�ҽ������� ��Ģ�����Ѵ�. GNU\n"
				+ "�ۼ��� : ���ü�\n"
				+ "version : 1.0");
		
		taInform.setEditable(false);
		
		setLayout(null);
		
		taInform.setBounds(50, 50, 300, 200);
		btnOk.setBounds(170, 250, 30, 30);
		
		setBounds(jm.getX()+200, jm.getY()+150, 400, 300);
		
		add(taInform);
		add(btnOk);
		
		HelpDialogEvt hde=new HelpDialogEvt(this);
		btnOk.addActionListener(hde);
		
		addWindowListener(hde);
		
		setResizable(false);
		setVisible(true);	
		
		
	}//HelpDialog

	public Button getBtnOk() {
		return btnOk;
	}//getBtnOk

	public TextArea getTaInform() {
		return taInform;
	}//getTaInform
	
	
	
}//class
