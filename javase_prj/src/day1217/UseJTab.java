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
		
		//1. 탭을 추가할 수 있는 객체 생성.
		jtp=new JTabbedPane();
		
		//2. 각 탭에 들어갈 컴포넌트를 생성
		//처음 탭에 들어갈 컴포넌트
		ImageIcon ii=new ImageIcon("C:/dev/workspace/javase_prj/src/day1214/images/기호1.gif");
		jl=new JLabel(ii);
		
		
		//두번째 탭에 들어갈 컴포넌트
		JPanel jp=new JPanel();
		jp.add(new JLabel("이름"));
		jp.add(new JTextField(30));
		jp.add(new JButton("입력"));
		
		//네번째 탭에 들어갈 컴포넌트
		JButton btnPass=new JButton("비밀번호 입력");
		JButton btn=new JButton("클릭");
		JPanel jp2=new JPanel();
		jp2.setLayout(new GridLayout(2, 1));
		jp2.add(btnPass);
		jp2.add(btn);
		
		
		JPanel tab2=new JPanel();
		tab2.setLayout(new BorderLayout());
		
		jp.setBorder(new TitledBorder("입력데이터"));
		
		JTextArea jta=new JTextArea();
		JScrollPane jsp=new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("결과창"));
		
		tab2.add("North", jp);
		tab2.add("Center", jsp);
		
		jtp.add("처음탭", jl);
		jtp.add("두번째 탭", tab2);
		jtp.add("세번째 탭", new JButton("클릭"));
		jtp.add("네번째 탭", jp2);
		
		UseJTab.TabEvt te=this.new TabEvt();
		btn.addMouseListener(te);
		btnPass.addActionListener(te);
		
		//배치
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
		
			String pass=JOptionPane.showInputDialog("비밀번호를 입력하세요.");
			if(pass.equals("123")) {
				jtp.setSelectedIndex(0);
			}//end if
			
			
		}
		
	
	}//TabEvt
	
	
	public static void main(String[] args) {
		new UseJTab();
	}//main

}//class
