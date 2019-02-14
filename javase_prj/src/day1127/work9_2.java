package day1127;

public class work9_2 {

	public static void main(String[] args) {
		String ssn="9307291063710";
			String result=ssn.substring(0, 6)+ssn.substring(7,14);
			int k=0;
			int sum=0;
			for (int i=2; i<14; i++) {
				
				if(i<10) {
					k=i*Integer.parseInt(result.substring(i-2, i-1));
					 
				}else {
					k=(i-8)*Integer.parseInt(result.substring(i-2, i-1));
					 	
				}
				sum=sum+k;
			}//end for
			
			System.out.println((11-(k%11))%10==Integer.parseInt(result.substring(12,13))); 
		

	}

}
