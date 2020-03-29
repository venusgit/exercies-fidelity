package com.fidelity.exercise.controller;

import com.fidelity.exercise.Constants;
import com.fidelity.exercise.model.Euro;
import com.fidelity.exercise.model.MyCurrency;
import com.fidelity.exercise.model.USDollar;
import com.fidelity.exercise.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/currency")
public class CurrencyController {
    @Autowired
    private CurrencyService service;

    @RequestMapping("/changes/{currencyName}/{amount}")
    public String getChanges(@NotNull @PathVariable String currencyName,
                             @NotNull @PathVariable Integer amount) {
        if (amount == 0)
            return "Please enter amount greater than 0";
        MyCurrency currency = null;

        if (Constants.USD.equalsIgnoreCase(currencyName)) {
            return service.getChanges(new USDollar(), amount);
        } else if (Constants.EURO.equalsIgnoreCase(currencyName)) {
            return service.getChanges(new Euro(), amount);
        }
        return "Currency name is not available now !!!";
    }

}
