import java.awt.Color;

import javax.swing.JFrame;

public class GraphicWindow {
	
	private static final int windowWidth = 800;
	private static final int windowHeight = 600;
	
	private static final int cellWidth = 20;
	private static final int cellHeight = 20;
	
	private static int startX = 0;
	private static int startY = 0;
	
	private static int endX;
	private static int endY;
	
	public static void main(String[] args)
	{
		JFrame window = new JFrame();
		//The -3 is for an enhanced visual effect due to a slight offset while drawing the grid
		window.setSize(windowWidth - 3, windowHeight);
		window.setTitle("Game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setBackground(Color.gray);
		
		Grid grid = new Grid(windowWidth, windowHeight, cellWidth, cellHeight);
		grid.setStartCell(startX, startY);
		grid.setEndCell(grid.getGridWidth() - 1, grid.getGridHeight() - 1);
		
		DrawGrid dg = new DrawGrid(grid);
		
		window.add(dg);
		window.revalidate();
		
	}
}
