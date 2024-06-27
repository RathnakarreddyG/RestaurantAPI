package com.rms.grr.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "floors")
public class Floors extends EntityValues{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fid;

    private String floorName;

    @ManyToOne
    @JoinColumn(name = "bid", referencedColumnName = "bid")
    private Branch branch;

    @ManyToOne
    @JoinColumn(name = "rid",referencedColumnName = "rid")
    private Restaurant restaurant;
}
