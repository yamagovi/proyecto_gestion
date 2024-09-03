/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GestionTelecomunicaciones.Gestion.modell;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author Control
 */

@Entity
@Data

public class usuario {
    //llave primaria y luego los atributos
    @Id
    // identificar las columnas, especificar el tipo de contenido y caracteristicas
    @Column (name="id")//estos son nombres que le puedo colocar en el fronend
    private Long iduser;// estos son nombres originales
    
    @Column (unique=true, name="user", nullable=false, length=20)
    private String nomuser;
        
    // true hace que el correo sea unico y que no se repitan
    @Column (name="clave", nullable=false, length=20)
    private String clave;
    
    // Constructor por defecto
    public usuario() {}
}
    