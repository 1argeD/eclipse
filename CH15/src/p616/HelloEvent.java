package p616;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloEvent extends JFrame{
	
	HelloEvent() {
		super.setTitle("�̺�Ʈ ������");
		
		//�̺�Ʈ ������ ������ü ����
		ActionListener actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� Ŭ���߽����");
				
			}
		};
		JButton b = new JButton("Ŭ���غ���");
		super.add(b);
		b.addActionListener(actionListener);
		super.setSize(260,100);
		super.setVisible(true);
	}
	
	
}
