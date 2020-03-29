package com.fidelity.exercise.service;

public interface CurrencyService {
    String getChanges(String currency, Integer amount) throws Exception;
}
