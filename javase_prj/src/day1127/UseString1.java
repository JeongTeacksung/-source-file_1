package day1127;

/**
 * 
 * @author Owner
 */
public class UseString1 {
	//이메일을 입력받아 이메일의 유효성을 검증하여 boolean형으로
	//결과를 만들어 반환하는 일을 하는 method를 만들어 호출하여
	//사용하기
	//5자이상이면서 @ . 이 포함
	private boolean validEmail(String email) {
		boolean flag=false;
		if(email.indexOf("@")!=-1&&email.indexOf(".")!=-1
				&&email.length()>5) {
			flag=true;
		}//end if
//		flag=email.indexOf("@")!=-1&&email.indexOf(".")!=-1
//				&&email.length()>5;
		
		return flag;
	}//valid
	
	//일을하는 메소드 안에서는 출력을 안하는게 좋다. 이거는 한거
	public void email_check(String email) {
		if((email.indexOf("@")==-1)||(email.indexOf(".")==-1)||(email.length()<=5)) {
			System.out.println("유효하지 않는 이메일");
		}else{
			System.out.println("유요한 이메일");
		}//end else
	}//email_check
			
	
	public static void main(String[] args) {

		UseString1 email = new UseString1();
		email.email_check("jacob729@naver.com"); //유효한이메일
		//일하는 메소드 안에서는 출력을 안하는게 좋음
		
		System.out.println(email.validEmail
							("jacob729@naver.com")); //true
		
		String emailch="ruro@daum.net";
		if(email.validEmail(emailch)) {
			System.out.println(emailch+"유효");
		}else {
			System.out.println(emailch+"무효");			
		}//else //ruro@daum.net유효
		
	}//main

}//class
