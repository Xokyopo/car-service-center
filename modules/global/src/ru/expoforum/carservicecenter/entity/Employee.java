package ru.expoforum.carservicecenter.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "CARSERVICECENTER_EMPLOYEE")
@Entity(name = "carservicecenter_Employee")
@NamePattern("%s %s|firstName,birthDay")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = -1529278880224141933L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    @NotBlank(message = "{msg://carservicecenter_Employee.firstName.validation.NotBlank}")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BIRTH_DAY", nullable = false)
    @NotNull
    @FutureOrPresent(message = "{msg://carservicecenter_Employee.birthDay.validation.FutureOrPresent}")
    private LocalDateTime birthDay;

    @Column(name = "EMAIL")
    @Email(message = "{msg://carservicecenter_Employee.email.validation.Email}")
    private String email;

    @Column(name = "SALARY")
    private Long salary;

    public LocalDateTime getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDateTime birthDay) {
        this.birthDay = birthDay;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}