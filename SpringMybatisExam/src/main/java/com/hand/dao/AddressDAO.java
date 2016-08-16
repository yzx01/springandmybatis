package com.hand.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by zhongxing on 2016/8/15.
 */
public interface AddressDAO {

    public Integer getAddressById(int id);

    public String getAddress(int id);
}
