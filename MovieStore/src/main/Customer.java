package main;

import main.statement.HTMLStatement;
import main.statement.TextStatement;

import javax.swing.text.html.HTML;
import java.util.*;

public class Customer {

	private String _name;
	private ArrayList<Rental> _rentals = new ArrayList<Rental>();

	public Customer(String name) {
		_name = name;
	}

	public void addRental(Rental arg) {
		_rentals.add(arg);
	}
	public List<Rental> getRentals() { return _rentals; }

	public String getName() {
		return _name;
	}

	public int getTotalFrequentRenterPoints() {
		int totalFrequentRenterPoints = 0;

		for (Rental rental : _rentals) {
			// add frequent renter points
			totalFrequentRenterPoints += rental.getFrequentRenterPoints();
		}
		return totalFrequentRenterPoints;
	}

	public double getTotalCharge() {
		double totalAmount = 0;

		for (Rental rental : _rentals) {
			totalAmount += rental.getPrice();
		}

		return totalAmount;
	}

	public String statement() {
		return (new TextStatement(this)).getStatement();
	}
	
	public String htmlStatement() {
		return (new HTMLStatement(this)).getStatement();
	}
}
