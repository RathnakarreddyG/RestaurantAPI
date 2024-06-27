package com.rms.grr.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bills")
public class Bills extends EntityValues{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long blId;

    @ManyToOne
    @JoinColumn(name = "oid", referencedColumnName = "oid")
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "tdId", referencedColumnName = "tdId")
    private TableDetails tableDetails;

    private String mode;

}
