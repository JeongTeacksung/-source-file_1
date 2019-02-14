package day1217;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


@SuppressWarnings("serial")
public class UseJTab extends JFrame {
	private JLabel jl;
	private JTabbedPane jtp;

	public UseJTab() {
		super("Tab");
		
		//1. ���� �߰��� �� �ִ� ��ü ����.
		jtp=new JTabbedPane();
		
		//2. �� �ǿ� �� ������Ʈ�� ����
		//ó�� �ǿ� �� ������Ʈ
		ImageIcon ii=new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/��ȣ1.gif");
		jl=new JLabel(ii);
		
		
		//�ι�° �ǿ� �� ������Ʈ
		JPanel jp=new JPanel();
		jp.add(new JLabel("�̸�"));
		jp.add(new JTextField(30));
		jp.add(new JButton("�Է�"));
		
		//�׹�° �ǿ� �� ������Ʈ
		JButton btnPass=new JButton("��й�ȣ �Է�");
		JButton btn=new JButton("Ŭ��");
		JPanel jp2=new JPanel();
		jp2.setLayout(new GridLayout(2, 1));
		jp2.add(btnPass);
		jp2.add(btn);
		
		
		JPanel tab2=new JPanel();
		tab2.setLayout(new BorderLayout());
		
		jp.setBorder(new TitledBorder("�Էµ�����"));
		
		JTextArea jta=new JTextArea();
		JScrollPane jsp=new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("���â"));
		
		tab2.add("North", jp);
		tab2.add("Center", jsp);
		
		jtp.add("ó����", jl);
		jtp.add("�ι�° ��", tab2);
		jtp.add("����° ��", new JButton("Ŭ��"));
		jtp.add("�׹�° ��", jp2);
		
		UseJTab.TabEvt te=this.new TabEvt();
		btn.addMouseListener(te);
		btnPass.addActionListener(te);
		
		//��ġ
		add("Center",jtp);
		
		setBounds(100, 100, 600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		
	}//UseJTab
	
	public class TabEvt extends MouseAdapter implements ActionListener{
		@Override
		public void mouseClicked(MouseEvent me) {
			
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
//			Panel pass = new Panel();
		
			String pass=JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���.");
			if(pass.equals("123")) {
				jtp.setSelectedIndex(0);
			}//end if
			
			
		}
		
	
	}//TabEvt
	
	
	public static void main(String[] args) {
		new UseJTab();
	}//main

}//class
