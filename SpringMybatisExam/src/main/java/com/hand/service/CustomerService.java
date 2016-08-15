package com.hand.service;

import com.hand.bean.Customer;

/**
 * Created by zhongxing on 2016/8/15.
 */
public interface CustomerService {
    public Integer insert(Customer customer);
    public Integer getCustomerId(Customer customer);
}
