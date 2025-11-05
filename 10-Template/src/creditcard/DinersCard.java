// Created by Murat Gungor, modified by Astrid Konicki

/*
 * Diners club credit card validation
 * 
 */
package creditcard;

import java.util.Calendar;
import java.util.Date;

public class DinersCard extends CreditCard {

    protected String cardNum;
    protected int expMM, expYY;

    // constructor
    public DinersCard(String num, int expMonth, int expYear) {
        cardNum = num;
        expMM = expMonth;
        expYY = expYear;
    }

    // check number of digits
    public boolean isNumOfDigitsValid() {
        return cardNum.length() == 14;
    }

    // check prefix
    public boolean isValidPrefix() {
        String prefix = cardNum.substring(0, 1);
        String nextChar = cardNum.substring(1, 2);
        String validChars = "068"; // 2nd char must be a 0 or 6, or 8
        // 51-55
        return (prefix.equals("3")) && // prefix must be
                (validChars.contains(nextChar));
    }

    public boolean isAccountInGoodStand() {

        // Make necessary DINERS CARD API calls to
        System.out.println("This Diners card is in good standing");

        return true;
    }
} // end diners card class
