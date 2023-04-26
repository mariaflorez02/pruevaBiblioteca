
package com.app.biblioteca.entities;


import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document("usuarios")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class usuarios implements Serializable {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private String id;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String email;



    //@JsonIgnore
    //@OneToMany(cascade={CascadeType.PERSIST},mappedBy="messa<ge")
    //@JsonIgnoreProperties("message")
//    @OneToMany(cascade={CascadeType.PERSIST},mappedBy="client")
//    @JsonIgnoreProperties({"quadbike","client"})
//    private List<Message> messages;
//
//    @OneToMany(cascade={CascadeType.PERSIST},mappedBy="client")
//    @JsonIgnoreProperties("client")
//    private List<Reservation> reservations;
    
    
    
}
