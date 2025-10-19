import java.util.List;

public class DrawEngine {
	
	private Point p1 = new Point(3, 5);
	private Point p2 = new Point(7, 9);

	public void startDrawing(List<GeometryDraw> shapes) {
		
		for (GeometryDraw shape : shapes) {
			shape.draw(p1, p2);
		}
	}

}
