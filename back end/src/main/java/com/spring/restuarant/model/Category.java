package com.spring.restuarant.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category extends CategoryOrder {
    private String categoryName;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private Set<Order> orders;
}
