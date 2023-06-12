/**
 * Ch6Program2
 * Sample code for 2D usage
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-03-29
 */

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Ch6Program2 extends JFrame {

	// class constants
	private static final int FRAME_SIZE = 1000;
	private static final int NUM_SQUARES = 10;
	private static final int SQUARE_SIZE = FRAME_SIZE / NUM_SQUARES;

	// private instance variables
	private Point[][] graphPoints;

	public static void main(String[] args) {

		Ch6Program2 gp = new Ch6Program2();
	}

	public Ch6Program2() {

		super("2D array is basic for all program");
		setSize(FRAME_SIZE, FRAME_SIZE);
		setVisible(true);
		graphPoints = new Point[NUM_SQUARES + 1][NUM_SQUARES + 1];

		for (int r = 0; r < graphPoints.length; r++)
			for (int c = 0; c < graphPoints[r].length; c++)
				graphPoints[r][c] = new Point(c * SQUARE_SIZE, r * SQUARE_SIZE);
	}

	public void paint(Graphics g) {

		// Put in code to draw line segments between all adjacent Points
		// in array graphPoints

		// Draw the lines!
		for (int r = 0; r < graphPoints.length; r++)
			for (int c = 0; c < graphPoints[r].length - 1; c++) {
				Point p = graphPoints[r][c];
				Point q = graphPoints[r][c + 1];
				g.drawLine(p.x, p.y, q.x, q.y);
			}
		for (int c = 0; c < graphPoints.length; c++)
			for (int r = 0; r < graphPoints[c].length - 1; r++) {
				Point p = graphPoints[r][c];
				Point q = graphPoints[r + 1][c];
				g.drawLine(p.x, p.y, q.x, q.y);
			}

	}
}
