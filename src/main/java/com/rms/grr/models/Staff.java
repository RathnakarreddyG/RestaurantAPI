package com.rms.grr.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "staff")
public class Staff extends EntityValues{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;

    private String name;

    private String address;

    private String contact;

    private String role;

    @ManyToOne
    @JoinColumn(name = "bid", referencedColumnName = "bid")
    private Branch branch;

    @ManyToOne
    @JoinColumn(name = "rid",referencedColumnName = "rid")
    private Restaurant restaurant;
}
