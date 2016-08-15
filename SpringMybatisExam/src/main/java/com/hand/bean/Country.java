package com.hand.bean;

import java.sql.Timestamp;

/**
 * Created by zhongxing on 2016/8/15.
 */
public class Country {
    private int country_id;
    private String country;
    private Timestamp last_update;

    public Country() {
    }

    public Country(int country_id, String country, Timestamp last_update) {
        this.country_id = country_id;
        this.country = country;
        this.last_update = last_update;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", country_id=" + country_id +
                ", last_update=" + last_update +
                '}';
    }
}
