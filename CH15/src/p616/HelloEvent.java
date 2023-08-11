package p616;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloEvent extends JFrame{
	
	HelloEvent() {
		super.setTitle("이벤트 맛보기");
		
		//이벤트 리스너 구현객체 생성
		ActionListener actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했스빈다");
				
			}
		};
		JButton b = new JButton("클릭해봐라");
		super.add(b);
		b.addActionListener(actionListener);
		super.setSize(260,100);
		super.setVisible(true);
	}
	
	
}
