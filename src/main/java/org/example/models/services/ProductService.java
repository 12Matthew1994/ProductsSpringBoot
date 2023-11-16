package org.example.models.services;

import org.example.models.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    void create(ProductDTO product);

    List<ProductDTO> getAll();

    ProductDTO getById(long productId);
}
