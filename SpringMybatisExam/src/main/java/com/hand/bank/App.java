package com.hand.bank;

import com.hand.bean.Customer;
import com.hand.service.AddressService;
import com.hand.service.CustomerService;
import com.hand.serviceimpl.AddressServiceImpl;
import com.hand.serviceimpl.CustomerServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by zhongxing on 2016/8/15.
 */
public class App {
    
    public static void main(String args[]) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        CustomerService customerService = (CustomerService) context.getBean("customerServiceImpl");
        AddressService addressService = (AddressService) context.getBean("addressServiceImpl");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入FirstName(first_name):");
        String frist_name=scanner.next();
        System.out.println("请输入LastName(last_name):");
        String last_name=scanner.next();
        System.out.println("请输入Email(email):");
        String email = scanner.next();
        System.out.println("请输入Address ID:");
        int address_id=scanner.nextInt();
        boolean flag=true;
        while(flag){
            if(addressService.getAddress(address_id)==null){
                System.out.println("你输入的Address ID 不存在,请重新输入:");
                address_id=scanner.nextInt();

            }else{
                if(addressService.getAddressById(address_id)==1){
                    flag=false;
                }else{
                    System.out.println("你输入的Address ID 不存在,请重新输入:");
                    address_id=scanner.nextInt();
                }

            }

        }
        Date date = new Date();

        Customer customer = new Customer(1,frist_name,last_name,email,address_id,date);
        customerService.insert(customer,addressService);

        System.out.println("请输入要删除的Customer 的ID:");
        int deleteid=scanner.nextInt();
        int delete = customerService.delete(deleteid);
        if(delete==1){
            System.out.println("你输入的ID deleteid 的Customer 已经 删除.");
        }


    }
}
