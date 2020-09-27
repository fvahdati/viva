package businessProviders.model;

import base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

//@Setter
//@Getter
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name="BUSINESS_PROVIDERS")
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

