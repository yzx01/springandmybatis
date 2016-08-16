package com.hand.service;

import com.hand.bean.Customer;

/**
 * Created by zhongxing on 2016/8/15.
 */
public interface CustomerService {
    public Integer insert(Customer customer,AddressService addressService);
    public Integer getCustomerId(Customer customer);
    public Integer delete(int id);
}
