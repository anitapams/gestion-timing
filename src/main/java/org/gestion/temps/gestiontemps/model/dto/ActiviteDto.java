package org.gestion.temps.gestiontemps.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActiviteDto {
    private Long id;
    private String nomActivite;
    private Integer numero;
}
