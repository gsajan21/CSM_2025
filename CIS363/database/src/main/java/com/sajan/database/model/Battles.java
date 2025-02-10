package com.sajan.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="Battles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Battles {
    @Id
    @Column(nullable = false, length = 30)
    private String name;
    @Column(nullable = false)
    private LocalDate date;

    @OneToMany(mappedBy = "battle", cascade = CascadeType.ALL)
    private List<Outcomes> outcomes;

}
