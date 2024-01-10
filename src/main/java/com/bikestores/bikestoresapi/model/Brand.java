package com.bikestores.bikestoresapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="brands", schema="production")
@Data
public class Brand {
    @Id
    @Column(name="brand_id")
    private Long brandId;

    @Column(name="brand_name")
    private String brandName;
}
