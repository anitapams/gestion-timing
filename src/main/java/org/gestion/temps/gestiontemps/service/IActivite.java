package org.gestion.temps.gestiontemps.service;

import org.gestion.temps.gestiontemps.exception.TimingException;
import org.gestion.temps.gestiontemps.model.dto.ActiviteDto;
import org.gestion.temps.gestiontemps.model.entities.Activite;

import java.util.List;

public interface IActivite extends IEntity<ActiviteDto>{
    Activite searchActiviteByNom(String nomActivite) throws TimingException;

    ActiviteDto searchActiviteByNomDto(String nomActivite) throws TimingException;

    Activite searchActiviteByNumero(Integer number) throws TimingException;

    List<ActiviteDto> listActivites();

    ActiviteDto searchActiviteByNumberDto(Integer number) throws TimingException;

    Activite searchActiviteById(Long id) throws TimingException;

    public void deleteByNumber(Integer number) throws TimingException;

    public int deleteById(Long id) throws TimingException;


    public void deleteByNom(String nomActivite) throws TimingException;
}
