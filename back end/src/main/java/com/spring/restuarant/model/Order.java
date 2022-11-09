package com.spring.restuarant.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

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
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
