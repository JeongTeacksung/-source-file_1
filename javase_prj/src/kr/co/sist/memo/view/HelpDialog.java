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
		super(jm, "메모장 정보", true);
		
		btnOk = new Button("확인");
		taInform = new TextArea("이 메모장은 Java로 만들어 졌으며\n"
				+ "누구나 코드수정 및 배포를 할 수 있습니다.\n"
				+ "단, 이 코드를 사용하여 개선했을 때 에는\n"
				+ "소스공개를 원칙으로한다. GNU\n"
				+ "작성자 : 정택성\n"
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
