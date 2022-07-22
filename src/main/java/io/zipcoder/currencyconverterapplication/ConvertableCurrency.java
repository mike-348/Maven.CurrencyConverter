package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {

    // formula: parameter / rate of desired conversion currency
    // e.g. australian rate / usd rate tells you how many usd one aud is worth (~.74usd)
    // have to get the denominator type by overriding inside each class
    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.getCurrencyType().getRate();
    }
    CurrencyType getCurrencyType();
}
