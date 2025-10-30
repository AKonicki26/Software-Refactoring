package icecream.benandjerrys;

import icecream.IceCream;

public class ChunkyMonkey extends IceCream {
	private static final double COST = 2.25;

	public ChunkyMonkey() {
		description = "Banana Ice Cream with Fudge Chunks & Walnuts";
	}

	public double cost() {

		return COST;
	}

}
