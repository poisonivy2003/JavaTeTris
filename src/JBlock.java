import java.awt.Color;
import java.awt.Graphics;

public class JBlock extends Blocks{
	private int currentSide;
	private int blockLong;
	
	public JBlock(int x, int y) {
		super(x, y);
		currentSide = 0; // 0 is j, 1 is 90 clockwise turn, and so on till 3 then back to 0
	}

	public void shape(Graphics g) {
		if (currentSide == 0) //j-shape
		{
			int addDown = 0, addAcross = blockWidth;
			for (int i = 0; i < 3; i++)
			{	
				g.setColor(Color.BLUE);
				g.fillRect(xCoord, yCoord + addDown, blockWidth, blockWidth);
				g.setColor(Color.BLACK);
				g.drawRect(xCoord, yCoord + addDown, blockWidth, blockWidth);
				addDown += blockWidth;
			}
			g.setColor(Color.BLUE);
			g.fillRect(xCoord - addAcross, yCoord + (addDown - blockWidth), blockWidth, blockWidth);
			g.setColor(Color.BLACK);
			g.drawRect(xCoord - addAcross, yCoord + (addDown - blockWidth), blockWidth, blockWidth);
		}
		else if (currentSide == 1)
		{
			int addDown = 0, addAcross = blockWidth;
			for (int i = 0; i < 2; i++)
			{
				g.setColor(Color.BLUE);
				g.fillRect(xCoord, yCoord + addDown, blockWidth, blockWidth);
				g.setColor(Color.BLACK);
				g.drawRect(xCoord, yCoord + addDown, blockWidth, blockWidth);
				addDown += blockWidth;
			}
			for (int i = 0; i < 2; i++)
			{
				g.setColor(Color.BLUE);
				g.fillRect(xCoord + addAcross, yCoord + (addDown - blockWidth), blockWidth, blockWidth);
				g.setColor(Color.BLACK);
				g.drawRect(xCoord + addAcross, yCoord + (addDown - blockWidth), blockWidth, blockWidth);
				addAcross += blockWidth;
			}
		}
		else if (currentSide == 2)
		{
			int addDown = 0, addAcross = blockWidth;
			for (int i = 0; i < 3; i++)
			{	
				g.setColor(Color.BLUE);
				g.fillRect(xCoord, yCoord + addDown, blockWidth, blockWidth);
				g.setColor(Color.BLACK);
				g.drawRect(xCoord, yCoord + addDown, blockWidth, blockWidth);
				addDown += blockWidth;
			}
			g.setColor(Color.BLUE);
			g.fillRect(xCoord + addAcross, yCoord, blockWidth, blockWidth);
			g.setColor(Color.BLACK);
			g.drawRect(xCoord + addAcross, yCoord, blockWidth, blockWidth);
		}
		else
		{
			int addDown = 0, addAcross = blockWidth;
			for (int i = 0; i < 2; i++)
			{
				g.setColor(Color.BLUE);
				g.fillRect(xCoord, yCoord + addDown, blockWidth, blockWidth);
				g.setColor(Color.BLACK);
				g.drawRect(xCoord, yCoord + addDown, blockWidth, blockWidth);
				addDown += blockWidth;
			}
			for (int i = 0; i < 2; i++)
			{
				g.setColor(Color.BLUE);
				g.fillRect(xCoord - addAcross, yCoord, blockWidth, blockWidth);
				g.setColor(Color.BLACK);
				g.drawRect(xCoord - addAcross, yCoord, blockWidth, blockWidth);
				addAcross += blockWidth;
			}
		}
	}

	public void turn(Graphics g) {
		if (currentSide == 0)
		{
			currentSide = 1;
			shape(g);
		}
		else if (currentSide == 1)
		{
			currentSide = 2;
			shape(g);
		}
		else if (currentSide == 2)
		{
			currentSide = 3;
			shape(g);
		}
		else
		{
			currentSide = 0;
			shape(g);
		}
	}

	public int getBlockLong() {
		if (currentSide == 1 || currentSide == 3)
		{
			blockLong = 2;
		}
		else 
		{
			blockLong = 3;
		}
		return blockLong;
	}

}
