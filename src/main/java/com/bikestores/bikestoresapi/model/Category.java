package com.bikestores.bikestoresapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="categories", schema="production")
@Data
public class Category {
    @Id
    @Column(name="category_id")
    private Long categoryId;

    @Column(name="category_name")
    private String categoryName;
}
