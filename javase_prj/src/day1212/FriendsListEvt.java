package day1212;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Design class�� Has a ����� ������ �̺�Ʈ ó�� Ŭ����
 * @author Owner
 */
public class FriendsListEvt extends WindowAdapter implements ActionListener, ItemListener {

	//�̺�Ʈ�� ó���ϱ����� ���Ǵ� ��� ������Ʈ�� has a ������
	//��ü�� ����Ͽ� ó���Ѵ�.
	private FriendsList fl;
	
	public FriendsListEvt(FriendsList fl) {
		this.fl=fl;
	}//FriendsListEvt
	
	@Override
	public void windowClosing(WindowEvent e) {
		fl.dispose();
	}//windowClosing
	
	@Override
	//List �̺�Ʈó��
	public void itemStateChanged(ItemEvent ie) {
		
		//ģ�� ����Ʈ���� Ŭ���Ǹ� �ش� �������� ���ܵ� ģ���� ������.
		if (ie.getSource()==fl.getListFriend()) {
			blockFriend();
		}
		//���ܵ� ģ�� ����Ʈ���� Ŭ���� �ش� �������� ģ������Ʈ�� ������.
		if (ie.getSource()==fl.getListBlockFriend()) {
			unblockFriend();
		}
	}//itemStateChanged

	@Override
	//Button �̺�Ʈó��
	public void actionPerformed(ActionEvent ae) {
		// >> : ��� ģ���� ���ܸ������ �̵�
		if (ae.getSource()==fl.getBtnAllBlock()) {
			allBlock();
		}//end if
		// << : ���ܵ� ��� ģ���� ģ��������� �̵�
		if (ae.getSource()==fl.getBtnAllUnblock()) {
			allUnBlock();
		}//end if

	}//actionPerformed

	/**
	 * ����Ʈ���� ������ ģ���� ���� ����Ʈ�� �̵�
	 */
	private void blockFriend() {
		List tempFriend = fl.getListFriend();
		//������ ģ���� ���ͼ�
		String name = tempFriend.getSelectedItem();
		//�������� ������
		fl.getListBlockFriend().add(name);
		//������ ģ���� ����
		tempFriend.remove(name);
	}//blockFriend
	
	/**
	 * ������ ģ������Ʈ���� ������ ģ���� ģ������Ʈ�� �̵�
	 */
	private void unblockFriend() {
//		List tempFriend = fl.getListBlockFriend();
//		//������ ģ���� ���ͼ�
//		String name = tempFriend.getSelectedItem();
//		//�������� ������
//		fl.getListFriend().add(name);
//		//������ ģ���� ����
//		tempFriend.remove(name);

		//���ܵ� ģ������Ʈ���� �������̸��� �޾ƿͼ�
		List tempList=fl.getListBlockFriend();
		int selectedIndex=tempList.getSelectedIndex();
		//ģ�� ����Ʈ�� �߰��ϰ�
		fl.getListFriend().add(tempList.getItem(selectedIndex));
		//���ܵ� ģ������Ʈ���� �����Ѵ�.
		tempList.remove(selectedIndex);
		
		
	}//unblockFriend
	
	/**
	 * &gt;&gt; ��ư�� Ŭ���ϸ� ��� ģ������
	 */
	private void allBlock() {
		// ģ�� ����Ʈ�� ��� �������� �޾ƿͼ�
		String[] arrFriend=fl.getListFriend().getItems();
		
		// ���� ����Ʈ�� ������.
		for(int i=0; i<arrFriend.length; i++) {
			fl.getListBlockFriend().add(arrFriend[i]);
		}//end for
		//ģ������Ʈ�� ��� �������� ����
		fl.getListFriend().removeAll();
		
	}//allblock
	
	/**
	 * &lt;&lt; ��ư�� Ŭ���ϸ� ���ܵ� ��� ģ���� ģ������Ʈ�� �̵�
	 */
	private void allUnBlock() {
		//���ܵ� ��� ģ������� �޾ƿͼ�
		String[] arrBlockList=fl.getListBlockFriend().getItems();
		//ģ����Ͽ� �߰��ϰ�
		for(String name : arrBlockList) {
			fl.getListFriend().add(name);
		}//end for
		//���ܵ� ��� ģ������� ����
		fl.getListBlockFriend().removeAll();
	}//allUnblock
	
}//class