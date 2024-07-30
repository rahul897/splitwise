package com.practice.splitwise.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private Float currentAmount;

}
