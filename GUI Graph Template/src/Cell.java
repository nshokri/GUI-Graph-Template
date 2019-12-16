public class Cell {
	
	private int width;
	private int height;
	private boolean canCollide;
	
	public Cell(int width, int height, boolean canCollide)
	{
		this.width = width;
		this.height = height;
		this.canCollide = canCollide;
	}
	
	public boolean getCanCollide()
	{
		return canCollide;
	}
	
	public void setCanCollide(boolean collision)
	{
		canCollide = collision;
	}
	
	/*public int getCellWidth()
	{
		return width;
	}
	
	public int getCellHeight()
	{
		return height;
	}*/
}