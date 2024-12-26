

import javax.swing.*;

public class ArrayKey {
	
	public ArrayKey() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setFocusable(true);
		
		JPanel panel = new JPanel();
		JLabel up = new JLabel();
		JLabel down = new JLabel();
		JLabel right = new JLabel();
		JLabel left = new JLabel();
		
		panel.add(up);
		panel.add(down);
		panel.add(right);
		panel.add(left);
		
		up.setText("up: 0");
		down.setText("down: 0");
		right.setText("right: 0");
		left.setText("left: 0");
		
		frame.add(panel);
		
	}
	
	
	public static void main(String[] args) {
		new ArrayKey();
	}

}
