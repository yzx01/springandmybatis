package com.hand.dao;

import com.hand.bean.Customer;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class CustomerDAO {
	
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	@Resource(name="sqlSessionTemplate")
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public List<Customer> getList(){
		List<Customer> list = sqlSessionTemplate.selectList("customer.getAll");
		return list;
	}

	public Integer save(Customer customer){
		int count = sqlSessionTemplate.insert("customer.save",customer);
		return count;
	}

	public int getCustomerid(Customer customer){
		int id = sqlSessionTemplate.selectOne("customer.getId",customer);
		return id;
	}

}
