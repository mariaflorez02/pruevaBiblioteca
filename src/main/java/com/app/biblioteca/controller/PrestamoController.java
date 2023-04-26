
package com.app.biblioteca.controller;


import com.app.biblioteca.dto.RespuestaDTO;
import com.app.biblioteca.entities.prestamo;
import com.app.biblioteca.entities.usuarios;
import com.app.biblioteca.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/prestamo")
@CrossOrigin(origins = "*")
public class PrestamoController {

    @Autowired
    PrestamoService service;

    @GetMapping("")
    public Iterable<prestamo> get() {
        return service.get();
    }

    @GetMapping("/{id}")
    public Optional<prestamo> getById(@PathVariable("id") String id) {
        return service.getById(id);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public RespuestaDTO create(@RequestBody prestamo request) {
        return service.create(request);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public prestamo update(@RequestBody prestamo request) {
        return service.update(request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") String id) {
        service.delete(id);
    }

}
