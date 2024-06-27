package com.rms.grr.models;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class EntityValues {

    @Column(name = "created_by", updatable = false)
    private String createdBy;

    @Column(name = "created_on", updatable = false)
    @CreatedDate
    private LocalDateTime createdOn;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_on")
    @LastModifiedDate
    private LocalDateTime modifiedOn;
}
