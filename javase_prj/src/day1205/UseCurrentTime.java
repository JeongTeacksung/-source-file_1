package day1205;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 1970년01월01일 00:00:00초 로부터 현재 날짜의 시간을
 * ms 로 얻어내려는 System.currentTimeMillis() 사용
 * @author Owner
 */
public class UseCurrentTime {

	public void test() {
		long st=System.currentTimeMillis();
		long sum=0;
			for(int i=0; i<10000; i++) {
				sum=sum+i;
				System.out.println(i);
			}
		
			long et=System.currentTimeMillis();
		System.out.println((et-st)+"ms");
	}//test
	
	public static void main(String[] args) {
		UseCurrentTime uct=new UseCurrentTime();
		long[] avgTime=new long[17];
		long st=0,et=0;
		for(int i=0; i<avgTime.length; i++) {
			st=System.currentTimeMillis();
			uct.test();
			et=System.currentTimeMillis();
			avgTime[i]=(et-st);
			System.out.println(i+" "+avgTime);
		}//for

		
	}//main

}//class
