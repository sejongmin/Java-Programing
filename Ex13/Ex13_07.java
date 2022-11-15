package Ex13;

import java.awt.*;
import javax.swing.*;

public class Ex13_07 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 연습 1");
			
			Container c = this.getContentPane();
			c.setBackground(Color.YELLOW);
			
			this.setLayout(new FlowLayout());
			
			JButton btn1 = new JButton("버튼 1");
			btn1.setBackground(Color.BLACK);
			btn1.setForeground(Color.MAGENTA);
			this.add(btn1);
			
			JButton btn2 = new JButton("버튼 2");
			btn2.setFont(new Font("맑은고딕", Font.BOLD, 30));
			btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));
			btn2.setToolTipText("이 버튼은 크게 보여요~~");
			this.add(btn2);
			
			JButton btn3 = new JButton("버튼 3");
			btn3.setEnabled(false);
			this.add(btn3);
			
			setSize(256, 256);
			setVisible(true); 
		}
	}
	public static void main(String[] args) {
		new MyGUI();

	}

}
