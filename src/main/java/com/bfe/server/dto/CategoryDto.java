package com.bfe.server.dto;

import com.bfe.server.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class CategoryDto {
    Long id;
    String name;

    public Category toEntity() {
        return new Category(id, name);
    }
}
