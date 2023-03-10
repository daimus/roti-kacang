package com.example.productservice.application.products.service;
import com.example.productservice.application.products.repository.ProductRepository;
import com.example.productservice.application.products.usecase.ProductUseCase;
import com.example.productservice.application.products.entity.Product;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor

public class ProductService implements ProductUseCase {
    private final ProductRepository productRepository;

    @Override
    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    @Override
    public Page<Product> getProduct(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Page<Product> getProduct(Pageable pageable, String search, Long categoryId) {
        return productRepository.findAll(pageable, search, categoryId);
    }

    @Override
    public Page<Product> getProduct(Pageable pageable, String search) {
        return productRepository.findAll(pageable, search);
    }

    @Override
    public Page<Product> getProduct(Pageable pageable, Long categoryId) {
        return productRepository.findAll(pageable, categoryId);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product saveProduct(@Valid Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product saveProduct(Long id, @Valid Product product) {
        product.setId(id);
        return productRepository.save(product);
    }

    @Override
    public boolean deleteProductById(Long id) {
        productRepository.deleteById(id);
        return true;
    }
}
