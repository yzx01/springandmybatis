package com.hand.serviceimpl;

import com.hand.bean.Customer;
import com.hand.dao.CustomerDAO;
import com.hand.service.AddressService;
import com.hand.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO customerDAO;

	public Integer insert(Customer customer, AddressService addressService) {
		int count =  customerDAO.save(customer);
		if(count==1){
			System.out.println("已经保存的数据如下:");
			System.out.println("ID:"+customer.getCustomerid());
			System.out.println("FirstName:"+customer.getFirstname());
			System.out.println("LastName:"+customer.getLastname());
			System.out.println("Email:"+customer.getEmail());

			System.out.println("Address:"+addressService.getAddress(customer.getAddressid()));
		}
		return count;
	}

//	public Integer insert(Customer customer ){
//		System.out.println("================");
//		int count =  customerDAO.save(customer);
//		if(count==1){
//			System.out.println("已经保存的数据如下:");
//			System.out.println("ID:"+customer.getCustomerid());
//			System.out.println("FirstName:"+customer.getFirstname());
//			System.out.println("LastName:"+customer.getLastname());
//			System.out.println("Email:"+customer.getEmail());
//
//			System.out.println("Address:"+addressService.getAddress(address_id));
//		}
//		return count;
//	}

	public Integer getCustomerId(Customer customer) {
		return customerDAO.getCustomerid(customer);
	}

	public Integer delete(int id) {
		Integer count = customerDAO.delete(id);
		return count;
	}
}
