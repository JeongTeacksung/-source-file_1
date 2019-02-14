package day1206;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ����<br>
 * 1. �Ʒ��� �����͸� ó���ϴ� ���α׷��� �ۼ��ϼ���. ������,�̺���,������,���ü�,������,������ �� �����Ͱ� �����ϰ�, ������ 0~100��
 * ���̷� �߻��Ҽ��ֽ��ϴ�.
 * 
 * ���α׷��� ����Ǹ� ���� ����߿� 2���̻� ����ó�� ����� �̰� n���� �̸��� ������ �����Ͽ� ����ϴ� ���� �ϴ� ���α׷� �ۼ�.
 * �ߺ��̸��� �� �� ����.
 * 
 * ��� �� ) ������ 89 ���ü� 77 ������ 90 ���� xx��
 * 
 * @author Owner
 */
public class Work {

	public Work() {
		Random r = new Random();
		List<String> name = new ArrayList<>();
		name.add("������");
		name.add("�̺���");
		name.add("������");
		name.add("���ü�");
		name.add("������");
		name.add("������");

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
		System.out.println("���� : " + total + "��");

	}// Work

	public static void main(String[] args) {
		new Work();

	}// main

}// class
