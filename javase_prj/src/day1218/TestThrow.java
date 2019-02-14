package day1218;

import java.util.Random;

/**
 * 예외를 강제로 발생
 * @author Owner
 */
public class TestThrow {

	/**
	 * 길을 가다가 담배를 피우는 학생을 보면 정의사회를 구현한다.
	 */
	public void teacksung() throws Exception {
		String[] grade= {"촏잉","중딩","고딍"};
		String randomGd=grade[ new Random().nextInt(grade.length)];
		
		if(randomGd.equals("촏잉")) {
//			try {
				throw new Exception(randomGd
						+"행님들 금연해야하는 부분인지용권지용??");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
		}else {
			System.out.println(randomGd
					+"이 담배를 피우면 모른척 지나간다. ('' )( '')");
		}//end else
	}//teacksung
	
	public void teacksung2() throws TobaccoException {
		String[] grade= {"촏잉","중딩","고딍"};
		String randomGd=grade[ new Random().nextInt(grade.length)];
		
		if(randomGd.equals("촏잉")) {
			throw new TobaccoException();
		}else {
			System.out.println(randomGd
					+"이 담배를 피우면 모른척 지나간다. ('' )( '')");
		}//end else
	}//teacksung
	
	public static void main(String[] args) {
		TestThrow tt=new TestThrow();
		try {
			tt.teacksung();
		} catch (Exception e) {
			e.printStackTrace();
		}//end catch
		System.out.println("--------------------------------------");
			try {
				tt.teacksung2();
			} catch (TobaccoException e) {
				e.printStackTrace();
			}//catch
		
	}//main

}//class
