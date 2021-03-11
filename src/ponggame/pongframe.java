package ponggame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class pongframe extends JFrame{
	pongpanel panel;
	pongframe() {
		panel = new pongpanel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
