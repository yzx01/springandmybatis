package com.hand.dao;

import com.hand.bean.Customer;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

public interface CustomerDAO {

	public List<Customer> getList();

	public Integer save(Customer customer);

	public int getCustomerid(Customer customer);

	public int delete(int id);

}
