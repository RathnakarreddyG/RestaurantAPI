package com.rms.grr.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "inventory")
public class Inventory extends EntityValues{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vid;

    private String itemName;

    private int quantity;

    private String status;

    @ManyToOne
    @JoinColumn(name = "bid", referencedColumnName = "bid")
    private Branch branch;

    @ManyToOne
    @JoinColumn(name = "rid", referencedColumnName = "rid")
    private Restaurant restaurant;
}
