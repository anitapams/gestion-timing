package org.gestion.temps.gestiontemps.presentation.api;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

import org.gestion.temps.gestiontemps.exception.TimingException;
import org.gestion.temps.gestiontemps.model.entities.Activite;
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




    @PostMapping("/saveactivity")
    public String save(@RequestBody Activite acti) throws TimingException {
        try {
            iActivite.saveActivite(acti);
        } catch (TimingException exception) {
            return exception.getMessage();
        }
        return "Enregistrement réussi";

    }

    @GetMapping("/{id}/data")
    public ResponseEntity<?> getActiviteById (@PathVariable("id") Long id) throws TimingException {

        try {
            return ResponseEntity.ok(iActivite.getActiviteById(id));
        }catch (TimingException exception) {
            return new ResponseEntity<String>(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/all")
    public ResponseEntity<List<Activite>> getAllActivite() {
        return ResponseEntity.ok(iActivite.listActivites());
    }


    @GetMapping("/{id}/delete")
    public ResponseEntity<?> deleteActivite(@PathVariable("id") Long id) throws TimingException {
        try {
            return ResponseEntity.ok(iActivite.getActiviteById(id));
        } catch (TimingException exception) {
            return new ResponseEntity<String>(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/{activite}/search")
    public ResponseEntity<?> getActiviteByNumero(@PathVariable("activite") Long numero) throws TimingException {

        try {
            return ResponseEntity.ok(iActivite.getActiviteByNumero(numero));
        }catch (TimingException exception) {
            return new ResponseEntity<String>(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }



}
