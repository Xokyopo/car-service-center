package ru.expoforum.carservicecenter.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Table(name = "CARSERVICECENTER_CITY")
@Entity(name = "carservicecenter_City")
@NamePattern("%s|name")
public class City extends StandardEntity {
    private static final long serialVersionUID = -4617849712541167427L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 500)
    @NotBlank(message = "{msg://carservicecenter_City.name.validation.NotBlank}")
    private String name;

    @Column(name = "CODE")
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}