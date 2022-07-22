package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import sun.util.resources.cldr.sr.CalendarData_sr_Cyrl_RS;

public class CanadianDollar implements ConvertableCurrency {
    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.CANADIAN_DOLLAR;
    }
}
