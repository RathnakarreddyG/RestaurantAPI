package com.rms.grr.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class Orders extends EntityValues{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;

    private String status;

    private String name;

    @ManyToOne
    @JoinColumn(name = "sid", referencedColumnName = "sid")
    private Staff staff;

    @ManyToOne
    @JoinColumn(name = "tdId", referencedColumnName = "tdId")
    private TableDetails tableDetails;
}
