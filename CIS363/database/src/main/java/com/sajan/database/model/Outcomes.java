package com.sajan.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Outcomes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Outcomes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="ship", referencedColumnName="name")
    private Ships ship;
    @ManyToOne
    @JoinColumn(name="battle", referencedColumnName = "name")
    private Battles battle;
    @Column(length = 10, nullable = false)
    private String result;
}
