package com.bikestores.bikestoresapi.model;

import java.sql.Date;

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
@Table(name="orders", schema="sales")
@Data
public class Order {
    @Id
    @Column(name="order_id")
    private Long orderId;

    @JoinColumn(name = "customer_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Customer customer;

    @Column(name="order_status")
    private Long orderStatus;

    @Column(name="order_date")
    private Date orderDate;
    
    @Column(name="required_date")
    private Date requiredDate;

    @Column(name="shipped_date")
    private Date shippedDate;

    @JoinColumn(name = "store_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Store store;

    @JoinColumn(name = "staff_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Staff staff;
}
