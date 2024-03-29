package com.afautos.main.services.product.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.afautos.main.models.product.Product;
import com.afautos.main.repositories.product.ProductRepository;
import com.afautos.main.services.product.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @SuppressWarnings("null")
    @Override
    public String addProduct(Product product) {
        productRepository.save(product);
        return "El producto se creo satisfactoriamente";
    }

    @Override
    public String delProduct(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delProduct'");
    }

    @Override
    public String updateProduct(Long id, Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }

    @PostMapping("URL")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getByIdProduct(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByIdProduct'");
    }

    @Override
    public Product getbyNameProduct(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getbyNameProduct'");
    }

    @Override
    public Product getByCatProduct(String cat) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByCatProduct'");
    }

    @Override
    public Product getByBrandProduct(String brand) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByBrandProduct'");
    }
    
}
