package org.gestion.temps.gestiontemps.service;

import net.sf.jasperreports.engine.JRException;
import org.gestion.temps.gestiontemps.exception.TimingException;

import java.io.FileNotFoundException;
import java.util.List;

public interface IEntity<D> {
    public D addData(D dto) throws TimingException, FileNotFoundException;

    public D searchById(Long id) throws TimingException;

    public D update(D dto) throws TimingException;

    public List<D> getAll();
}
