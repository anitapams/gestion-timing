package org.gestion.temps.gestiontemps.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activite {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

   @Column(name = "nomActivite", nullable = false, length = 50)
   private String nomActivite;

    @Column(name = "numero", nullable = false)
    private Integer numero;

}
