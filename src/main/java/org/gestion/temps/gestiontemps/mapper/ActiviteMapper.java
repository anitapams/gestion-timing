package org.gestion.temps.gestiontemps.mapper;

import org.gestion.temps.gestiontemps.model.dto.ActiviteDto;
import org.gestion.temps.gestiontemps.model.entities.Activite;
import org.mapstruct.Mapper;

@Mapper
public interface ActiviteMapper extends EntityMapper<ActiviteDto, Activite>{
}
