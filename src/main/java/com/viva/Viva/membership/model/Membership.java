package com.viva.Viva.membership.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.viva.Viva.base.BaseEntity;
import com.viva.Viva.businessProviders.model.BusinessProvider;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name="MEMBERSHIP")
public class Membership extends BaseEntity {

    @Column(name="ACTIVE", nullable = false)
    private Boolean active;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BUSINESS_PROVIDER_ID")
    private BusinessProvider businessProviderId;

    @ManyToMany(fetch =FetchType.LAZY , cascade=CascadeType.PERSIST)
    @JoinTable(name = "MEMBERSHIPS_INVOICES",
    joinColumns = {
            @JoinColumn(name="MEMBERSHIP_ID" , referencedColumnName = "ID" , nullable = false, updatable = false)},
            inverseJoinColumns = {
            @JoinColumn(name="INVOICE_ID" , referencedColumnName = "ID", nullable = false, updatable = false)})
    private Set<Invoice> invoices = new HashSet<>();
    }

