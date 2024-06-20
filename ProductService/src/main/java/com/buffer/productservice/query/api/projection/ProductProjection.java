package com.buffer.productservice.query.api.projection;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

import com.buffer.productservice.command.api.data.Product;
import com.buffer.productservice.command.api.data.ProductRepository;
import com.buffer.productservice.command.api.model.ProductRestModel;
import com.buffer.productservice.query.api.queries.GetProductsQuery;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductProjection {

    private ProductRepository productRepository;

    public ProductProjection(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @QueryHandler
    public List<ProductRestModel> handle(GetProductsQuery getProductsQuery) {
        List<Product> products =
                productRepository.findAll();
 
        List<ProductRestModel> productRestModels =
                products.stream()
                        .map(product -> new ProductRestModel
                                .ProductRestModelBuilder()
                                .setQuantity(product.getQuantity())
                                .setPrice(product.getPrice())
                                .setName(product.getName())
                                .build())
                        .collect(Collectors.toList());

        return productRestModels;
    }
}