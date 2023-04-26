
package com.app.biblioteca.service;

import com.app.biblioteca.dto.RespuestaDTO;
import com.app.biblioteca.entities.prestamo;
import com.app.biblioteca.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class PrestamoService {



    @Autowired
    PrestamoRepository repository;

    public Iterable<prestamo> get() {
        Iterable<prestamo> response = repository.getAll();
        return response;
    }

    public Optional<prestamo> getById(String id) {
        Optional<prestamo> response = repository.findById(id);
        return response;
    }
    public RespuestaDTO create(prestamo request) {

        prestamo newprestamo = repository.save(request);

        RespuestaDTO responseDto = new RespuestaDTO();
        responseDto.stado=true;
        responseDto.mensaje="prestamo hecho correctamente";
        responseDto.id= newprestamo.getId();
        return responseDto;

    }


    public prestamo update(prestamo prestamo) {
        prestamo prestamoToUpdate = new prestamo();

        Optional<prestamo> currentprestamo = repository.findById(prestamo.getId());
        if (!currentprestamo.isEmpty()) {
            prestamoToUpdate = prestamo;
            prestamoToUpdate=repository.save(prestamoToUpdate);
        }
        return prestamoToUpdate;
    }

    public Boolean delete(String id) {
        repository.deleteById(id);
        Boolean deleted = true;
        return deleted;
    }
}
