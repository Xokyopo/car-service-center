package ru.expoforum.carservicecenter.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Table(name = "CARSERVICECENTER_CAR_SERVICE_CENTER")
@Entity(name = "carservicecenter_CarServiceCenter")
@NamePattern("%s|name")
public class CarServiceCenter extends StandardEntity {
    private static final long serialVersionUID = -6694945158423629532L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    @NotBlank(message = "{msg://carservicecenter_CarServiceCenter.name.validation.NotBlank}")
    private String name;

    @Column(name = "PHONE", length = 1024)
    private String phone;

    @JoinColumn(name = "CITY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(DeletePolicy.UNLINK)
    @OnDeleteInverse(DeletePolicy.UNLINK)
    private City city;

    @Column(name = "ADDRESS")
    private String address;

    @JoinTable(name = "CARSERVICECENTER_CAR_SERVICE_CENTER_CUSTOMER_LINK",
            joinColumns = @JoinColumn(name = "CAR_SERVICE_CENTER_ID"),
            inverseJoinColumns = @JoinColumn(name = "CUSTOMER_ID"))
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToMany
    private Set<Customer> customers;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @OneToMany(mappedBy = "center")
    private Set<Employee> employees;

    @Composition
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @OneToMany(mappedBy = "center")
    private Set<Repair> repairs;

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public Set<Repair> getRepairs() {
        return repairs;
    }

    public void setRepairs(Set<Repair> repairs) {
        this.repairs = repairs;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
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