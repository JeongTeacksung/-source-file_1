package day1207;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map : KVP�� �Ǿ��ִ� �ڷᱸ��, Ű�� ����Ͽ� ���� ��� ��
 * @author Owner
 */
public class UseMap {
	public UseMap(){
		//JDK�� 1.5������ ��� Generic�� ����� �� ����, ��ü�� ���尡��
		//1. ����
		Map<String,String> map=new HashMap<String,String>();
		//2. �� �Ҵ� - Ű�� ����, ���� �ߺ�����, �ԷµǴ� ������� ���� �߰����� �ʴ´�
		map.put("Oracle", "��뷮 �����ͺ��̽�");
		map.put("Java","���α׷��� ���");
		map.put("Python", "���α׷��� ���");// ���� �ߺ� ����
		map.put("Java", "�Ϻ��� ��ü���� ���");// Ű�� �����Ѵٸ� �ش� Ű�� ���� ����
		map.put("HTML", "Markup Languae");// Ű�� �����Ѵٸ� �ش� Ű�� ���� ����
		System.out.println(map.size()+" "+map);
		//3. �� ���) Ű�� ����Ͽ� ���� ��´�
		// Ű�� �ش��ϴ� ���� ���ٸ� null�� ��ȯ
		String val = map.get("HTML");
		System.out.println(val);
		System.out.println(map.get("Java"));
		//4. Ű�� �����ϴ���?
		String key="Java1";
		boolean flag=map.containsKey("Java");
		System.out.println(key+"�� ���� "+flag);
		
		//5. �� ����
		map.remove("Java");
		System.out.println("���� �� : "+map);
		
		//6. ��� Ű ���
		Set<String> allKeys=map.keySet();
		System.out.println("���� ���� ��� Ű : "+allKeys);
		
		//7. ��� �� ���
		Iterator<String> ita=allKeys.iterator();
		String value="";
		while(ita.hasNext()) {//Ű�� �����Ѵٸ�
			value=map.get(ita.next());; // ��ʳ� Ű�� ������ map�� ���� ��´�
			System.out.println(value);
		}//end while
		
		//8.����
		map.clear();
		System.out.println("��� ���� : "+map.size()+" / "+map);
	}//UseMap
	
	/**
	 * �⺻�����ڸ� ����ϸ� 11���� ���� �ڵ�����
	 * MultiThread���� �������� �Ұ���
	 * �����Ͱ� ��ü �� ������ �� 75% ä������ ��
	 * ���� ���� �˻��� �Ѵ�
	 */
	public void useHashtable(String key) {
		key=key.toUpperCase();
		
		//1. ����)
		Map<String,String> bloodMap = new Hashtable<String, String>();
		//2. �� �Ҵ�)
		bloodMap.put("A", "�ҽ��ϴ�. �Ѣ�");
		bloodMap.put("B", "�����巴�� ��,.��");
		bloodMap.put("AB", "������ @,.@");
		bloodMap.put("O", "�����δ��ϴ� ~(^^~)(~^^)~");
		bloodMap.put("A", "�����ϴ�, ģ���ϴ�. ^o^b");
		
		String value=bloodMap.get(key);
//		if(value==null) { //����� ���� ������ ��
		if(!bloodMap.containsKey(key)) {//Ű�� �����ϴ���?
			System.out.println(key+"���� ����� ���� �ƴմϴ�.");
		}else {
			System.out.println(key+"���� Ư¡�� : "+value);
		}//end if
		
		
		
	}//useHashtable
	
	/**
	 * �⺻�����ڸ� ����ϸ� 16���� ���� �ڵ�����
	 * MultiThread���� �������� ����
	 * �����Ͱ� ��ü �� ������ �� 75% ä������ ��
	 * ���� ���� �˻��� �Ѵ�
	 */
	public void useHashMap(String key) {
		//1. ����)
		Map<String, String> map=new HashMap<>();
		//2. �� �Ҵ�)
		map.put("���ʺ���", "Ǯ�� ���� ������ ���´�");
		map.put("��������", "������ ���忡�� �����Ѵ�");
		map.put("���乫��", "�ƹ��͵� ���� ������ �� �ݷ��ϰ� �ƹ��͵� ���� �ʰڴ�");
		map.put("���γ���", "�����ϸ� �θǽ� �ϰ��ϸ� �ҷ�");
		map.put("�̺θ�õ", "������ ��ȥ�ϸ� ��õ���� ���ϸ� ��õ����");
		map.put("��������", "���� ���� �����");
		map.put("����ġ��", "�Լ��� ������ ¡�׷�����");
		map.put("���ü���", "���α��� �ڶ�");
		
		//3. �� ���
		if(map.containsKey(key)) {//�ʿ� Ű�� �����Ѵٸ�
			String value=map.get(key); //�� ���
			System.out.println(key+" : "+value);
		}else {
			System.out.println(key+" ���ڼ���� �غ���� �ʾҽ��ϴ�.");
		}//end if
		
		
		
	}//useHashMap
	
	public static void main(String[] args) {
		UseMap um = new UseMap();
		System.out.println("-------------Hashtable���---------------");
		um.useHashtable("a");
		System.out.println("-------------HashMap���---------------");
		um.useHashMap("���γ���");
		
	}//main

}//class