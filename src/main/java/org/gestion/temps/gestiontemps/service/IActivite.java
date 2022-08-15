package org.gestion.temps.gestiontemps.service;

import org.gestion.temps.gestiontemps.exception.TimingException;
import org.gestion.temps.gestiontemps.model.entities.Activite;

import java.util.List;

public interface IActivite {

    Activite saveActivite (Activite activite) throws TimingException;
    Activite updateActivite (Activite activite) throws TimingException;
    List<Activite> listActivites();
    int deleteActivite(Long id) throws TimingException;
    Activite getActiviteByNumero(Long numero) throws TimingException;
    Activite getActiviteById(Long id) throws TimingException;
}