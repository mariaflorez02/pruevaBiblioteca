
package com.app.biblioteca.interfaces;

import com.app.biblioteca.entities.libros;
import com.app.biblioteca.entities.prestamo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface ILibrosRepository extends MongoRepository<libros, String> {
    @Query(value= "{tipo : ?0}")
    List<libros> getbyTipo(String tipo);
}
