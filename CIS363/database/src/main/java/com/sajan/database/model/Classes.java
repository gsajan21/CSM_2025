package com.sajan.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Classes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Classes {
    @Id
    @Column(length = 20)
    private String className;
    @Column(length=5, nullable = false)
    private String type;
    @Column(length=20, nullable = false)
    private String country;
    private Integer numGuns;
    private Double bore;
    private Integer displacement;
    @OneToMany(mappedBy = "className", cascade = CascadeType.ALL)
    private List<Ships> ships;
}
