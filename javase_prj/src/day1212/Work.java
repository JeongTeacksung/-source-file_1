package day1212;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;

@SuppressWarnings("serial")
public class Work extends Frame {

	private Label lblName, lblAge, lblAdress, lblList;
	private TextField tfName, tfAge, tfAdress;
	private Button btnInsert, btnDelete, btnUpdate, btnClose;
	private	List list;
	
	public Work() {
		super("숙제");
		lblName = new Label("이름");
		lblAge = new Label("나이");
		lblAdress = new Label("주소");
		lblList =new Label("List");
		
		tfName = new TextField();
		tfAge = new TextField();
		tfAdress = new TextField();
		
		list = new List();
		
		btnInsert = new Button("추가");
		btnDelete = new Button("삭제");
		btnUpdate = new Button("변경");
		btnClose = new Button("닫기");
		
		setLayout(null);
		lblName.setBounds(80, 100, 30, 30);
		lblAge.setBounds(80, 150, 30, 30);
		lblAdress.setBounds(80, 200, 30, 30);
		lblList.setBounds(180, 70, 30, 30);
		
		tfName.setBounds(120, 100, 50, 30);
		tfAge.setBounds(120, 150, 50, 30);
		tfAdress.setBounds(120, 200, 50, 30);
		
		list.setBounds(180, 100, 200, 130);
		
		btnInsert.setBounds(130, 250, 50, 30);
		btnDelete.setBounds(190, 250, 50, 30);
		btnUpdate.setBounds(250, 250, 50, 30);
		btnClose.setBounds(310, 250, 50, 30);
		
		add(lblName);
		add(lblAge);
		add(lblAdress);
		add(lblList);
		
		add(tfName);
		add(tfAge);
		add(tfAdress);
		
		add(list);
		
		add(btnInsert);
		add(btnDelete);
		add(btnUpdate);
		add(btnClose);
		
		WorkEvt we=new WorkEvt(this);
		addWindowListener(we);
		
		btnInsert.addActionListener(we);
		btnDelete.addActionListener(we);
		btnClose.addActionListener(we);
		btnUpdate.addActionListener(we);
		
		
		setBounds(200, 200, 500, 400);
		
		
		setVisible(true);
		
		
	}//Work
	
	
	
	public Label getLblName() {
		return lblName;
	}



	public Label getLblAge() {
		return lblAge;
	}



	public Label getLblAdress() {
		return lblAdress;
	}



	public Label getLblList() {
		return lblList;
	}



	public TextField getTfName() {
		return tfName;
	}



	public TextField getTfAge() {
		return tfAge;
	}



	public TextField getTfAdress() {
		return tfAdress;
	}



	public Button getBtnInsert() {
		return btnInsert;
	}



	public Button getBtnDelete() {
		return btnDelete;
	}



	public Button getBtnUpdate() {
		return btnUpdate;
	}



	public Button getBtnClose() {
		return btnClose;
	}



	public List getList() {
		return list;
	}



	public static void main(String[] args) {
		new Work();
	}//main




}//class
