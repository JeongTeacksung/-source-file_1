package kr.co.sist.memo.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import kr.co.sist.memo.view.HelpDialog;

public class HelpDialogEvt extends WindowAdapter implements ActionListener {

	private HelpDialog hd;
	
	public HelpDialogEvt(HelpDialog hd) {
		this.hd=hd;
	}//HelpDialogEvt
	
	@Override
	public void windowClosing(WindowEvent e) {
		hd.dispose();
	}//windowClosing
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==hd.getBtnOk()) {
			hd.dispose();
		}//end if
		
		
	}//actionPerformed

}//class
