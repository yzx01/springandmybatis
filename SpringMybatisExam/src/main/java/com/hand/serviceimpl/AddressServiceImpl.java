package com.hand.serviceimpl;

import com.hand.dao.AddressDAO;
import com.hand.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by zhongxing on 2016/8/15.
 */
@Component
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressDAO addressDAO;

    public Integer getAddressById(int id) {
        Integer count = addressDAO.getAddressById(id);

        return count;
    }

    public String getAddress(int id) {
       String s = addressDAO.getAddress(id);
        return s;
    }
}
