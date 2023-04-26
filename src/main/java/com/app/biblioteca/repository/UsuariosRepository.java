
package com.app.biblioteca.repository;

import com.app.biblioteca.entities.usuarios;
import com.app.biblioteca.interfaces.IUsuariosRepository;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UsuariosRepository {
    
    @Autowired
    IUsuariosRepository repository;
    
    public Iterable<usuarios> getAll(){
        return repository.findAll();
    }
    
    public Optional<usuarios> findById(String id){
        Optional<usuarios> response= repository.findById(id);
        return response;
    }

    public Iterable<usuarios> getById(String id){
        return repository.getbyId(id);
    }

    
    public Boolean existsById(String id){
        return repository.existsById(id);
    }
    
    public void deleteById(String id){
        repository.deleteById(id);
    }
    
    public usuarios save(usuarios client){
        return repository.save(client);
    }
    
}
