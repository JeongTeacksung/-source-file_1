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
		jbtnOk = new JButton("Ȯ��");
		jbtnEnd = new JButton("����");

		jtfId.setBorder(new TitledBorder("���̵�"));
		jpfPass.setBorder(new TitledBorder("��й�ȣ"));
		setLayout(null);

		add(jtfId);
		add(jpfPass);
		add(jbtnOk);
		add(jbtnEnd);

		jtfId.setBounds(10, 10, 250, 50);
		jpfPass.setBounds(10, 70, 250, 50);
		jbtnOk.setBounds(60, 130, 60, 40);
		jbtnEnd.setBounds(160, 130, 60, 40);

		// �̺�Ʈ ���
		jtfId.addActionListener(this);
		jpfPass.addActionListener(this);
		jbtnOk.addActionListener(this);
		jbtnEnd.addActionListener(this);

		setBounds(800, 300, 290, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// UseTitledBorder ������

	@Override
	public void actionPerformed(ActionEvent ae) {

		String id = jtfId.getText().trim();

		if (ae.getSource() == jtfId) { // ���̵𿡼� �̺�Ʈ�� �߻��ϸ�
			// ���� ����ִٸ� Ŀ���� ��й�ȣ�� �̵�
			if (!id.equals("")) {
				jpfPass.requestFocus();

			} // end if

		} // end if

		if (ae.getSource() == jbtnOk) {/// test��
			// ���̵� ���� ���ٸ� Ŀ���� ���̵�� �̵�
			if (id.equals("")) {
				jtfId.requestFocus();
				JOptionPane.showMessageDialog(jbtnOk, "���̵� �Է����ּ���.","ID_Error",JOptionPane.ERROR_MESSAGE);
				return; // ��ȯ���� void�� method���� �ڵ��� ������ ���߰� ȣ���Ѱ����� ���ư���
			} // end if

			// ��й�ȣ�� ���� ���ٸ� ���â�� "����Է�"�� �����ְ�
			// Ŀ���� ��й�ȣ�� �̵�
			String pass = new String(jpfPass.getPassword());
			if (pass.trim().equals("")) {
				JOptionPane.showMessageDialog(jbtnOk, "��й�ȣ�� �Է����ּ���.", "Password_Error", JOptionPane.ERROR_MESSAGE);
				return;
			} // end if

			// ��й�ȣ�� ���� �ִٸ� ���̵� admin, ��й�ȣ�� 123�� ������ ���Ͽ� ���ٸ�
			// �ڹٸ޸��� Ŭ������ ����
			if (id.equals("admin") && pass.equals("1234") || id.equals("root") && pass.equals("1111")) {
//				new ProDesign();
				System.out.println("����");
				dispose();
			} else {
			//	jlOutput.setText("���̵� ��й�ȣ�� Ȯ���� �ּ���.");
				JOptionPane.showMessageDialog(jbtnOk, "���̵�, ��й�ȣ�� Ȯ���� �ּ���.", "Login_Error", JOptionPane.ERROR_MESSAGE);
			} // end else

		} // test if

		if (ae.getSource() == jbtnEnd) {
			dispose();
		}//�����ư

	}// actionPerformed
	
	public static void main(String[] args) {
		new practice();
	}
}
