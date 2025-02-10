package com.sajan.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Ships")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ships {
    @Id
    @Column(length=30)
    private String name;
    @ManyToOne
    @JoinColumn(name="class", referencedColumnName = "className")
    private Classes className;
    private Integer launched;

}
