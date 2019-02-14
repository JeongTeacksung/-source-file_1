package day1204;

public class UseWork {

	public void eat(WorkImpl ai) {
		System.out.println(ai.getRestarant()+"���� "+ai.getMenu()+"�� �Դ´�.");
	}//eat
	
	public static void main(String[] args) {
		WorkImpl ai=new WorkImpl();
		UseWork uw=new UseWork();
		uw.eat(ai);
		
		uw.eat(new WorkImpl(){
			@Override
			public String getRestarant() {
				return getName()+"�̰� "+"�ҽ�������";
			}//getRestarant
			
			@Override
			public String getMenu() {
				return "��Ƣ��";
			}//getMenu
			
			public String getName() {
				return "�ü�";
			}//getName
		});
	}//main

}//class
