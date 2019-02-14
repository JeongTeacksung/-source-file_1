package day1204;

public class UseWork {

	public void eat(WorkImpl ai) {
		System.out.println(ai.getRestarant()+"¿¡¼­ "+ai.getMenu()+"¸¦ ¸Ô´Â´Ù.");
	}//eat
	
	public static void main(String[] args) {
		WorkImpl ai=new WorkImpl();
		UseWork uw=new UseWork();
		uw.eat(ai);
		
		uw.eat(new WorkImpl(){
			@Override
			public String getRestarant() {
				return getName()+"ÀÌ°¡ "+"ÁÒ½º¶±ººÀÌ";
			}//getRestarant
			
			@Override
			public String getMenu() {
				return "¶±Æ¢¼ø";
			}//getMenu
			
			public String getName() {
				return "ÅÃ¼º";
			}//getName
		});
	}//main

}//class
