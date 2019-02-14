package day1212;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WorkEvt extends WindowAdapter implements ActionListener, ItemListener {

	private Work w;
	
	public WorkEvt(Work w) {
		this.w=w;
	}
	@Override
	public void windowClosing(WindowEvent e) {
		w.dispose();
	}
	
	@Override
	public void itemStateChanged(ItemEvent ie) {

	}//itemStateChanged

	@Override
	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource()==w.getBtnInsert()) {
			insert();
		}//end if
		
		if(ae.getSource()==w.getBtnDelete()) {
			delete();
		}//end if
		
		if(ae.getSource()==w.getBtnUpdate()) {
			update();
		}//end if
		
		if(ae.getSource()==w.getBtnClose()) {
			w.dispose();
		}//end if
		
		
	}//actionPerformed

	public void insert() {
		StringBuilder bf=new StringBuilder();
		bf.append(w.getTfName().getText()).append("/").append(w.getTfAge().getText())
		.append("/").append(w.getTfAdress().getText());
		w.getList().add(bf.toString());
		w.getTfName().setText("");
		w.getTfAge().setText("");
		w.getTfAdress().setText("");

		
	}//insert
	
	public void delete() {
		String listInput;
		listInput = w.getList().getSelectedItem();
		w.getList().remove(listInput);
	}//delete
	
	public void update() {
		String listInput = w.getList().getSelectedItem();
		String Input = w.getTfName().getText()+"/"+w.getTfAge().getText()+
					"/"+w.getTfAdress().getText();
		
		listInput.replaceAll(listInput, Input );
	}//update

	
}//class
