package ru.expoforum.carservicecenter.entity;

import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Table(name = "CARSERVICECENTER_INDIVIDUAL")
@Entity(name = "carservicecenter_Individual")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@NamePattern("%s %s|name,passportNo")
public class Individual extends Customer {
    private static final long serialVersionUID = -5373566320662155671L;

    @NotNull
    @Column(name = "PASSPORT_NO", nullable = false)
    @NotBlank(message = "{msg://carservicecenter_Individual.passportNo.validation.NotBlank}")
    private String passportNo;

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }
}