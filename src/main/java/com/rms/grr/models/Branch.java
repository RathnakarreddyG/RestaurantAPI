package com.rms.grr.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "branch")
public class Branch extends EntityValues{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bid;

    private String address;

    private String name;

    @ManyToOne
    @JoinColumn(name = "rid", referencedColumnName = "rid")
    private Restaurant restaurant;

}
