package day1130;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK1.5에서부터 추가된 annotation의 사용<br>
 * Deprecated, Override, SuppressWarnings
 * @author Owner
 */
public class UseAnnotation {

	/**
	 * 이 method는 차후에 문제를 발생시킬 수 있습니다.
	 */
	@Deprecated
	public void test() {
		System.out.println("차후에 문제가 발생될 method");
	}//test
	
	@Override
	public String toString() {
		return "온뇨쇼 쵸몬도";
	}//toString

	//method 위에 설정하면 method내의 모든 경고 상황을 무시한다
		@SuppressWarnings({"rawtypes","unused"})
	public void temp() {
		//unused 변수를 사용하지 않을 때
//		@SuppressWarnings("unused")
		int i=0;
		
		//rawtypes : Generic을 사용하지 않을 때 경고 무시
		//변수위에 설정하면 바로 아래있는 특정변수만 경고를 무시하고
//		@SuppressWarnings({"rawtypes","unused"})
		List l=new ArrayList();
		
		int j=0;
		System.out.println( "temp j = "+j );
	}
	
	public static void main(String[] args) {
		UseAnnotation ua=new UseAnnotation();
		ua.test();
		System.out.println(ua);
	}//main

}//class
