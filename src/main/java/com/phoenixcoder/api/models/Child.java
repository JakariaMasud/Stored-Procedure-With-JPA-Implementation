package com.phoenixcoder.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "childs")
public class Child {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @ManyToOne(cascade = CascadeType.ALL)
    private Parent parent;
}
