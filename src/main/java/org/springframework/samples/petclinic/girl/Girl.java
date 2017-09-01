package org.springframework.samples.petclinic.girl;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.samples.petclinic.model.Person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

/**
 * Simple JavaBean domain object representing a girls.
 *
 * @author Yang Yumeng
 */
@Entity
@Table(name = "girls")
public class Girl extends Person {
    @Column(name = "mobile")
    @NotEmpty
    @Digits(fraction = 0, integer = 11)
    private String mobile;

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getMobile() {
        return this.mobile;
    }



}



