package day1207;


import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 숙제<br>
 * main method의 arguments로 날짜를 여러개 입력받아
 * 입력받은 날짜의 요일을 저장하고 출력하는 method를
 * 작성<br>
 * 예)java Test 4 12 30 32 35 15 4 <br>
 * 출력)<br> 
 * 4화<br>
 * 12수<br>
 * 15토<br>
 * 30일 <br>
 * @author Owner
 */
public class Work {
//	Integer[] tempArr = null;
	
	
	public Work() {
		
		
	}//Work
	
	public void day() {
		
	}//day
	
	public void setDay(String arg) {
		StringTokenizer st = new StringTokenizer(arg," ");
		
//		for(int i=0; i<args.length; i++) {
//			
//			tempArr[i]=Integer.parseInt(args[i]);
//		}//end for
		
		Set<String> set=new HashSet<>();
		String temp=" ";
		while(st.hasMoreTokens()) {
			temp = st.nextToken();
			if(Integer.parseInt(temp)<31) {
				set.add(temp);
			}
		}
//		System.out.println(set); 
			
		Map<String,String> map=new HashMap<>();
		Iterator<String> ita = set.iterator();
		String[] yoil = {"일","월","화","수","목","금","토"};
//		Iterator<Integer> ita=set.iterator();
		Calendar c=Calendar.getInstance();
		String day= " ";
		String dayOfWeek =" ";
		while(ita.hasNext()) {
//			int day =ita.next();
			day = ita.next();
			c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
			dayOfWeek= yoil[c.get(Calendar.DAY_OF_WEEK)-1];
			map.put(day, dayOfWeek);
		}//end while
//		System.out.println(map);
		Set<String> keyStore = map.keySet();
//		System.out.println(keyStore);
		String[] key = new String[map.size()];
		keyStore.toArray(key);
		String temp1;
		for(int i=0; i<key.length; i++) {
			for(int j=0; j<key.length; j++) {
				if(Integer.parseInt(key[i])<Integer.parseInt(key[j])) {
					temp1=key[i];
					key[i]=key[j];
					key[j]=temp1;	
				}//end if
			}//end for
		}//end for
		for(int i=0;i<key.length;i++) {
			System.out.print(key[i]+map.get(key[i])+" ");				
		}//end for
		
		
//		while(ita.hasNext()) {
//			map.get(ita.next());
//		}//end while
		
	}//set Day
	
	
	public static void main(String[] args) {
		new Work().setDay("4 12 30 32 35 15 4");
		
		
	}//main

}//class
