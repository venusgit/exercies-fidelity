package com.fidelity.exercise.model;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class USDollar implements MyCurrency {

    public Map<Integer, String> getDenominations() {
        Map<Integer, String> denMap = new TreeMap<>(Collections.reverseOrder());
        denMap.put(100, "Dollar");
        //denMap.put(50,"Half-Dollar");
        denMap.put(25, "Quarter");
        denMap.put(10, "Dime");
        denMap.put(5, "Nickel");
        denMap.put(1, "Penny");
        return denMap;
    }
}
