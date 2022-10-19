package com.spring.restuarant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Id
    @SequenceGenerator(name = "seq" , sequenceName = "sequence" , allocationSize = 1)
    @GeneratedValue(generator = "sequence" , strategy = GenerationType.SEQUENCE)
    private Long id;
}
