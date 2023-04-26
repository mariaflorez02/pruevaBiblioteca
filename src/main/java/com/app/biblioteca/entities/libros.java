
package com.app.biblioteca.entities;


import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("libros")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class libros implements Serializable {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private String id;
    private String titulo;
    private String autor;
    private String editorial;
    private Integer añoPublicacion;
    private String tipo;
    private Integer cantidad;


    //@OneToMany(cascade={CascadeType.PERSIST},mappedBy="category")
    //@JsonIgnoreProperties("category")
    //private List<Quadbike> quadbikes;
    
    
    
    
    
}
