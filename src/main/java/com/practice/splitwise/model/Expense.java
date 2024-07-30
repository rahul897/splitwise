package com.practice.splitwise.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expense {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    @JoinColumn(name="tid")
    private Transaction transaction;

    @OneToOne
    @JoinColumn(name="pid")
    private Person person;

    @Column
    private Float amount;


}
