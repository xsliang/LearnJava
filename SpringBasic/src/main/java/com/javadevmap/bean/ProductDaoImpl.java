package com.javadevmap.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.javadevmap.dao.IProductDao;

@Repository("productDaoImpl")
@Scope("prototype")
public class ProductDaoImpl implements IProductDao {

	public String addProduct(String id, String name) {
		String result=String.format("添加商品id=%s，商品名称为%s，成功！", id,name);
		return result;
	}

}
