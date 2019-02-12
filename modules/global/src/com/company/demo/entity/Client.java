package com.company.demo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "DEMO_CLIENT")
@Entity(name = "demo_Client")
public class Client extends StandardEntity {
    @NotNull
    @Column(name = "TITLE", nullable = false)
    protected String title;

    @NotNull
    @Column(name = "DISCOUNT", nullable = false)
    protected Integer discount;

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}