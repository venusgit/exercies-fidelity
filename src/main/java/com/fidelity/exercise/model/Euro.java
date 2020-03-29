package com.fidelity.exercise.model;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Euro extends MyCurrency {

    public Map<Integer, String> getDenominations() {
        Map<Integer, String> denMap = new TreeMap<>(Collections.reverseOrder());
        denMap.put(200, "Two Euro");
        denMap.put(100, "One Euro");
        denMap.put(50, "50c");
        denMap.put(20, "20c");
        denMap.put(10, "10c");
        denMap.put(5, "5c");
        denMap.put(1, "1c");
        return denMap;
    }
}


