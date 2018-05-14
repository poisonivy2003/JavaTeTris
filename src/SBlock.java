import java.awt.Color;
import java.awt.Graphics;

public class SBlock extends Blocks {
	private int currentSide;
	private int blockLong;

	public SBlock(int x, int y) {
		super(x, y);
		currentSide = 0; // 0 is flat, 1 is straight
	}

	public void shape(Graphics g) {
		if (currentSide == 0) {
			int add = 0;
			for (int i = 0; i < 2; i++) {
				g.setColor(Color.GREEN);
				g.fillRect(xCoord, yCoord + add, blockWidth, blockWidth);
				g.setColor(Color.BLACK);
				g.drawRect(xCoord, yCoord + add, blockWidth, blockWidth);
				add += blockWidth;
			}
			add = 1;
			for (int i = 0; i < 2; i++) {
				g.setColor(Color.GREEN);
				g.fillRect(xCoord + blockWidth, yCoord + add, blockWidth, blockWidth);
				g.setColor(Color.BLACK);
				g.drawRect(xCoord + blockWidth, yCoord + add, blockWidth, blockWidth);
				add += blockWidth;
			}
		} else if (currentSide == 1) {
			int add = 0;
			for (int i = 0; i < 2; i++) {
				g.setColor(Color.GREEN);
				g.fillRect(xCoord + add, yCoord + blockWidth, blockWidth, blockWidth);
				g.setColor(Color.BLACK);
				g.drawRect(xCoord + add, yCoord + blockWidth, blockWidth, blockWidth);
				add += blockWidth;
			}
			add = 1;
			for (int i = 0; i < 2; i++) {
				g.setColor(Color.GREEN);
				g.fillRect(xCoord + add, yCoord, blockWidth, blockWidth);
				g.setColor(Color.BLACK);
				g.drawRect(xCoord + add, yCoord, blockWidth, blockWidth);
				add += blockWidth;
			}
		}
	}

	public void turn(Graphics g) {
		if (currentSide == 0) {
			currentSide = 1;
			shape(g);
		} else if (currentSide == 1) {
			currentSide = 0;
			shape(g);
		}
	}

	public int getBlockLong() {
		if (currentSide == 1 || currentSide == 3) {
			blockLong = 2;
		} else {
			blockLong = 3;
		}
		return blockLong;
	}
}