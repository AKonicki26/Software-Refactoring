//Author: Astrid Konicki
package adapter;

import importcode.Rectangle;
import legacycode.GeometryDraw;
import legacycode.Point;

public class RectangleAdapter implements GeometryDraw {
    Rectangle rectangle;
    public RectangleAdapter(Rectangle line) {
        this.rectangle = line;
    }
    @Override
    public void draw(Point p1, Point p2) {
        rectangle.plot(p1.x, p1.y, p2.x - p1.x, p2.y - p1.y);
    }
}

