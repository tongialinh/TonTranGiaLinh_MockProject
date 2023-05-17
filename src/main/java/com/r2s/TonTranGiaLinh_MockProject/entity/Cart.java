package com.r2s.TonTranGiaLinh_MockProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name ="cart")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cart {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "createDate")
    private ZonedDateTime createDate;

    @OneToMany(mappedBy = "cart")
    private List<CartLineItem> cartLineItems;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
