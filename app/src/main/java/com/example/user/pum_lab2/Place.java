package com.example.user.pum_lab2;

/**
 * Created by User on 18.12.2017.
 */

public class Place {

    private String placeName;
    private int temperature;
    private String information;

    public String getPlaceName() {
        return placeName;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getInformation() {
        return information;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    Place(String placeName, int temperature, String information)
    {
        this.placeName= placeName;
        this.temperature=temperature;
        this.information=information;
    }
}

