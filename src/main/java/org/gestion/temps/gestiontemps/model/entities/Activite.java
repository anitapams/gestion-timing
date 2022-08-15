package org.gestion.temps.gestiontemps.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nomActivite", nullable = false, length = 50)
    private String nomActivite;

    @Column(name = "numero", nullable = false)
    private Long numero;

}
