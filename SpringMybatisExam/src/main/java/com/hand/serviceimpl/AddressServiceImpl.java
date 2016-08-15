package com.hand.serviceimpl;

import com.hand.dao.AddressDAO;
import com.hand.service.AddressService;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;

/**
 * Created by zhongxing on 2016/8/15.
 */
@Component
public class AddressServiceImpl implements AddressService {
   public AddressDAO addressDAO;

    public AddressDAO getAddressDAOO() {
        return addressDAO;
    }

    @Resource(name="addressDAO")
    public void setCustomerDAO(AddressDAO addressDAO) {
        this.addressDAO = addressDAO;
    }

    public Integer getAddress(int id){
        Integer count= addressDAO.getAddressById(id);
        return count;
    }
}
