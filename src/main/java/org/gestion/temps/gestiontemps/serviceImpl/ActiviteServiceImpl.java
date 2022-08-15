package org.gestion.temps.gestiontemps.serviceImpl;


import org.gestion.temps.gestiontemps.exception.ErrorInfo;
import org.gestion.temps.gestiontemps.exception.TimingException;
import org.gestion.temps.gestiontemps.exception.TimingTechnicalException;
import org.gestion.temps.gestiontemps.model.entities.Activite;
import org.gestion.temps.gestiontemps.repository.ActiviteRepository;
import org.gestion.temps.gestiontemps.service.IActivite;
import org.gestion.temps.gestiontemps.utils.CHeckNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zalando.problem.Status;

import javax.transaction.Transactional;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ActiviteServiceImpl implements IActivite {

    @Autowired
    private ActiviteRepository activiteRepository;


    @Override
    public Activite saveActivite(Activite activite) throws TimingException {

        Activite act = activiteRepository.save(activite);
        if (act == null) throw new TimingException("Informations incorrectes", Status.INTERNAL_SERVER_ERROR);
        return act;
    }

    @Override
    public Activite updateActivite(Activite activite) throws TimingException {

        Activite actUpdate = activiteRepository.save(activite);
        if (actUpdate == null) {
            throw new TimingException("Informations incorrectes", Status.INTERNAL_SERVER_ERROR);
        }
        return actUpdate;
    }

    @Override
    public List<Activite> listActivites() {
        return activiteRepository.findAll();
    }

    @Override
    public int deleteActivite(Long id) throws TimingException {
        activiteRepository.deleteById(getActiviteById(id).getId());
        return 1;
    }

    @Override
    public Activite getActiviteByNumero(Long numero) throws TimingException {
        return activiteRepository.findById(numero).orElseThrow(() -> new TimingException("Activite introuvable", Status.NOT_FOUND));
    }

    @Override
    public Activite getActiviteById(Long id) throws TimingException {
        return activiteRepository.findById(id).orElseThrow(() -> new TimingException("Activite introuvable", Status.NOT_FOUND));
    }

}
