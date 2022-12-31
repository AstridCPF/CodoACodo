package com.codoacodo.familyexpenses.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="expense")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private Long id;

    @Column(name="description")
    @JsonProperty
    private String description;

    @Column(name="Amount")
    @JsonProperty
    private Double amount;

    @Column(name="status")
    @JsonProperty
    private String status;

    @Column(name="type_of_expense")
    @JsonProperty
    private String type_of_expense;

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

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType_of_expense() {
        return type_of_expense;
    }

    public void setType_of_expense(String type_of_expense) {
        this.type_of_expense = type_of_expense;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", type_of_expense='" + type_of_expense + '\'' +
                ", family=" + family +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Expense)) return false;
        Expense expense = (Expense) o;
        return id.equals(expense.id) && family.equals(expense.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, family);
    }
}
