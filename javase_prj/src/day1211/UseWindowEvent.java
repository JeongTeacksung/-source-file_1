package day1211;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * XxxAdapter class가 사용되어야하는 이유
 * @author Owner
 */
@SuppressWarnings("serial")
public class UseWindowEvent extends Frame {

	public UseWindowEvent() {
		super("윈도우 이벤트 연습");
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
		UseWindowEvent.WindowImpl wi=this.new WindowImpl();
		addWindowListener(wi);
	}//UseWindowEvent
	
	
	public static void main(String[] args) {
			new UseWindowEvent();
	}//main

	// WindowListener interface를 구현한 class는 사용하지않는 method일지라도
	// 모두 Override해야한다
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
		//windowClosing에서 dispose()가 호출되면 그때 windowClosed가 호출
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
	}// inner class종료
}//class
