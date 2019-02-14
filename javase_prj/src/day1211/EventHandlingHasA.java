package day1211;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Has a 관계로 이벤트 처리
 * @author Owner
 */
//1. 이벤트 처리 객체를 구현
public class EventHandlingHasA implements ActionListener {
	//EventHandlingHasA는 Designd의 has a 관계
	//2. has a 관계로 저장하고 사용할 객체 선언
	private Design design;
	
	public EventHandlingHasA(Design design) {
		this.design=design;		
	}//EventHandlingHasA
	
	
	@Override
	//3. abstract method Override
	public void actionPerformed(ActionEvent ae) {
		//이벤트가 발생했을 때 처리할 코드
		System.out.println("전달받은 Design객체 "+design);
		design.dispose();
	}//actionPerformed

}//class
