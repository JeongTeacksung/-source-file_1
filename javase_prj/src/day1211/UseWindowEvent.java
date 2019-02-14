package day1211;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * XxxAdapter class�� ���Ǿ���ϴ� ����
 * @author Owner
 */
@SuppressWarnings("serial")
public class UseWindowEvent extends Frame {

	public UseWindowEvent() {
		super("������ �̺�Ʈ ����");
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
		UseWindowEvent.WindowImpl wi=this.new WindowImpl();
		addWindowListener(wi);
	}//UseWindowEvent
	
	
	public static void main(String[] args) {
			new UseWindowEvent();
	}//main

	// WindowListener interface�� ������ class�� ��������ʴ� method������
	// ��� Override�ؾ��Ѵ�
	public class WindowImpl implements WindowListener{
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}//windowOpened


	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		dispose();
	}//windowClosing


	@Override
	public void windowClosed(WindowEvent e) {
		//windowClosing���� dispose()�� ȣ��Ǹ� �׶� windowClosed�� ȣ��
		System.out.println("windowClosed");
	}//windowClosed


	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}//windowIconified


	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}//windowDeiconified


	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}//windowActivated


	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}//windowDeactivated
	}// inner class����
}//class
