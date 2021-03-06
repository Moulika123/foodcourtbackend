package com.niit.foodcourtbackend;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.foodcourtbackend.configuration.HibernateConfiguration;
import com.niit.foodcourtbackend.dao.CustomerDao;

public class CustomerTest {

	   
	AnnotationConfigApplicationContext context;
	CustomerDao customerDao;
	Customer customer;
	
	
	
	@Before
	public void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		customerDao=(CustomerDao)context.getBean("customerDao");
		customer=new Customer();
	
	}
	
	/* @Test
	public void test() {
		
		customer.setFirstName("Sravan");
		customer.setLastName("Gangula");
		customer.setMobile("9959645001");
		customer.setUsername("Krish");;
		customer.setPassword("reddy");
		customer.setComfirmPassword("reddy");
		
		Assert.assertEquals("Customer added successfully", true, customerDao.addCustomer(customer) );
	}
	*/
	/*@Test
	public void test() {
		
		customer.setCustId(4);
		customerDao.deleteCustomer(customer);
	}
*/
	/*@Test
	public void test() {
		
		  customer= customerDao.getCustomer(33);
		  customer.setFirstName("Sravan Reddy");
		  assertEquals("update successful",true,customerDao.updateCustomer(customer));
	}*/
	
/*@Test
	public void test() {
		
		 
		List<Customer> customers = customerDao.retreiveAllCustomers();
		for (int i = 0; i < customers.size(); i++) {
			  Customer customer = (Customer) customers.get(i);
				System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+customer.getMobile());
			  }
}
	*/
	/*@Test
	public void test()
	{
		customer= customerDao.getCustomer(3);
		System.out.println(customer.getFirstName());
	
	}*/
	
}

