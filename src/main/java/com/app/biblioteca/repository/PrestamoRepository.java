
package com.app.biblioteca.repository;

import com.app.biblioteca.entities.prestamo;
import com.app.biblioteca.interfaces.IPrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PrestamoRepository {
    
    @Autowired
    IPrestamoRepository repository;
    
    public Iterable<prestamo> getAll(){
        return repository.findAll();
    }
    public Iterable<prestamo>  getById(String id){
        return repository.getbyId(id);
    }

    public List<prestamo> getByfechaI(String fechaI){
        return repository.getbyfechaI(fechaI);
    }
    
    public Optional<prestamo> findById(String id){
        Optional<prestamo> response= repository.findById(id);
        return response;
    }
    
    public Boolean existsById(String id){
        return repository.existsById(id);
    }
    
    public void deleteById(String id){
        repository.deleteById(id);
    }
    
    public prestamo save(prestamo prestamo){
        return repository.save(prestamo);
    }
    
}
