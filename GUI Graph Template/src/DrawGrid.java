import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class DrawGrid extends JComponent {
	//Code for graphics taken from https://www.youtube.com/watch?v=W772v8WHEL8
	private Grid grid;
	private Cell startCell;
	private Cell endCell;
	
	public DrawGrid(Grid grid)
	{
		this.grid = grid;
		this.startCell = grid.getStartCell();
		this.endCell = grid.getEndCell();
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 =  (Graphics2D) g;
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(2));
		
		int cellWidth = grid.getCellWidth();
		int cellHeight = grid.getCellHeight();
		
		//Draw grid
		for (int i = 0; i < grid.getGridWidth(); i++)
		{
			for (int j = 0; j < grid.getGridHeight(); j++)
			{
				Cell cell = grid.getCell(i, j);

				Rectangle rect = new Rectangle(i * cellWidth, j * cellHeight, cellWidth, cellHeight);
				
				//Check to see if it is a start or end cell
				if (cell.equals(startCell) || cell.equals(endCell))
				{
					g2.setColor(Color.GREEN);
					g2.fill(rect);
					g2.setColor(Color.BLACK);
				}
				
				//Check if the cell is a wall or not
				if (cell.getCanCollide() == false)
				{
					g2.draw(rect);
				}
				else
				{
					g2.fill(rect);
				}
			}
		}
	}
	
}

//Lines
		//Point2D.Double p1 = new Point2D.Double(200, 200);
		//Point2D.Double p2 = new Point2D.Double(300, 200);
		//Line2D.Double l1 = new Line2D.Double(p1, p2);
