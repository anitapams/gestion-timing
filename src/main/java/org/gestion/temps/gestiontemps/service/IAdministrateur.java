package org.gestion.temps.gestiontemps.service;

import org.gestion.temps.gestiontemps.exception.TimingException;
import org.gestion.temps.gestiontemps.model.dto.AdministrateurDto;
import org.gestion.temps.gestiontemps.model.entities.Administrateur;

import java.util.List;

public interface IAdministrateur extends IEntity<AdministrateurDto>{

    int saveAdministrateur(AdministrateurDto administrateurDto) throws TimingException;
    public Administrateur searchByNom(String nom) throws TimingException;

    public AdministrateurDto searchByNomDto(String nom) throws TimingException;

    List<AdministrateurDto> searchAdministrateurByKeyword(String keyword);

    AdministrateurDto updateAdministrateurDto(AdministrateurDto administrateurDto) throws TimingException;

    public int deleteById(Long id) throws TimingException;

    public int deleteByNom(String nom) throws TimingException;

    public Administrateur searchByEmail(String email) throws TimingException;

    List<AdministrateurDto> listAdministrateurs();
}
