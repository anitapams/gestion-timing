package org.gestion.temps.gestiontemps.presentation.api;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

import org.gestion.temps.gestiontemps.exception.TimingException;
import org.gestion.temps.gestiontemps.model.dto.ActiviteDto;
import org.gestion.temps.gestiontemps.service.IActivite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

@RequestMapping("/api/activite")
@RestController
@Slf4j
@Api("activite")
public class ActiviteRestController {

    @Autowired
    private IActivite iActivite;


    /*Sans le try ... catch l'enregistrement d'une activité réussi sur postman mais pas dans la base de données. Ici la méthode
    'addData' a un problème*/

    @PostMapping("/saveactivity")
    public /*ResponseEntity<Void>*/ String save(@RequestBody ActiviteDto activiteDto) throws TimingException, FileNotFoundException {
        try {
            iActivite.addData(activiteDto);
        } catch (TimingException exception) {
            return exception.getMessage();
        }
        return "Enregistrement réussi";

    }

    //Ici le test sur postman ne donne pas je ne sais pas si j'ai bien écrit le service 'searchActiviteByNumberDto'
    @GetMapping("/{numero}/findactivity")
    public ResponseEntity<?> findByNumero(@PathVariable("numero") Integer numero) throws TimingException {

        try {
            return ResponseEntity.ok(iActivite.searchActiviteByNumberDto(numero));
        }catch (TimingException exception) {
            return new ResponseEntity<String>(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
        /*ActiviteDto activite = iActivite.searchActiviteByNumberDto(numero);
        return ResponseEntity.ok(activite);*/
    }

    @GetMapping("/all")
    public ResponseEntity<List<ActiviteDto>> getAllActivite() {

        return ResponseEntity.ok(iActivite.listActivites());
    }

}
