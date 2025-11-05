// Created by Murat Gungor, modified by Astrid Konicki

/*
 * validate visa card
 * 
 */
package creditcard;

import java.util.Calendar;
import java.util.Date;

public class VisaCard extends CreditCard{



    public VisaCard(String num, int expMonth, int expYear) {
        cardNum = num;
        expMM = expMonth;
        expYY = expYear;
    }

    @Override
    public boolean isNumOfDigitsValid() {
        return (cardNum.length() == 13) || (cardNum.length() == 16);
    }

    @Override
    public boolean isValidPrefix() {
        String prefix = cardNum.substring(0, 1);
        if (prefix.equals("4")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isAccountInGoodStand() {

        // Make necessary VISA API calls to perform other checks.
        System.out.println("This Visa Card is in good standing");

        return true;
    }
} // end visa class
