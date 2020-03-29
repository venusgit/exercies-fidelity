package com.fidelity.exercise.service;

import com.fidelity.exercise.model.MyCurrency;

public interface CurrencyService {
    String getChanges(MyCurrency currency, Integer amount);
}
