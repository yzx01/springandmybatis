package com.hand.bean;

import java.sql.Timestamp;

/**
 * Created by zhongxing on 2016/8/15.
 */
public class City {

    private int city_id;
    private String city;
    private int country_id;
    private Timestamp last_update;

    public City() {
    }

    public City(int city_id, String city, int country_id, Timestamp last_update) {
        this.city_id = city_id;
        this.city = city;
        this.country_id = country_id;
        this.last_update = last_update;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
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
        return "City{" +
                "city='" + city + '\'' +
                ", city_id=" + city_id +
                ", country_id=" + country_id +
                ", last_update=" + last_update +
                '}';
    }
}
