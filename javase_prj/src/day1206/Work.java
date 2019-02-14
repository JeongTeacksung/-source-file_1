package day1206;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 숙제<br>
 * 1. 아래의 데이터를 처리하는 프로그램을 작성하세요. 백인재,이봉현,이재찬,정택성,이재현,김정운 의 데이터가 존재하고, 점수는 0~100점
 * 사이로 발생할수있습니다.
 * 
 * 프로그램이 실행되면 위의 사람중에 2명이상 성적처리 대상자 이고 n명의 이름과 점수를 저장하여 출력하는 일을 하는 프로그램 작성.
 * 중복이름은 들어갈 수 없다.
 * 
 * 출력 예 ) 이재찬 89 정택성 77 김정운 90 총점 xx점
 * 
 * @author Owner
 */
public class Work {

	public Work() {
		Random r = new Random();
		List<String> name = new ArrayList<>();
		name.add("백인재");
		name.add("이봉현");
		name.add("이재찬");
		name.add("정택성");
		name.add("이재현");
		name.add("김정운");

		String[] name1 = new String[name.size()];
		name.toArray(name1);

		int d = r.nextInt(name1.length);
		for (int i = 0; i < name1.length; i++) {
			String temp;

			temp = name1[i];
			name1[i] = name1[d];
			name1[d] = temp;
			System.out.println(i + "/" + d);
		} // end for

		int[] score1 = { r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101),
				r.nextInt(101) };

		int total = 0;
		for (int i = r.nextInt(name1.length - 1); i < name1.length; i++) {
			System.out.print(name1[i]);
			System.out.println(score1[i]);
			total += score1[i];
		} // end for
		System.out.println("총점 : " + total + "점");

	}// Work

	public static void main(String[] args) {
		new Work();

	}// main

}// class
