package org.gestion.temps.gestiontemps.service;

import org.gestion.temps.gestiontemps.exception.TimingException;
import org.gestion.temps.gestiontemps.model.dto.UtilisateurDto;
import org.gestion.temps.gestiontemps.model.entities.Utilisateur;

import java.util.List;

public interface IUtilisateur extends IEntity<UtilisateurDto>{

    int saveUtilisateur(UtilisateurDto utilisateurDto) throws TimingException;
    public Utilisateur searchByEmail(String email) throws TimingException;

    public UtilisateurDto searchByNomDto(String nom) throws TimingException;

    public Utilisateur searchByNom(String nom) throws TimingException;

    List<UtilisateurDto> searchUtilisateurByKeyword(String keyword);

    UtilisateurDto updateUtilisateurDto(UtilisateurDto utilisateurDto) throws TimingException;

    public int deleteByEmail(String email) throws TimingException;

    public int deleteByNom(String nom) throws TimingException;

    List<UtilisateurDto> listUtilisateurs();
}
