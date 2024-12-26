package ArrowKeys;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class ArrowKeys {

	public ArrowKeys() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setFocusable(true);
		frame.setTitle("First Gui code war");

		JPanel panel = new JPanel();
		JLabel up = new JLabel();
		JLabel down = new JLabel();
		JLabel left = new JLabel();
		JLabel right = new JLabel();
		JLabel backspace = new JLabel();
		JLabel spacebar = new JLabel();
		JLabel H = new JLabel();
		JLabel N = new JLabel();
		JLabel I = new JLabel();
		
		
		

		panel.add(up);
		panel.add(down);
		panel.add(right);
		panel.add(left);
		panel.add(backspace);
		panel.add(spacebar);
		panel.add(I);
		panel.add(H);
		panel.add(N);
		
		
		
		up.setText("Up: 0");
		down.setText("Down: 0");
		right.setText("Right: 0");
		left.setText("Left: 0");
		spacebar.setText("Space: ");
		
		frame.addKeyListener(new KeyListener() {
			
			int upCount = 1;
			int downCount = 1;
			int leftCount = 1;
			int rightCount = 1;
			int spacebarCount =0;
			
			
			

			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
		        if (keyChar == 'H' || keyChar == 'h') {
		            H.setText("Hi! Hello\n");
		        } else if (keyChar == 'N' || keyChar == 'n') {
		            N.setText("नमस्ते! (Namaste) Have a good day\n");
		        } else if (keyChar == 'I' || keyChar == 'i') {
		        	I.setText("నమస్కారం! @Eswar Dino\n");
		       
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				case KeyEvent.VK_UP:
					up.setText("Up: "+ Integer.toString(upCount++));
					break;
				case KeyEvent.VK_DOWN:
					down.setText("Down: "+ Integer.toString(downCount++));
					break;
				case KeyEvent.VK_LEFT:
					left.setText("Left: "+ Integer.toString(leftCount++));
					break;
				case KeyEvent.VK_RIGHT:
					right.setText("Right: "+ Integer.toString(rightCount++));
					break;
				case KeyEvent.VK_SPACE:
					spacebar.setText("Space: "+ Integer.toString(spacebarCount++));
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
		            backspace.setText(" BackSpace error " );
		            
				}
				
			}
			
		});
		

		
		
		frame.add(panel);
	}

	public static void main(String[] args) {
		new ArrowKeys();
	}

}