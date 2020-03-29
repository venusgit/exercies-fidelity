package com.fidelity.exercise.model;


import java.util.Map;

public abstract class MyCurrency {
    private String name;

    public abstract Map<Integer, String> getDenominations();
}
