package icecream.dairyqueen;// a concrete instance of ice cream

import icecream.IceCream;

public class Chocolate extends IceCream {
	public static final double COST = 1.09;

	public Chocolate() {
		description = "Rich chocolate";
	}

	public double cost() {
		return COST;
	}
}
