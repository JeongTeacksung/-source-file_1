package day1123;

/**
 * ����� ��ȣ�������� ������ ��
 * @author Owner
 */
public class UseWork7 {
	
	public static void main(String[] args) {
		Work7 sinlamen = new Work7(10,7);
		sinlamen.setName("�Ŷ��");
//		sinlamen.setPreferencePoint(10);
//		sinlamen.setSpicyStrength(7);
		
		System.out.println(sinlamen.act());
		System.out.println(sinlamen.act("���ְ�"));
		
		System.out.println("-----------------------");
		
		Work7 nugulee = new Work7();
		nugulee.setName("�ʱ���");
//		nugulee.setPreferencePoint(2);
//		nugulee.setSpicyStrength(1);
		
		System.out.println(nugulee.act("�׳�����"));
	}

}
