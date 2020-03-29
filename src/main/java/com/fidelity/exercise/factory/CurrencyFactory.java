package com.fidelity.exercise.factory;

import com.fidelity.exercise.constants.Constants;
import com.fidelity.exercise.model.Euro;
import com.fidelity.exercise.model.MyCurrency;
import com.fidelity.exercise.model.USDollar;

public class CurrencyFactory {
    public static MyCurrency getCurrency(String currType) throws IllegalArgumentException {
        MyCurrency currency = null;
        switch (currType) {
            case Constants.USD:
                currency = new USDollar();
                break;

            case Constants.EURO:
                currency = new Euro();
                break;

            default:
                throw new IllegalArgumentException("Invalid currency Type");
        }
        return currency;
    }
}
