package org.gestion.temps.gestiontemps.repository;


import org.gestion.temps.gestiontemps.model.entities.Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActiviteRepository extends JpaRepository<Activite, Long> {

}
