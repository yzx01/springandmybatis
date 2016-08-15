package com.hand.serviceimpl;

import com.hand.bean.Customer;
import com.hand.dao.CustomerDAO;
import com.hand.service.CustomerService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CustomerServiceImpl implements CustomerService {
	
	CustomerDAO customerDAO;
	
	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	@Resource(name="customerDAO")
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public Integer insert(Customer customer){
		return customerDAO.save(customer);
	}

	public Integer getCustomerId(Customer customer) {
		return customerDAO.getCustomerid(customer);
	}
}
