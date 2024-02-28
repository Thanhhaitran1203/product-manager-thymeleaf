package com.productmanagementthymeleaf.service;

import com.productmanagementthymeleaf.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    private static final List<Product> products = new ArrayList<>();
     static {
         products.add(new Product(1,"Coca",10,"Coca-Cola",true));
         products.add(new Product(2,"Coca",10,"Coca-Cola",true));
         products.add(new Product(3,"Coca",10,"Coca-Cola",true));
         products.add(new Product(4,"Coca",10,"Coca-Cola",true));
         products.add(new Product(5,"Coca",10,"Coca-Cola",true));
         products.add(new Product(6,"Coca",10,"Coca-Cola",false));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findById(int id) {
         Product product = null;
         for (int i= 0;i<products.size();i++){
             if (products.get(i).getId() == id){
                 product = products.get(i);
             }
         }
        return product;
    }

    @Override
    public void update(int id, Product product) {
    Product product1 = findById(id);
    product1.setName(product.getName());
    product1.setPrice(product.getPrice());
    product1.setDescription(product.getDescription());
    }

    @Override
    public void remove(int id) {

    }
}
