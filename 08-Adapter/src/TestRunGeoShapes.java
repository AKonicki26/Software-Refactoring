//Author: Original file by Murat Gungor, modified by Astrid Konicki
//
// Certification of Authenticity :
//I certify that this is entirely my own work, except where I have given fully documented
// references to the work of others.I understand the definition and
// consequences of plagiarism and acknowledge that the assessor of this assignment
// may, for the purpose of assessing this assignment :
// -Reproduce this assignment and provide a copy to another member of
// academic staff; and / or
// - Communicate a copy of this assignment to a plagiarism checking service
// (which may then retain a copy of this assignment on its database for
// the purpose of future plagiarism checking)


import java.util.ArrayList;
import java.util.List;

import adapter.LineAdapter;
import adapter.RectangleAdapter;
import importcode.*;
import legacycode.*;

public class TestRunGeoShapes {

	public static void main(String[] args) {
		List<GeometryDraw> shapes = new ArrayList<>();
		shapes.add(new GeoSquare());
		shapes.add(new GeoCircle());

        shapes.add(new LineAdapter(new Line()));
        shapes.add(new RectangleAdapter(new Rectangle()));

	
		DrawEngine drawEngine = new DrawEngine();
		drawEngine.startDrawing(shapes);
	}
}
