package com.bfe.server.dto;

import com.bfe.server.entity.Category;
import com.bfe.server.entity.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class ProductDto {
    private Long id;
    @JsonProperty("category_id")
    private Long categoryId;
    private String name;
    private Integer price;
    private String detail;
    private String thumbnail;

    public Product toEntity(Category category) {
        return new Product(
                id,
                category,
                name,
                price,
                detail,
                thumbnail
        );
    }
}
