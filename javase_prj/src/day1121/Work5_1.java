package day1121;

public class Work5_1 {

	public static void staticMathod() {
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}//end for
			System.out.println("");
		}//end for
	}//end staticMathod
	

	public static void main(String[] args) {
		Work5_1.staticMathod();
		
	}//main

}//class
