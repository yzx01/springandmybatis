package com.hand.bean;

import java.sql.Timestamp;

/**
 * Created by zhongxing on 2016/8/15.
 */
public class Store {
    private int store_id;
    private int manager_staff_id;
    private int address_id;
    private Timestamp last_update;

    public Store() {
    }

    public Store(int store_id, int manager_staff_id, int address_id, Timestamp last_update) {
        this.store_id = store_id;
        this.manager_staff_id = manager_staff_id;
        this.address_id = address_id;
        this.last_update = last_update;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }

    public int getManager_staff_id() {
        return manager_staff_id;
    }

    public void setManager_staff_id(int manager_staff_id) {
        this.manager_staff_id = manager_staff_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    @Override
    public String toString() {
        return "Store{" +
                "address_id=" + address_id +
                ", store_id=" + store_id +
                ", manager_staff_id=" + manager_staff_id +
                ", last_update=" + last_update +
                '}';
    }
}
