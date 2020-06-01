package com.javadevmap.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javadevmap.dao.IProductDao;

@Service
public class ProductService {
	@Autowired
	IProductDao productDaoImpl;

	public void addProduct(String id, String name) {
		System.out.println("execute addProduct method()"); 
		String result=productDaoImpl.addProduct(id, name);
		System.out.println(result);
	}
}
