package day1119;

/**
 * ���� <br>
 * 1. ����� �ð��� �Է¹޾� �Ʒ��� �������� ����ϼ���.  <br>
 *  ��� :  ����� �ð��� �ִ� 2�ð��� ������ ������ 60���� �Ѵ� �ٸ� "��Ÿ�"<br>
 *	 60�� ���϶�� "�ܰŸ�"�� ����ϼ���.<br>
 * 
 * 2. �̸�, ������ܰ� ����� �Ÿ��� �Է¹޾� �Ʒ��� ���� ����ϼ���.<br>
 *  ��������� "����,����ö,�ý�,����"�� �����Ѵ�.<br>
 * ������� 1200��, ����ö ��� 1250��, �ýÿ�� 3800�� �Դϴ�.<br>
 *  ����� 10Ű�� ������ �⺻���, �� 5Ű�� �ʰ��� ���� 100���� ���� �մϴ�.<br>
 *
 * ���   :  xxx�� ����� ��������� xx�̸� �Ÿ��� xx Ű�� �Դϴ�.<br>
 *            �� �̿� ��� xx���̰�, �պ��̿� ��� xx���̸�, �Ѵ� 20�ϱ���<br>
 *            ������ ��: xxxx�� �Դϴ�.  <br>
 *
 * @author Owner
 */
public class Work3 {

	public static void main(String[] args) {
		//1������ ��
		int tmin = Integer.parseInt(args[0]);
		
		if (tmin<60) {
			System.out.println("�ܰŸ�");
		}else if (tmin<=120) {
			System.out.println("��Ÿ�");
		}else {
			System.out.println("����� ����");
		}//end else
		
		
		//2������ ��
		int distance = Integer.parseInt(args[3]);
		int price = 0;
		
		if (args[2].equals("����")) {
			 price = 1200;
		}else if (args[2].equals("����ö")) {
			 price = 1250;
		}else if (args[2].equals("�ý�")) {
			 price = 3800;
		}else {
			price=0;
		}
		int distance_price = 0;
		if (distance<=10) {
			 distance_price = 0;
		}else if (distance>10) {
			 distance_price = ((distance-10)/5)*100;
		}
		System.out.println(args[1]+"�� ����� ���������"+args[2]+"�̸� �Ÿ��� "+
					args[3]+"Ű�� �Դϴ�. �� �̿��� "+(price+distance_price)+
					"���̰�, �պ��̿� ��� "+((price+distance_price)*2)+
					"���̸�, �Ѵ� 20�ϱ��� ������ �� : "+(((price+distance_price)*2)*20)+
					"�� �Դϴ�.");
	}//main
}//class
