package com.challenge.Tower_Challenge.model;

/**
 * Represents a cell tower with its properties.
 */
public class CellTower {
    private int tower_id;
    private String operator;
    private String address;
    private double height;
    private String tower_type;
    private double latitude;
    private double longitude;
    private String technology;

/*
* Get Tower properties
*
* @return their values
* */

    public int getTower_id() {
        return tower_id;
    }

    public void setTower_id(int tower_id) {
        this.tower_id = tower_id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getTower_type() {
        return tower_type;
    }

    public void setTower_type(String tower_type) {
        this.tower_type = tower_type;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
