package org.example.models.dto.mappers;

import org.example.data.enitities.ProductEntity;
import org.example.models.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductEntity toEntity(ProductDTO source);

    ProductDTO toDTO(ProductEntity source);
}
