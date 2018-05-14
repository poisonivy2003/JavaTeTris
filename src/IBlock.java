import java.awt.Graphics;

public class IBlock extends Blocks {
	private int currentSide;
	private int blockLong;

	public IBlock(int x, int y) {
		super(x, y);
		currentSide = 0; // 0 is flat, 1 is straight
	}

	public void shape(Graphics g) {
		if (currentSide == 0) {
			int add = 0;
			for (int i = 0; i < 4; i++) {
				g.drawRect(xCoord + add, yCoord, blockWidth, blockWidth);
				add += blockWidth;
			}
		} else {
			int add = 0;
			for (int i = 0; i < 4; i++) {
				g.drawRect(xCoord, yCoord + add, blockWidth, blockWidth);
				add += blockWidth;
			}
		}
	}

	public void turn(Graphics g) {
		if (currentSide == 0) {
			currentSide = 1;
			shape(g);
		} else {
			currentSide = 0;
			shape(g);
		}
	}

	public int getBlockLong() {
		if (currentSide == 1 | currentSide == 3) {
			blockLong = 2;
		} else {
			blockLong = 3;
		}
		return blockLong;
	}
}
