//Author: Astrid Konicki
package adapter;

import importcode.Line;
import legacycode.GeometryDraw;
import legacycode.Point;

public class LineAdapter implements GeometryDraw {
    Line line;
    public LineAdapter(Line line) {
        this.line = line;
    }
    @Override
    public void draw(Point p1, Point p2) {
        line.produce(p1.x, p1.y, p2.x, p2.y);
    }
}
