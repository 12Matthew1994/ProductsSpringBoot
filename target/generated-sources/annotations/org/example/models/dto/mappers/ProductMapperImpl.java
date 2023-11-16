package org.example.models.dto.mappers;

import javax.annotation.processing.Generated;
import org.example.data.enitities.ProductEntity;
import org.example.models.dto.ProductDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-16T15:33:33+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductEntity toEntity(ProductDTO source) {
        if ( source == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setName( source.getName() );
        productEntity.setDescription( source.getDescription() );
        productEntity.setPrice( source.getPrice() );

        return productEntity;
    }

    @Override
    public ProductDTO toDTO(ProductEntity source) {
        if ( source == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setName( source.getName() );
        productDTO.setDescription( source.getDescription() );
        productDTO.setPrice( source.getPrice() );

        return productDTO;
    }
}
