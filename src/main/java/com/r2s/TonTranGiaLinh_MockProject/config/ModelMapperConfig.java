package com.r2s.TonTranGiaLinh_MockProject.config;

import com.r2s.TonTranGiaLinh_MockProject.dto.CategoryDTO;
import com.r2s.TonTranGiaLinh_MockProject.dto.ProductDTO;
import com.r2s.TonTranGiaLinh_MockProject.entity.Category;
import com.r2s.TonTranGiaLinh_MockProject.entity.Product;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.NamingConventions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
   public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setSourceNamingConvention(NamingConventions.NONE)
                .setDestinationNamingConvention(NamingConventions.NONE);

        modelMapper.createTypeMap(Product.class, ProductDTO.class)
                .addMapping(src -> src.getCategory().getName(), ProductDTO::setCategory);

        modelMapper.createTypeMap(ProductDTO.class, Product.class)
                .addMapping(ProductDTO::getCategory,(dest, value) -> dest.getCategory().setName(value != null ? value.toString() : null));
        return modelMapper;
    }

}
