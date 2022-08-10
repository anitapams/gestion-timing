package org.gestion.temps.gestiontemps.mapper;

import org.gestion.temps.gestiontemps.model.dto.AdministrateurDto;
import org.gestion.temps.gestiontemps.model.entities.Administrateur;
import org.mapstruct.Mapper;

@Mapper
public interface AdministrateurMapper extends EntityMapper<AdministrateurDto, Administrateur>{
}
