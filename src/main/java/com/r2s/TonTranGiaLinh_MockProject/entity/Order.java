package com.r2s.TonTranGiaLinh_MockProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name ="order")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="totalPrice")
    private BigDecimal totalPrice;

    @Column(name = "orderDate")
    private ZonedDateTime orderDate;

    @Column(name = "deliveryDate")
    private ZonedDateTime deliveryDate;

    @OneToMany(mappedBy = "order")
    private List<CartLineItem> cartLineItems;


}
