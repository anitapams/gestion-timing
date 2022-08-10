package org.gestion.temps.gestiontemps.repository;

import org.gestion.temps.gestiontemps.model.dto.ActiviteDto;
import org.gestion.temps.gestiontemps.model.entities.Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActiviteRepository extends JpaRepository<Activite, Long> {

    Optional<Activite> findActiviteById(Long id);
    Optional<ActiviteDto> findActiviteByNumber(Integer number);
    //si j'enlève la méthode ci-dessous le projet va compiler sans erreur
    Optional<Activite> findActiviteByNom(String nomActivite);
}
