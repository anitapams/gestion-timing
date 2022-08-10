package org.gestion.temps.gestiontemps.utils;

import org.gestion.temps.gestiontemps.exception.ErrorInfo;
import org.gestion.temps.gestiontemps.exception.TimingException;

import java.util.Objects;

public class CHeckNull {

    public static void checkNomActivite(String nomActivite) throws TimingException {
        if (Objects.isNull(nomActivite)) {
            throw new TimingException(ErrorInfo.REFERENCE_RESSOURCE_REQUIRED);
        }
    }

    public static void checkIdActivite(Long id) throws TimingException {
        if (Objects.isNull(id)) {
            throw new TimingException(ErrorInfo.REFERENCE_RESSOURCE_REQUIRED);
        }
    }

    public static void checkId(Long id) throws TimingException {
        if (Objects.isNull(id)) {
            throw new TimingException(ErrorInfo.REFERENCE_RESSOURCE_REQUIRED);
        }
    }

    public static void checkNomAdministrateur(String nom) throws TimingException {
        if (Objects.isNull(nom)) {
            throw new TimingException(ErrorInfo.REFERENCE_RESSOURCE_REQUIRED);
        }
    }

    public static void checkEmail(String email) throws TimingException {
        if (Objects.isNull(email)) {
            throw new TimingException(ErrorInfo.REFERENCE_RESSOURCE_REQUIRED);
        }
    }

    public static void checkNomUtilisateur(String nom) throws TimingException {
        if ( (Objects.isNull(nom)))
        {throw new TimingException(ErrorInfo.REFERENCE_RESSOURCE_REQUIRED);
        }
    }
}
