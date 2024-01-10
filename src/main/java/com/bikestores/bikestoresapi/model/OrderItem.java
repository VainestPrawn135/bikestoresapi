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
@Table(name = "order_items", schema = "sales")
@Data
public class OrderItem {
    @Id
    @Column(name="item_id")
    private Long itemId;

    @JoinColumn(name = "order_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Order order;

    @JoinColumn(name = "product_id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Product product;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "list_price")
    private float listPrice;

    @Column(name = "discount")
    private float discount;
}
