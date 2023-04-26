
package com.app.biblioteca.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;



@Document("prestamo")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class prestamo implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private String id;
    private List<libros> libro;
    private List<usuarios> usuario;
    private String fechaI;
    private String fechaF;
    
    
}
