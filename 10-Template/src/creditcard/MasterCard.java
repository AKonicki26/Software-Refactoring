// Created by Murat Gungor, modified by Astrid Konicki

/*
* Validate Master card number
*/
package creditcard;

import java.util.Calendar;
import java.util.Date;

public class MasterCard extends CreditCard{
    protected String cardNum;
    protected int expMM, expYY;

    // constructor
    public MasterCard(String num, int expMonth, int expYear) {
        cardNum = num;
        expMM = expMonth;
        expYY = expYear;
    }

    @Override
    public boolean isNumOfDigitsValid() {
        return cardNum.length() == 16;
    }

    @Override
    public boolean isValidPrefix() {
        String prefix = cardNum.substring(0, 1);
        String nextChar = cardNum.substring(1, 2);
        String validChars = "12345";
        // 51-55
        if ((prefix.equals("5")) && (validChars.indexOf(nextChar) >= 0)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isAccountInGoodStand() {

        // Make necessary Master CARD API calls to
        System.out.println("This MasterCard is in good standing");

        return true;
    }
}