package com.javadevmap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.javadevmap.dao.IProductDao;

@Service
public class ProductServiceBoth {
	@Autowired
	@Qualifier("productDaoOne")
	IProductDao productDao1;
	
	@Autowired
	@Qualifier("productDaoTwo")
	IProductDao productDao2;
	
	public void addProduct(String id,String name) {
		System.out.println("execute addProduct method()");
		String result=productDao1.addProduct(id, name);
		System.out.println(result);
		result=productDao2.addProduct(id, name);
		System.out.println(result);
	}
}
