package com.rms.grr.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tableDetails")
public class TableDetails extends EntityValues{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tdId;

    private String status;

    @ManyToOne
    @JoinColumn(name = "fid",referencedColumnName = "fid")
    private Floors floors;

    @ManyToOne
    @JoinColumn(name = "bid", referencedColumnName = "bid")
    private Branch branch;
}
