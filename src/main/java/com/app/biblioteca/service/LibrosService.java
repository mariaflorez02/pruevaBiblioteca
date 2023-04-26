
package com.app.biblioteca.service;


import com.app.biblioteca.dto.RespuestaDTO;
import com.app.biblioteca.entities.libros;
import com.app.biblioteca.entities.prestamo;
import com.app.biblioteca.interfaces.ILibrosRepository;

import com.app.biblioteca.interfaces.IPrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LibrosService {

    @Autowired
    ILibrosRepository repository;

    @Autowired
    IPrestamoRepository movieRepository;

    public Iterable<libros> get() {
        Iterable<libros> libros = repository.findAll();
        return libros;
    }

    public Iterable<libros> getByTipo(String tipo) {
        Iterable<libros> libros = repository.getbyTipo(tipo);
        return libros;
    }

    public RespuestaDTO create(libros request) {

        libros newLibro = repository.save(request);

        RespuestaDTO responseDto = new RespuestaDTO();
        responseDto.stado=true;
        responseDto.mensaje="libro agregado correctamente";
        responseDto.id= newLibro.getId();
        return responseDto;

    }

    public libros update(libros libros) {
        libros librosToUpdate = new libros();
        if (repository.existsById(libros.getId())) {
            librosToUpdate = libros;
            repository.save(librosToUpdate);
        }
        return librosToUpdate;
    }

    public Boolean delete(String id) {
        repository.deleteById(id);
        Boolean deleted = true;
        return deleted;
    }
}
