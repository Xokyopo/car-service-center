package ru.expoforum.carservicecenter.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Table(name = "CARSERVICECENTER_REPAIR")
@Entity(name = "carservicecenter_Repair")
@NamePattern("%s|description")
public class Repair extends StandardEntity {
    private static final long serialVersionUID = 6915922754135501365L;

    @NotNull
    @Column(name = "DESCRIPTION", nullable = false, length = 5000)
    @NotBlank(message = "{msg://carservicecenter_Repair.description.validation.NotBlank}")
    private String description;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}