package org.gestion.temps.gestiontemps.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrateur {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nom", nullable = false, length = 50)
    private String nom;

    @Column(name = "prenom", nullable = false, length = 50)
    private String prenom;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "datenaissance", nullable = false)
    private Date datenaissance;

    @Column(name = "telephone", nullable = false, length = 20)
    private String telephone;

    @Column(name = "rôle", nullable = false, length = 30)
    private String rôle;
}
