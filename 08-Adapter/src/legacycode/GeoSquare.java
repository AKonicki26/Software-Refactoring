//Author: Murat Gungor
package legacycode;
public class GeoSquare implements GeometryDraw {
	@Override
	public void draw(Point p1, Point p2) {
		System.out.println("Square::draw()" + p1.toString() + p2.toString());
	}
}
