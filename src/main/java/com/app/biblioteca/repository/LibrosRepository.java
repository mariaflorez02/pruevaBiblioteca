
package com.app.biblioteca.repository;

import com.app.biblioteca.entities.libros;
import com.app.biblioteca.interfaces.ILibrosRepository;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class LibrosRepository {
    
    @Autowired
    ILibrosRepository repository;
    
    public Iterable<libros> getAll(){
        return repository.findAll();
    }

    public Iterable<libros> getByTipo(String tipo) {
        return repository.getbyTipo(tipo);
    }
    
    public Optional<libros> findById(String id){
        Optional<libros> response= repository.findById(id);
        return response;
    }
    
    public Boolean existsById(String id){
        return repository.existsById(id);
    }
    
    public void deleteById(String id){
        repository.deleteById(id);
    }
    
    public libros save(libros category){
        return repository.save(category);
    }
    
}
