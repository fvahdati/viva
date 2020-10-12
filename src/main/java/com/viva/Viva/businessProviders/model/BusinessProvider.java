package com.viva.Viva.businessProviders.model;

import com.viva.Viva.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @Column(name="ABN_NUMBER" , nullable = false)
    private Integer abnNumber;

    @Column(name="VERIFIED_ABN_NUMBER", nullable = false)
    private Boolean verifiedAbnNumber;

    @Column(name="BADGE_ID" , nullable = false)
    private Integer bardgeId;

    @Column(name="MEMBERSHIP", nullable = true)
    private Integer membership;


    @OneToMany(mappedBy = "membership", cascade = CascadeType.ALL)
    private Set<BusinessProvider> businessProviderSet = new HashSet<>();
}

