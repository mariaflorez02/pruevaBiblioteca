
package com.app.biblioteca.service;


import com.app.biblioteca.dto.RespuestaDTO;
import com.app.biblioteca.entities.usuarios;
import com.app.biblioteca.repository.UsuariosRepository;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class UsuariosService {

    @Autowired
    UsuariosRepository repository;


    public Iterable<usuarios> get() {
        Iterable<usuarios> response = repository.getAll();
        return response;
    }


    public RespuestaDTO create(usuarios request) {

        usuarios newusuario = repository.save(request);
        RespuestaDTO responseDto = new RespuestaDTO();
        responseDto.stado=true;
        responseDto.mensaje=" usuario creado correctamente";
        responseDto.id= newusuario.getId();
        return responseDto;

    }



    public usuarios update(usuarios usuario) {
        usuarios usuarioToUpdate = new usuarios();

        Optional<usuarios> currentusuario = repository.findById(usuario.getId());
        if (!currentusuario.isEmpty()) {
            usuarioToUpdate= usuario;
            usuarioToUpdate = repository.save(usuarioToUpdate);
        }
        return usuarioToUpdate;
    }

    public Boolean delete(String id) {
        repository.deleteById(id);
        Boolean deleted = true;
        return deleted;
    }


}
