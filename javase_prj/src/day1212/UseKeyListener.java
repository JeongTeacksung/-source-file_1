package day1212;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Keyboard Event ó��
 * @author Owner
 */
//1. ������ ������Ʈ ���, �̺�Ʈó�� �����ʸ� ����
@SuppressWarnings("serial")
public class UseKeyListener extends Frame implements KeyListener{
	
	public static final int ENTER=10;
	public static final int VK_ESCAPE=27;
//2. �̺�Ʈ�� �����ִ� ������Ʈ ����
	private TextField tf;
	private Label lbl;
	
	public UseKeyListener() {
		super("Ű���� �̺�Ʈ ����");
		//3. ������Ʈ ����
		tf=new TextField();
		lbl=new Label("���â",Label.CENTER);
		
		//4. ��ġ
		add("North", tf);
		add("Center",lbl);
		
		//5. ������Ʈ�� �̺�Ʈ�� ���
		tf.addKeyListener( this );
		
		//6. ������ ũ�� ����
		setBounds(100, 100, 400, 150);
		
		//7. ����ȭ
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}//windowClosing
		});//addWindowListener
		
		
		
	}//UseKeyListener

	@Override
	public void keyTyped(KeyEvent ke) {
		//2. Ű�� ���� ������ ���޵Ǵ� ���� (���� Ű�� ������ ���ڸ� �� �� �ִ�)
//		System.out.println("keyTyped");
		
	}//keyTyped
	@Override
	public void keyPressed(KeyEvent ke) { 
		//1. Ű������ Ű�� ������ �����̿��� Ű�� ������ �� �� ����
//		System.out.println("keyPressed");
	}//keyPressed
	@Override
	public void keyReleased(KeyEvent ke) {
		//3. ����Ű�� ������ �����ϰ� �ٽ� �ö���� ����(����Ű�� ������ �� �� �ִ�)
//		System.out.println("keyReleased");
		//����Ű�� ���ڿ� �ڵ尪�� ���
		char inputKey=ke.getKeyChar();
		int inputCode=ke.getKeyCode();
		// keycode�� Ű���� Ű�� ������ : unicode�� �ٸ��� ���� ���� ���´�.
//		System.out.println(inputKey+" "+inputCode);
		//��� Label�� �Ѹ���.
		StringBuilder output=new StringBuilder();
		output.append("����Ű ���� : ").append(inputKey)
		.append(", ����Ű�� Ű�ڵ� : ").append(inputCode);
		
		lbl.setText(output.toString());
		
		switch (inputCode) {
		case ENTER:
			//JDK1.7���� �߻��� ���� : TextField, TextArea��
			//setText("")�� �ٷ� ����ϸ� �ʱ�ȭ���� �ʴ´�
				tf.getText();
				tf.setText("");
			break;
			
		case KeyEvent.VK_ESCAPE :
			dispose();
		}//end switch
		
		
	}//keyReleased
	public static void main(String[] args) {
		new UseKeyListener();
	}//main
	
}//class