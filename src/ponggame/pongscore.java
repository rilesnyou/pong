package ponggame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class pongscore extends Rectangle{
	static int GAME_WIDTH;
	static int GAME_HEIGHT;
	int player1;
	int player2;
	
	pongscore(int GAME_WIDTH, int GAME_HEIGHT){
		pongscore.GAME_WIDTH = GAME_WIDTH;
		pongscore.GAME_HEIGHT = GAME_HEIGHT;
	}
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("customFont.ttf", Font.PLAIN, 60));
		g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
		g.drawString(String.valueOf(player1), (GAME_WIDTH/2)-85, 50);
		g.drawString(String.valueOf(player2), (GAME_WIDTH/2)+20, 50);
	}
}
