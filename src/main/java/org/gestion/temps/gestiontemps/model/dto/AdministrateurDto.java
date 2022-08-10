package org.gestion.temps.gestiontemps.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdministrateurDto {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private Date datenaissance;
    private String telephone;
    private String rôle;
}
