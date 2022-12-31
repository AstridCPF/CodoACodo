package com.codoacodo.familyexpenses.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="income")
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private Long id;

    @Column(name="description")
    @JsonProperty
    private String description;

    @Column(name="amount")
    @JsonProperty
    private Double amount;

    @ManyToOne()
    @JoinColumn(name = "family_user_id")
    @JsonBackReference
    private Family family;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Income{" +
                "id_month_income=" + id +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", family=" + family +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Income)) return false;
        Income income = (Income) o;
        return id.equals(income.id) && family.equals(income.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, family);
    }
}