public class Grid {
	
	private Cell[][] grid;
	private int gridWidth;
	private int gridHeight;
	private int cellWidth;
	private int cellHeight;
	
	private Cell startCell;
	private Cell endCell;
	/*private int startCellX;
	private int startCellY;
	private int endCellX;
	private int endCellY;*/
	
	public Grid(int windowWidth, int windowHeight, int cellWidth, int cellHeight)
	{
		this.cellWidth = cellWidth;
		this.cellHeight = cellHeight;
		
		//The -1 and -2 are for an enhanced visual view
		this.gridWidth = (int) (windowWidth / cellWidth) - 1;
		this.gridHeight = (int) (windowHeight / cellHeight) - 2;
		
		this.grid = new Cell[gridWidth][gridHeight];
		//this.grid = new Cell[(gridWidth / cellWidth) - 1][(gridHeight / cellHeight) - 1];
		
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[i].length; j++)
			{
				grid[i][j] = new Cell(cellWidth, cellHeight, false);
				
			}
		}
	}
	
	public Cell getCell(int x, int y)
	{
		return grid[x][y];
	}
	
	public int getCellWidth()
	{
		return cellWidth;
	}
	
	public int getCellHeight()
	{
		return cellHeight;
	}
	
	public int getGridWidth()
	{
		return gridWidth;
	}
	
	public int getGridHeight()
	{
		return gridHeight;
	}
	
	public void fillCell(int x, int y)
	{
		grid[x][y].setCanCollide(true);
	}
	
	public void setStartCell(int x, int y)
	{
		this.startCell = grid[x][y];
	}
	
	public void setEndCell(int x, int y)
	{
		this.endCell = grid[x][y];
	}
	
	public Cell getStartCell()
	{
		return startCell;
	}
	
	public Cell getEndCell()
	{
		return endCell;
	}
}