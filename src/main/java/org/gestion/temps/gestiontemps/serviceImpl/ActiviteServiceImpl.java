package org.gestion.temps.gestiontemps.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.gestion.temps.gestiontemps.exception.ErrorInfo;
import org.gestion.temps.gestiontemps.exception.TimingException;
import org.gestion.temps.gestiontemps.exception.TimingTechnicalException;
import org.gestion.temps.gestiontemps.mapper.ActiviteMapper;
import org.gestion.temps.gestiontemps.model.dto.ActiviteDto;
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

@Slf4j
@Service
@Transactional
public class ActiviteServiceImpl implements IActivite {

    @Autowired
    private ActiviteRepository activiteRepository;
    @Autowired(required = false)
    private ActiviteMapper activiteMapper;
    @Autowired
    private Activite activite;
    @Autowired
    private ActiviteDto activiteDto;


    @Override
    public Activite searchActiviteByNom(String nomActivite) throws TimingException {
        return null;
    }

    @Override
    public ActiviteDto searchActiviteByNomDto(String nomActivite) throws TimingException {
        return null;
    }

    @Override
    public Activite searchActiviteByNumero(Integer number) throws TimingException {
        return null;
    }

    @Override
    public List<ActiviteDto> listActivites() {
        return activiteRepository.findAll().stream().map(activite -> activiteMapper.toDto(activite))
                .collect(Collectors.toList());
    }

    @Override
    public ActiviteDto searchActiviteByNumberDto(Integer number) throws TimingException {
        return activiteRepository.findActiviteByNumber(number).orElseThrow(() -> new TimingTechnicalException("Activite introuvable", Status.NOT_FOUND));
    }

    @Override
    public Activite searchActiviteById(Long id) throws TimingException {
        CHeckNull.checkIdActivite(id);
        return activiteRepository.findActiviteById(id).orElseThrow(() -> new TimingException(ErrorInfo.RESSOURCE_NOT_FOUND));
    }

    @Override
    public void deleteByNumber(Integer number) throws TimingException {
        Activite activite = searchActiviteByNumero(number);
        activiteRepository.deleteById(activite.getId());
    }

    @Override
    public int deleteById(Long id) throws TimingException {
        Activite activite = searchActiviteById(id);
        activiteRepository.deleteById(activite.getId());
        return 1;
    }

    @Override
    public void deleteByNom(String nomActivite) throws TimingException {

    }


    //Les deux méthodes ci-dessous vont ensemble. Mais lors de la compilation une erreur est détectée et elle provient du 'findActiviteByNom' de la 2ème méthode.
   @Override
    public ActiviteDto addData(ActiviteDto activiteDto) throws TimingException, FileNotFoundException {
        CHeckNull.checkNomActivite(activiteDto.getNomActivite());
        checkNomActiviteIsAlreadyUsed(activiteDto.getNomActivite());
        return activiteMapper.toDto(activiteRepository.save(activiteMapper.toEntity(activiteDto)));
    }


    private void checkNomActiviteIsAlreadyUsed(String nomActivite) throws TimingException {
        //Le 'findActiviteByNom' est écrit dans le repository
        if (activiteRepository.findActiviteByNom(nomActivite).isPresent()) throw new TimingException(ErrorInfo.REFERENCE_RESSOURCE_ALREADY_USED);
    }


    @Override
    public ActiviteDto searchById(Long id) throws TimingException {
        return activiteMapper.toDto(activiteRepository.findById(id).orElseThrow(() -> new TimingException(ErrorInfo.RESSOURCE_NOT_FOUND)));
    }

    @Override
    public ActiviteDto update(ActiviteDto activiteDto) throws TimingException {
        Activite entity = searchActiviteByNom(activiteDto.getNomActivite());
        activiteMapper.copy(activiteDto, entity);
        return activiteMapper.toDto(activiteRepository.save(entity));
    }

    @Override
    public List<ActiviteDto> getAll() {
        return null;
    }
}
