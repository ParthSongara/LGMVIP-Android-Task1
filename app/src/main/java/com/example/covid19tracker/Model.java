package com.example.covid19tracker;

public class Model {
    private String districtName;
    private int activeCases;
    private int confirmedCases;
    private int deceasedCases;
    private int recoveredCases;

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public int getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(int activeCases) {
        this.activeCases = activeCases;
    }

    public int getConfirmedCases() {
        return confirmedCases;
    }

    public void setConfirmedCases(int confirmedCases) {
        this.confirmedCases = confirmedCases;
    }

    public int getDeceasedCases() {
        return deceasedCases;
    }

    public void setDeceasedCases(int deceasedCases) {
        this.deceasedCases = deceasedCases;
    }

    public int getRecoveredCases() {
        return recoveredCases;
    }

    public void setRecoveredCases(int recoveredCases) {
        this.recoveredCases = recoveredCases;
    }
}
