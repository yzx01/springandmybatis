package com.hand.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by zhongxing on 2016/8/15.
 */
@Component
public class AddressDAO {
    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    @Resource(name="sqlSessionTemplate")
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {

        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public Integer getAddressById(int id){
        int count = sqlSessionTemplate.selectOne("address.getAddress_id",id);
        return count;
    }

    public String getAddress(int id){
        String address = sqlSessionTemplate.selectOne("address.getAddress",id);
        return address;
    }
}
