package ru.expoforum.carservicecenter.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Table(name = "CARSERVICECENTER_CUSTOMER")
@Entity(name = "carservicecenter_Customer")
@NamePattern("%s|name")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING, length = 255)
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -2336279183326881815L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "EMAIL")
    @Email(message = "{msg://carservicecenter_Customer.email.validation.Email}")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}