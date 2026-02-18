// Astrid Konicki
package main;



import main.statement.HTMLStatement;
import main.statement.Statement;
import main.statement.TextStatement;

import javax.swing.text.html.HTML;
import java.lang.reflect.Type;
import java.util.*;

public class Customer {

	private String _name;
	private ArrayList<Rental> _rentals = new ArrayList<Rental>();

	private Statement statement = new TextStatement(this);

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

	@Deprecated
	public String statement() {
		return (new TextStatement(this)).getStatement();
	}

	@Deprecated
	public String htmlStatement() {
		return (new HTMLStatement(this)).getStatement();
	}

	public void setStatement(Statement statement) { this.statement = statement; }

	public String getStatementString() { return this.statement.getStatement(); }
}
