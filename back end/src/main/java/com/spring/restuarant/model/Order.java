package com.spring.restuarant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order extends CategoryOrder {

    private String orderName;
    private int price;
    private String img;
    @Lob
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
