
package com.app.biblioteca.interfaces;

import com.app.biblioteca.entities.prestamo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface IPrestamoRepository extends MongoRepository<prestamo, String> {
    @Query(value= "{fechaI : ?0}")
   List<prestamo> getbyfechaI(String fechaI);

    @Query(value= "{id : ?0}")
    List<prestamo> getbyId(String id);
}
