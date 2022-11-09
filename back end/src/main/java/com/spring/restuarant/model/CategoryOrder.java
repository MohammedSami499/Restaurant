package com.spring.restuarant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class CategoryOrder extends BaseEntity{

    @Column(name = "creation_date")
    @CreationTimestamp
    private Date creationDate;

    @Column(name = "update_date")
    @UpdateTimestamp
    private Date updateDate;
}
