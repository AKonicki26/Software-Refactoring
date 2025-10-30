package icecream;

import icecream.dairyqueen.Chocolate;
import icecream.dairyqueen.Strawberry;
import icecream.dairyqueen.Vanilla;

/**
 * A factory that makes ice cream.
 */

public class IceCreamFactory {

	public IceCream getIceCream(String type) {
		IceCream cone = null;

		if (type.equals("Chocolate"))
			cone = new Chocolate();
		else if (type.equals("Strawberry"))
			cone = new Strawberry();
		else if (type.equals("Vanilla"))
			cone = new Vanilla();

		return cone;
	}

}
