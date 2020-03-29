package com.fidelity.exercise.service;

import com.fidelity.exercise.factory.CurrencyFactory;
import com.fidelity.exercise.model.MyCurrency;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Override
    public String getChanges(String currencyType, Integer amount) throws Exception {

        MyCurrency myCurrency = CurrencyFactory.getCurrency(currencyType);
        Map<Integer, String> denominationsMap = myCurrency.getDenominations();
        StringBuilder output = new StringBuilder();
        int den = 0;
        int rem = amount;
        for (Integer d : denominationsMap.keySet()) {
            den = rem / d;
            rem = rem - (den * d);
            if (den != 0) {
                output.append(den);
                output.append(" " + denominationsMap.get(d) + " ");
            }
        }
        output.append(" coins.");
        return output.toString();
    }
}
