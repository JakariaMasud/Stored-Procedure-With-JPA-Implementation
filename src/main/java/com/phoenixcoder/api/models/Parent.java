package com.phoenixcoder.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "parents")
public class Parent {
    @Id
    @GeneratedValue
    private int id;
    private String fatherName;
    private String motherName;
    private String address;
    @OneToMany(mappedBy = "parent")
    private List<Child> children;
}
