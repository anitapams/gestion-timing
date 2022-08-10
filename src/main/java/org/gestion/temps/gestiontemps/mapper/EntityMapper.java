package org.gestion.temps.gestiontemps.mapper;

import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.Set;

public interface EntityMapper <D, E>{

    E toEntity(D dto);

    D toDto(E entity);

    void copy(D dto, @MappingTarget E entity);

    List<E> toEntity(List<D> dtoList);

    List<D> toDto(List<E> entityList);

    Set<D> toDto(Set<E> entityList);
}
