package com.fidelity.exercise.controller;

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

    @RequestMapping("/changes/{currencyType}/{amount}")
    public String getChanges(@NotNull @PathVariable String currencyType,
                             @NotNull @PathVariable Integer amount) throws Exception {
        if (amount == 0)
            return "Please enter amount greater than 0";

        return service.getChanges(currencyType, amount);

    }

}
