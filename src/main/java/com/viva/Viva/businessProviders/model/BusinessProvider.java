package com.viva.Viva.businessProviders.model;

import com.viva.Viva.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Setter
//@Getter
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name="BUSINESS_PROVIDER")
public class BusinessProvider extends BaseEntity {
    @Column(name="FIRST_NAME",nullable = false)
    private String firstName;

    @Column(name="LAST_NAME",nullable = false)
    private String lastName;

    @Column(name="EMAIL", nullable = false)
    private String email;

    @Column(name="ACTIVE", nullable = false)
    private Boolean active;



}

