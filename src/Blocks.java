import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

//Contains basic methods of blocks
public abstract class Blocks {

	// Fields:
	public static int xCoord;
	public static int yCoord;
	private int choose;
	public static final int blockWidth = 20;

	// Constructors:
	public Blocks(int x, int y) // starting in the middle of the screen
	{
//		xCoord = x;
//		yCoord = y;
	}

	// Abstract methods:
	public abstract void shape(Graphics g);

	public abstract void turn(Graphics g);

	public abstract int getBlockLong();

	// Non-abstract methods
	public static int getX() {
		return xCoord;
	}

	public static int getY() {
		return yCoord;
	}

	public void setX(int x) {
		xCoord = x;
	}

	public void setY(int y) {
		yCoord = y;
	}

	public static Blocks chooseBlock() {
		return new IBlock(0, 150);
//		int choose = (int) (Math.random() * 7);
//		switch (choose) {
//		case 1: // IBlock
//			IBlock i = new IBlock(xCoord, yCoord);
//			return i;
//		case 2:
//			// JBlock
//			JBlock j = new JBlock(xCoord, yCoord);
//			return j;
//		case 3:
//			// LBlock
//			LBlock l = new LBlock(xCoord, yCoord);
//			return l;
//		case 4:
//			// SBlock
//			SBlock s = new SBlock(xCoord, yCoord);
//			return s;
//		case 5:
//			// ReverseSBlock
//			ReverseSBlock Rs = new ReverseSBlock(xCoord, yCoord);
//			return Rs;
//		case 6:
//			// SquareBlock
//			SquareBlock sq = new SquareBlock(xCoord, yCoord);
//			return sq;
//		case 7:
//			// TBlock
//			TBlock t = new TBlock(xCoord, yCoord);
//			return t;
//		}
//		return null;
	}
	

	
}
