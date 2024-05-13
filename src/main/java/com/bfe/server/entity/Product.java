package com.bfe.server.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product extends Datetime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @Column
    String name;
    @Column
    Integer price;
    @Column
    String detail;
    @Column
    String thumbnail;

    public void patch(Product product) {
        if(product.name != null)
            this.name = product.name;
        if(product.price != null)
            this.price = product.price;
        if(product.detail != null)
            this.detail = product.detail;
        if(product.thumbnail != null)
            this.thumbnail = product.thumbnail;
        if(product.category != null)
            this.category = product.category;
    }
}
