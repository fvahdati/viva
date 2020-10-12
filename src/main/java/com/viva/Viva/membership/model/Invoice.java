package com.viva.Viva.membership.model;


import com.viva.Viva.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name="INVOICE")
public class Invoice extends BaseEntity {

    @ManyToMany(fetch = FetchType.LAZY , cascade= CascadeType.PERSIST)
    @JoinTable(name = "MEMBERSHIPS_INVOICES",
            joinColumns = {
                    @JoinColumn(name="INVOICE_ID" , referencedColumnName = "ID" , nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name="MEMBERSHIP_ID" , referencedColumnName = "ID", nullable = false, updatable = false)})
    private Set<Membership> memberships = new HashSet<>();
}
