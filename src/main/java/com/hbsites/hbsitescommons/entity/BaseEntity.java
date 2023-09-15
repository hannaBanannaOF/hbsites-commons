package com.hbsites.hbsitescommons.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public abstract class BaseEntity<LISTDTO, DETAILDTO> {
    @Column(name = "create_date", columnDefinition = "timestamp")
    private LocalDateTime creationDate;

    @Column(name = "update_date", columnDefinition = "timestamp")
    private LocalDateTime updateDate;

    @PrePersist
    void onCreate() {
        this.setCreationDate(LocalDateTime.now());
        this.setUpdateDate(LocalDateTime.now());
    }

    @PreUpdate
    void onUpdate() {
        this.setUpdateDate(LocalDateTime.now());
    }

    public abstract LISTDTO toListDTO();

    public abstract DETAILDTO toDetailDTO();
}
