package com.bikestores.bikestoresapi.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="products", schema="production")
@Data
public class Product {
    @Id
    @Column(name="product_id")
    private Long productId;

    @Column(name="product_name")
    private String producName;

    @JoinColumn(name="brand_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Brand brand;

    @JoinColumn(name="category_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Category category;

    @Column(name="model_year")
    private Long modelYear;

    @Column(name="list_price")
    private float listPrice;
}
