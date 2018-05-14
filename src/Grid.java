
public class Grid {
	private int[][] mMesh;
	private static int tmpHeight;
	private static int tmpWidth;
	private int width, height;
	public static int blocktype;

	public Grid(int width, int height) {
		this.width = width;
		this.height = height;
		clearMesh();
		tmpHeight = 0;
		tmpWidth = 2;
		blocktype = (int) (Math.random() * 7);
	}

	private void clearMesh() {
		mMesh = new int[height][width];
		for (int i = 0; i < height; ++i) {
			for (int j = 0; j < width; ++j) {
				mMesh[i][j] = 0;
			}
		}
	}
	
	public static int getTmpWidth() {
		return tmpWidth;
	}

	public static void setTmpWidth(int x) {
		tmpWidth += x;
	}
	
	public static int getTmpHeight() {
		return tmpHeight;
	}

	public static void setTmpHeight(int x) {
		tmpHeight += x;
	}
	
	public int[][] getMesh() {
		clearMesh();
		tmpHeight++;
		if (tmpHeight >= mMesh.length) {
			tmpHeight = 0;
		}
		switch (blocktype) {
		case 0:
			mMesh[tmpHeight][tmpWidth] = 1;
			mMesh[tmpHeight][tmpWidth+1] = 1;
			mMesh[tmpHeight][tmpWidth+2] = 1;
			mMesh[tmpHeight][tmpWidth+3] = 1;
			System.out.println("0");
			break;
		case 1:
			mMesh[tmpHeight-2][tmpWidth+1] = 1;
			mMesh[tmpHeight-1][tmpWidth+1] = 1;
			mMesh[tmpHeight][tmpWidth+1] = 1;
			mMesh[tmpHeight][tmpWidth] = 1;
			System.out.println("1");
			break;
		case 2:
			mMesh[tmpHeight-2][tmpWidth] = 1;
			mMesh[tmpHeight-1][tmpWidth] = 1;
			mMesh[tmpHeight][tmpWidth] = 1;
			mMesh[tmpHeight][tmpWidth+1] = 1;
			System.out.println("2");
			break;
		case 3:
			mMesh[tmpHeight-2][tmpWidth] = 1;
			mMesh[tmpHeight-1][tmpWidth] = 1;
			mMesh[tmpHeight-1][tmpWidth+1] = 1;
			mMesh[tmpHeight][tmpWidth+1] = 1;
			System.out.println("3");
			break;
		case 4:
			mMesh[tmpHeight][tmpWidth+1] = 1;
			mMesh[tmpHeight-1][tmpWidth+1] = 1;
			mMesh[tmpHeight-1][tmpWidth] = 1;
			mMesh[tmpHeight-2][tmpWidth] = 1;
			System.out.println("4");
			break;
		case 5:
			mMesh[tmpHeight][tmpWidth] = 1;
			mMesh[tmpHeight][tmpWidth+1] = 1;
			mMesh[tmpHeight-1][tmpWidth] = 1;
			mMesh[tmpHeight-1][tmpWidth+1] = 1;
			System.out.println("5");
			break;
		case 6:
			mMesh[tmpHeight-1][tmpWidth+1] = 1;
			mMesh[tmpHeight-1][tmpWidth] = 1;
			mMesh[tmpHeight-1][tmpWidth+2] = 1;
			mMesh[tmpHeight][tmpWidth+1] = 1;
			System.out.println("6");
			break;
		}
		return mMesh;
	}
}
