package com.bfe.server.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Category extends Datetime{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    @Column String name;

    @ToString.Exclude
    @JsonManagedReference
    @OrderBy("id")
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private final Set<Product> categoryProducts = new LinkedHashSet<>();
}
