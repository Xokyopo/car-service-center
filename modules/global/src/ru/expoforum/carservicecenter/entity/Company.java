package ru.expoforum.carservicecenter.entity;

import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Table(name = "CARSERVICECENTER_COMPANY")
@Entity(name = "carservicecenter_Company")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@NamePattern("%s %s|name,inn")
public class Company extends Customer {
    private static final long serialVersionUID = -5850720049297590597L;

    @NotNull
    @Column(name = "INN", nullable = false)
    @NotBlank(message = "{msg://carservicecenter_Company.inn.validation.NotBlank}")
    private String inn;

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}