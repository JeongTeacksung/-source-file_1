package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class practice extends JFrame implements ActionListener {

	private JTextField jtfId;
	private JPasswordField jpfPass;
	private JButton jbtnOk;
	private JButton jbtnEnd;

	public practice() {

		super("Login");

		jtfId = new JTextField();
		jpfPass = new JPasswordField();
		jbtnOk = new JButton("확인");
		jbtnEnd = new JButton("종료");

		jtfId.setBorder(new TitledBorder("아이디"));
		jpfPass.setBorder(new TitledBorder("비밀번호"));
		setLayout(null);

		add(jtfId);
		add(jpfPass);
		add(jbtnOk);
		add(jbtnEnd);

		jtfId.setBounds(10, 10, 250, 50);
		jpfPass.setBounds(10, 70, 250, 50);
		jbtnOk.setBounds(60, 130, 60, 40);
		jbtnEnd.setBounds(160, 130, 60, 40);

		// 이벤트 등록
		jtfId.addActionListener(this);
		jpfPass.addActionListener(this);
		jbtnOk.addActionListener(this);
		jbtnEnd.addActionListener(this);

		setBounds(800, 300, 290, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// UseTitledBorder 생성자

	@Override
	public void actionPerformed(ActionEvent ae) {

		String id = jtfId.getText().trim();

		if (ae.getSource() == jtfId) { // 아이디에서 이벤트가 발생하면
			// 값이 들어있다면 커서를 비밀번호로 이동
			if (!id.equals("")) {
				jpfPass.requestFocus();

			} // end if

		} // end if

		if (ae.getSource() == jbtnOk) {/// test중
			// 아이디에 값이 없다면 커서를 아이디로 이동
			if (id.equals("")) {
				jtfId.requestFocus();
				JOptionPane.showMessageDialog(jbtnOk, "아이디를 입력해주세요.","ID_Error",JOptionPane.ERROR_MESSAGE);
				return; // 반환형이 void인 method에서 코드의 실행을 멈추고 호출한곳으로 돌아가라
			} // end if

			// 비밀번호에 값이 없다면 출력창에 "비번입력"을 보여주고
			// 커서를 비밀번호에 이동
			String pass = new String(jpfPass.getPassword());
			if (pass.trim().equals("")) {
				JOptionPane.showMessageDialog(jbtnOk, "비밀번호를 입력해주세요.", "Password_Error", JOptionPane.ERROR_MESSAGE);
				return;
			} // end if

			// 비밀번호에 값이 있다면 아이디가 admin, 비밀번호가 123과 같은지 비교하여 같다면
			// 자바메모장 클래스를 실행
			if (id.equals("admin") && pass.equals("1234") || id.equals("root") && pass.equals("1111")) {
//				new ProDesign();
				System.out.println("성공");
				dispose();
			} else {
			//	jlOutput.setText("아이디나 비밀번호를 확인해 주세요.");
				JOptionPane.showMessageDialog(jbtnOk, "아이디, 비밀번호를 확인해 주세요.", "Login_Error", JOptionPane.ERROR_MESSAGE);
			} // end else

		} // test if

		if (ae.getSource() == jbtnEnd) {
			dispose();
		}//종료버튼

	}// actionPerformed
	
	public static void main(String[] args) {
		new practice();
	}
}
