
import java.util.ArrayList;
import java.util.List;

public class TestRunGeoShapes {

	public static void main(String[] args) {
		List<GeometryDraw> shapes = new ArrayList<>();
		shapes.add(new GeoSquare());
		shapes.add(new GeoCircle());
	
		DrawEngine drawEngine = new DrawEngine();
		drawEngine.startDrawing(shapes);
	}
}
