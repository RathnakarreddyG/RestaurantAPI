package com.rms.grr.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "items")
public class Items extends EntityValues{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iid;

    private String item_name;

    private String price;

    private String quantity;

    private String availability;

    private String discount;

    @ManyToOne
    @JoinColumn(name = "oid",referencedColumnName = "oid")
    private Orders orders;

    @Override
    public void setCreatedBy(String createdBy) {
        super.setCreatedBy(createdBy);
    }
}
