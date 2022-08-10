package org.gestion.temps.gestiontemps.mapper;

import org.gestion.temps.gestiontemps.model.dto.UtilisateurDto;
import org.gestion.temps.gestiontemps.model.entities.Utilisateur;
import org.mapstruct.Mapper;

@Mapper
public interface UtilisateurMapper extends EntityMapper<UtilisateurDto, Utilisateur> {
}
