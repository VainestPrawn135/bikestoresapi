package com.bikestores.bikestoresapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="stores", schema="sales")
@Data
public class Store {
    @Id
    @Column(name="store_id")
    private Long storeId;

    @Column(name="store_name")
    private String storeName;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="zip_code")
    private String zipCode;
}
