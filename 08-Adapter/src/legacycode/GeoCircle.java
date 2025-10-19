
public class GeoCircle implements GeometryDraw {
	@Override
	public void draw(Point p1, Point p2) {
		System.out.println("Circle::draw()" + p1.toString() + p2.toString());
	}
}
