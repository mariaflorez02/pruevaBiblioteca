
package com.app.biblioteca.interfaces;

import com.app.biblioteca.entities.prestamo;
import com.app.biblioteca.entities.usuarios;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;


public interface IUsuariosRepository extends MongoRepository<usuarios, String> {
    @Query(value= "{id : ?0}")
    List<usuarios> getbyId(String id);

    @Query(value= "{email : ?0}")
    List<usuarios> getbyemail(String email);
}
