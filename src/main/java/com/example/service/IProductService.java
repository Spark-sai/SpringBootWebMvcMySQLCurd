package com.example.service;

import java.util.List;

import com.example.model.Product;

public interface IProductService {

	public Integer saveProduct(Product p);
	public List<Product> getAllProcust();
	public void deleteProduct(Integer id);
	
	public Product getOneProduct(Integer id);
	public void updateProduct(Product p);
}
