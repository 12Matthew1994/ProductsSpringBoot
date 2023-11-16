package org.example.models.services;

import org.example.data.enitities.ProductEntity;
import org.example.data.repositories.ProductRepository;
import org.example.models.dto.ProductDTO;
import org.example.models.dto.mappers.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public void create(ProductDTO product) {

        ProductEntity newProduct = productMapper.toEntity(product);

        productRepository.save(newProduct);
    }

    @Override
    public List<ProductDTO> getAll() {
        return StreamSupport.stream(productRepository.findAll().spliterator(), false)
                .map(i -> productMapper.toDTO(i))
                .toList();
    }

    @Override
    public ProductDTO getById(long productId) {
        ProductEntity fetchedProduct = productRepository
                .findById(productId)
                .orElseThrow();
        return productMapper.toDTO(fetchedProduct);
    }

}
