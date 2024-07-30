package com.practice.splitwise.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transaction {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name="gid")
    private SplitGroup group;

    @Column
    private Float total;

}
